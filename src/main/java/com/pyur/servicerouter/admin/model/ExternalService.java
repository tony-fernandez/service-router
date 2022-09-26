package com.pyur.servicerouter.admin.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.CascadeType.ALL;

@Getter
@Setter
@Entity
@Table(name = "service")
public class ExternalService {

  @Id
  @GeneratedValue
  private Long id;

  @Column(name = "context_path", columnDefinition = "varchar(255)")
  private String contextPath;

  @Column(name = "endpoint", columnDefinition = "varchar(255)", nullable = false)
  private String endpoint;

  @Column(name = "name", columnDefinition = "varchar(80)", nullable = false)
  private String name;

  @OneToMany(cascade = ALL, mappedBy = "externalService")
  private List<Route> routes = new ArrayList<>();

}
