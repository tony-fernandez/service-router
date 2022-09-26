package com.pyur.servicerouter.admin.service;

import com.pyur.servicerouter.admin.converter.ExternalServiceConfigItemConverter;
import com.pyur.servicerouter.admin.model.ExternalService;
import com.pyur.servicerouter.admin.repository.ExternalServiceRepository;
import com.pyur.servicerouter.common.configuration.ExternalServiceConfiguration;
import com.pyur.servicerouter.common.configuration.ExternalServiceConfiguration.ExternalServiceConfigItem;
import com.pyur.servicerouter.enghouse.exception.InvalidServerConfiguration;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.toMap;
import static org.apache.commons.collections4.CollectionUtils.isEmpty;

@Slf4j
@Service
@RequiredArgsConstructor
public class ExternalServiceManager {

  private static final String MISSING_CONFIGURATION = "The configuration for external service Enghouse is missing.";

  private final ExternalServiceConfigItemConverter externalServiceConfigItemConverter;
  private final ExternalServiceConfiguration externalServiceConfiguration;
  private final ExternalServiceRepository externalServiceRepository;

  private List<ExternalService> externalServices;
  private Map<String, ExternalService> externalServiceMap;

  @PostConstruct
  public void init () {
    log.info("Retrieving existing external services from database.");
    externalServices = externalServiceRepository.findAll();

    if (isEmpty(externalServices)) {
      List<ExternalServiceConfigItem> externalServiceConfigItems = externalServiceConfiguration.getExternalServices();
      externalServices = externalServiceRepository
          .saveAll(externalServiceConfigItemConverter.convert(externalServiceConfigItems));
      log.info("{} external services persisted.", externalServices.size());
    }
    externalServiceMap = externalServices.stream().collect(toMap(ExternalService::getName, identity()));
  }

  /**
   * Get the service by the given name.
   *
   * @param name
   *     the service name.
   * @return the external service by the given name.
   */
  public ExternalService getExternalService (String name) {
    return Optional.ofNullable(externalServiceMap.get(name))
        .orElseThrow(() -> new InvalidServerConfiguration(MISSING_CONFIGURATION));
  }

  /**
   * Gets all the external services.
   *
   * @return the external services.
   */
  public List<ExternalService> getExternalServices () {
    if (isEmpty(externalServices)) {
      init();
    }
    return externalServices;
  }

}
