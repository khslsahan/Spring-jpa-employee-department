package com.hsenidmobile.EmployeeDepartmentSpringJPA.dao;

import com.hsenidmobile.EmployeeDepartmentSpringJPA.model.Department;
import com.hsenidmobile.EmployeeDepartmentSpringJPA.model.Employee;
import com.hsenidmobile.EmployeeDepartmentSpringJPA.model.EmployeeId;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, EmployeeId> {
}
