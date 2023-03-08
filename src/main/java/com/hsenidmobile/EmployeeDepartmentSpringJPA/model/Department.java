package com.hsenidmobile.EmployeeDepartmentSpringJPA.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private  long id;

    @Enumerated(EnumType.STRING)
    private DepartmentName name;

//    @OneToMany(mappedBy = "department")
//    private List<Employee> employees;
//
//    public List<Employee> getEmployees() {
//        return employees;
//    }
//
//    public void setEmployees(List<Employee> employees) {
//        this.employees = employees;
//    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public DepartmentName getName() {
        return name;
    }

    public void setName(DepartmentName name) {
        this.name = name;
    }

    public Department() {
    }

    public Department(long id, DepartmentName name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
