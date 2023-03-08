use hr_management;
# drop table depatment;
CREATE TABLE depatment (
                          id INT NOT NULL AUTO_INCREMENT,
                          name VARCHAR(100) NOT NULL,
                          PRIMARY KEY (id)
);

CREATE TABLE employee (
                          id BIGINT NOT NULL AUTO_INCREMENT ,
                          department_id BIGINT,
                          firstName VARCHAR(255),
                          lastNAme VARCHAR(255),
                          PRIMARY KEY (id, department_id),
                          CONSTRAINT FK_employee_department FOREIGN KEY (department_id) REFERENCES department(id)
);