package com.pyur.servicerouter.enghouse.converter;

import de.xconnect.bus.api.InhouseResponse;

import javax.xml.bind.JAXBElement;

/**
 * Interface RequestResponseConverter used to convert requests and responses.
 *
 * @param <REQUEST>
 *     the request type.
 * @param <RESPONSE>
 *     the response type.
 */
public interface RequestResponseConverter<REQUEST, RESPONSE> {

  /**
   * Converts the given request object to a {@link JAXBElement} object that wraps the given request.
   *
   * @param request
   *     the request to convert.
   * @return the converted request.
   */
  JAXBElement<REQUEST> convertRequest (REQUEST request);

  /**
   * Converts the given response to a {@link JAXBElement} wrapped object.
   *
   * @param response
   *     the response to wrap.
   * @return the converted response.
   */
  InhouseResponse convertResponse (JAXBElement<RESPONSE> response);

}
