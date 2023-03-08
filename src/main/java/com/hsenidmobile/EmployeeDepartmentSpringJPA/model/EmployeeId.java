package com.hsenidmobile.EmployeeDepartmentSpringJPA.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class EmployeeId implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "id")
    private long id;

    @Column(name = "department_id")
    private long departmentId;

    // constructors, getters, setters, and equals/hashCode methods


    public EmployeeId() {
    }

    public EmployeeId(long id, long departmentId) {
        this.id = id;
        this.departmentId = departmentId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(long departmentId) {
        this.departmentId = departmentId;
    }
}