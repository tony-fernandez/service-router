package com.pyur.servicerouter.admin.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class RouteDto extends RouteNewDto {
  private Long id;
}
