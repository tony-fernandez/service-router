package com.pyur.servicerouter.admin.repository;

import com.pyur.servicerouter.admin.model.ExternalService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExternalServiceRepository extends JpaRepository<ExternalService, Long> {

}
