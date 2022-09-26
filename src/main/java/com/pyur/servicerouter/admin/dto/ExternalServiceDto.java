package com.pyur.servicerouter.admin.dto;

import lombok.Data;

@Data
public class ExternalServiceDto {
  private Long id;
  private String contextPath;
  private String endpoint;
  private String name;
}
