use hr_management;
CREATE TABLE `system` (
                          id INT NOT NULL AUTO_INCREMENT,
                          name VARCHAR(100) NOT NULL,
                          lastaudit DATE NOT NULL,
                          PRIMARY KEY (id)
);


CREATE TABLE depatment (
                          id INT NOT NULL AUTO_INCREMENT,
                          name VARCHAR(100) NOT NULL,
                          PRIMARY KEY (id)
);