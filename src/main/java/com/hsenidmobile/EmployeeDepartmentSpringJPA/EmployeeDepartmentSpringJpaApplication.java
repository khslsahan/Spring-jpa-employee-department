package com.hsenidmobile.EmployeeDepartmentSpringJPA;

import com.hsenidmobile.EmployeeDepartmentSpringJPA.dao.DepartmentRepository;
import com.hsenidmobile.EmployeeDepartmentSpringJPA.dao.SystemRepository;
import com.hsenidmobile.EmployeeDepartmentSpringJPA.model.Department;
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

//	public static void main(String[] args) {
//		SpringApplication.run(EmployeeDepartmentSpringJpaApplication.class, args);
//	}


	@Autowired
	DataSource dataSource;

	@Autowired
	DepartmentRepository systemRepository;

	public static void main(String[] args) {
		SpringApplication.run(EmployeeDepartmentSpringJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Our DataSource is = " + dataSource);
		Iterable<Department> systemlist = systemRepository.findAll();
		for(Department systemmodel:systemlist){
			System.out.println("Here is a system: " + systemmodel.toString());
		}


	}


}
