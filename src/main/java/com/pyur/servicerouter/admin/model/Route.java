package com.pyur.servicerouter.admin.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import static javax.persistence.FetchType.LAZY;

@Getter
@Setter
@Entity
@Table(name = "route", indexes = {
    @Index(columnList = "name", name = "route_name_index", unique = true)
})
public class Route {

  @Id
  @GeneratedValue
  private Long id;

  @Column(name = "name", columnDefinition = "varchar(20)", nullable = false)
  private String name;

  @Column(name = "default_uri", columnDefinition = "varchar(255)", nullable = false)
  private String defaultUri;

  @Column(name = "request_url", columnDefinition = "varchar(255)", nullable = false)
  private String requestUrl;

  @Column(name = "is_default", nullable = false)
  private Integer defaultRoute;

  @ManyToOne(fetch = LAZY)
  @JoinColumn(name = "server_id")
  private ExternalService externalService;

}
