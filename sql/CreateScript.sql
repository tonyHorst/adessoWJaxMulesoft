CREATE DATABASE ADESSO_WJAX_EMPLOYEES;

create table employee_optional_data(
	employee_id INT NOT NULL AUTO_INCREMENT,
	vacation_days_taken INT NOT NULL,
	vacation_days_left INT NOT NULL,
	salary VARCHAR(1000) NOT NULL,
	PRIMARY KEY ( employee_id )
);

INSERT INTO employee_optional_data(vacation_days_taken, vacation_days_left, salary) VALUES(100,264,"DoNotSpeakAboutIt");
INSERT INTO employee_optional_data(vacation_days_taken, vacation_days_left, salary) VALUES(0,0,"Grocery brands");
INSERT INTO employee_optional_data(vacation_days_taken, vacation_days_left, salary) VALUES(100,264,"100.000");


