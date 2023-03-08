truncate department ;
INSERT INTO department (id,name) VALUES(1,'DEV');

INSERT INTO employee (id, department_id, first_name, last_name)
VALUES (2, 1, 'Sahan', 'Lakhitha');