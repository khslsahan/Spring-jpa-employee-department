package com.hsenidmobile.EmployeeDepartmentSpringJPA.dao;

import com.hsenidmobile.EmployeeDepartmentSpringJPA.model.Department;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepository  extends CrudRepository<Department,Long> {

}