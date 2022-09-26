package com.pyur.servicerouter.admin.dto;

import lombok.Data;

@Data
public class RouteNewDto {
  private String name;
  private String defaultUri;
  private String requestUrl;
  private Boolean defaultRoute;
}
