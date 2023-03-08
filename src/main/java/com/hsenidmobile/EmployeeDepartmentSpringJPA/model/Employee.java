package com.hsenidmobile.EmployeeDepartmentSpringJPA.model;

import javax.persistence.*;

@Entity
public class Employee {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name="id")
//    private  long id;

    @EmbeddedId
    private EmployeeId id;

    @ManyToOne
    @JoinColumn(name = "department_id",insertable = false, updatable = false)
    private Department department;

    private String firstName;

    private String lastName;


    public Employee() {
    }

    public Employee(EmployeeId id, Department department, String firstName, String lastNAme) {
        this.id = id;
        this.department = department;
        this.firstName = firstName;
        this.lastName = lastNAme;
    }

    public EmployeeId getId() {
        return id;
    }

    public void setId(EmployeeId id) {
        this.id = id;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastNAme) {
        this.lastName = lastNAme;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", department=" + department +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
