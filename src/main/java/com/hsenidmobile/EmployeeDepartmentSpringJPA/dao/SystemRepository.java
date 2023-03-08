package com.hsenidmobile.EmployeeDepartmentSpringJPA.dao;

import com.hsenidmobile.EmployeeDepartmentSpringJPA.model.System;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SystemRepository extends CrudRepository<System,Long> {


}