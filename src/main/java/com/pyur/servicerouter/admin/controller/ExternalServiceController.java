package com.pyur.servicerouter.admin.controller;

import com.pyur.servicerouter.admin.converter.ExternalServiceConverter;
import com.pyur.servicerouter.admin.dto.ExternalServiceDto;
import com.pyur.servicerouter.admin.service.ExternalServiceManager;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "admin/external-services", produces = MediaType.APPLICATION_JSON_VALUE)
public class ExternalServiceController {

  private final ExternalServiceConverter externalServiceConverter;
  private final ExternalServiceManager externalServiceManager;

  @GetMapping()
  public ResponseEntity<List<ExternalServiceDto>> getServices() {
    return ResponseEntity.ok(externalServiceConverter.convert(externalServiceManager.getExternalServices()));
  }

}
