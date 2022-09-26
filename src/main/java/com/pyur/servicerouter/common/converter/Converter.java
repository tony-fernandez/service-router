package com.pyur.servicerouter.common.converter;

import org.apache.commons.collections4.CollectionUtils;

import java.util.List;

import static java.util.Collections.emptyList;
import static java.util.stream.Collectors.toList;

public interface Converter<I, O> {

  /**
   * Converts the given input to the required output.
   *
   * @param input
   *     the input to convert.
   * @return the converted output.
   */
  O convert (I input);

  /**
   * Converts the given list of input items to the required list of output items.
   *
   * @param input
   *     the input items.
   * @return the output items.
   */
  default List<O> convert (List<I> input) {
    if (CollectionUtils.isEmpty(input)) {
      return emptyList();
    }
    return input.stream().map(this::convert).collect(toList());
  }

}
