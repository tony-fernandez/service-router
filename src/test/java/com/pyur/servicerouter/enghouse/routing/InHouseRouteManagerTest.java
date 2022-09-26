package com.pyur.servicerouter.enghouse.routing;

import com.pyur.servicerouter.AbstractIntegrationTest;
import com.pyur.servicerouter.common.exception.InvalidRequestException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class InHouseRouteManagerTest extends AbstractIntegrationTest {

  @Autowired
  private InHouseRouteProvider enghouseRouteProvider;

  @Test
  public void givenAuftragWithNullExterneAuftragsnummerShouldThrowInvalidRequestException() {
    assertThrows(InvalidRequestException.class, () -> enghouseRouteProvider.provide(null));
  }

  @Test
  public void givenAuftragWithEmptyExterneAuftragsnummerShouldThrowInvalidRequestException() {
    assertThrows(InvalidRequestException.class, () -> enghouseRouteProvider.provide(""));
  }

  @Test
  public void givenValidExterneAuftragsnummerNotInConfigurationShouldReturnDefaultUrl() {
    String url = enghouseRouteProvider.provide("VALID_NOT_FOUND");

    assertThat(url, is(equalTo("http://localhost:4040/server/wswbservice")));
  }

  @Test
  public void givenValidExterneAuftragsnummerInConfigurationShouldReturnUrl() {
    String url = enghouseRouteProvider.provide("QA2_ID");

    assertThat(url, is(equalTo("http://localhost:5050/server/wswbservice")));
  }

}