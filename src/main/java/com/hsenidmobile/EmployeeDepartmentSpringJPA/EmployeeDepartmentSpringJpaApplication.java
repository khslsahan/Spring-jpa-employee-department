package com.hsenidmobile.EmployeeDepartmentSpringJPA;

import com.hsenidmobile.EmployeeDepartmentSpringJPA.dao.DepartmentRepository;
import com.hsenidmobile.EmployeeDepartmentSpringJPA.dao.EmployeeRepository;
import com.hsenidmobile.EmployeeDepartmentSpringJPA.model.Department;
import com.hsenidmobile.EmployeeDepartmentSpringJPA.model.DepartmentName;
import com.hsenidmobile.EmployeeDepartmentSpringJPA.model.Employee;
import com.hsenidmobile.EmployeeDepartmentSpringJPA.model.EmployeeId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.sql.DataSource;

@SpringBootApplication
@EnableJpaRepositories("com.hsenidmobile.EmployeeDepartmentSpringJPA.dao")
@EntityScan("com.hsenidmobile.EmployeeDepartmentSpringJPA.model")
public class EmployeeDepartmentSpringJpaApplication implements CommandLineRunner {

	@Autowired
	DataSource dataSource;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	EmployeeRepository	employeeRepository;

	public static void main(String[] args) {
		SpringApplication.run(EmployeeDepartmentSpringJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Our DataSource is = " + dataSource);

		Department department_save = new Department();
		department_save.setName(DepartmentName.HR);

//		departmentRepository.save(department_save);

		System.out.println("=====Department Info=======================");
		Iterable<Department> departmentlist = departmentRepository.findAll();
		for(Department department:departmentlist){
			System.out.println("Here is a department: " + department.toString());
		}

		Employee employee_save = new Employee(new EmployeeId(3,1),new Department(1,DepartmentName.DEV),"Udeash","Ishara");
		employeeRepository.save(employee_save);

		System.out.println("/n/n=====Employee Info=======================");
		Iterable<Employee> employeelist = employeeRepository.findAll();
		for(Employee employee:employeelist){
			System.out.println("Here is a employee: " + employee.toString());
		}
	}


}
