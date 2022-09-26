package com.pyur.servicerouter.enghouse.service;

import de.xconnect.bus.api.InhouseResponse;
import de.xconnect.bus.api.InhouseResponseCode;

public interface InHouseRouter<T> {

  /**
   * Routes the given request.
   *
   * @param request
   *     the request to route.
   * @return the response from the target service.
   */
  InhouseResponse route (T request);

  /**
   * Returns an error with the given description.
   *
   * @param description
   *     the description.
   * @return the error.
   */
  default InhouseResponse error (String description) {
    InhouseResponse response = new InhouseResponse();
    response.setDescription(description);
    response.setInhouseResponseCode(InhouseResponseCode.ERROR);
    return response;
  }

}
