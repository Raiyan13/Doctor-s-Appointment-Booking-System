CREATE DATABASE db_dabs;

USE db_dabs;

CREATE TABLE tbl_hospital(

    hospitalId int AUTO_INCREMENT PRIMARY KEY,
    hs_name varchar(100) UNIQUE NOT NULL,
    hs_address varchar(200) NOT NULL,
    hs_contact varchar(20),
    hs_email varchar(20) UNIQUE
);

CREATE TABLE tbl_Chamber(

    chamberId int AUTO_INCREMENT PRIMARY KEY,
    ch_floor varchar(100),
    ch_room varchar(100) NOT NULL,
    ch_contact varchar(20),
    doctorId int,
    hospitalId int,
    employeeId int
);

CREATE TABLE tbl_doctor(

    doctorId int AUTO_INCREMENT PRIMARY KEY,
    dr_name varchar(100) NOT NULL,
    dr_gender varchar(100) NOT NULL,
    dr_contact varchar(20),
    dr_email varchar(20) UNIQUE,
    dr_degree varchar(100) NOT NULL,
    dr_specialization varchar(200) NOT NULL,
    dr_practice_from varchar(50) not null,
    dr_fees int not null
);


CREATE TABLE tbl_patient(
 
    patientId int AUTO_INCREMENT PRIMARY KEY,
    pt_name varchar(100) NOT NULL,
    pt_gender varchar(100) NOT NULL,
    pt_birthdate varchar(50),
    pt_contact varchar(20),
    pt_email varchar(20) UNIQUE,
    pt_address varchar(20)
);

CREATE TABLE tbl_employee(

    employeeId int AUTO_INCREMENT PRIMARY KEY,
    emp_name varchar(100) NOT NULL,
    emp_gender varchar(100) NOT NULL,
    emp_contact varchar(20) NOT NULL,
    emp_email varchar(100) UNIQUE,
    emp_address varchar(100),
    hospitalId int
);

CREATE TABLE tbl_appointment(

    appointmentId int AUTO_INCREMENT PRIMARY KEY,
    ap_startTime varchar(20)
    ap_date varchar(50) not null,
    chamberId int,
    patientId int,
    employeeId int
);

ALTER TABLE tbl_Chamber 
ADD FOREIGN KEY (employeeId) REFERENCES tbl_employee(employeeId);

ALTER TABLE tbl_Chamber 
ADD FOREIGN KEY (hospitalId) REFERENCES tbl_hospital(hospitalId);

ALTER TABLE tbl_Employee 
ADD FOREIGN KEY (hospitalId) REFERENCES tbl_hospital(hospitalId);

ALTER TABLE tbl_Chamber 
ADD FOREIGN KEY (doctorId) REFERENCES tbl_doctor(doctorId);

ALTER TABLE tbl_appointment 
ADD FOREIGN KEY (chamberId) REFERENCES tbl_Chamber(chamberId);

ALTER TABLE tbl_appointment 
ADD FOREIGN KEY (patientId) REFERENCES tbl_patient(patientId);

ALTER TABLE tbl_appointment 
ADD FOREIGN KEY (employeeId) REFERENCES tbl_employee(employeeId);

/*
describe tbl_hospital;
describe tbl_Chamber;
describe tbl_doctor;
describe tbl_patient;
describe tbl_employee;
describe tbl_appointment;
*/

/*Source F:/DataBase Course/Doctors Appointment Booking/DABS.sql*/


INSERT into tbl_patient(pt_name,pt_gender,pt_birthdate,pt_contact,pt_email,pt_address)
       VALUES('Kabir Singh','male','1990-7-04','01907000771','kabirsingh@gmail.com','Bagbari,Sylhet'),
             ('Anindita Roy','female','1999-8-14','01907777111','hasan@gmail.com','Lamabazar,Sylhet'),
             ('Sajeda Saju','female','1980-10-24','01907127771','sajeda@gmail.com','Mirpur,Dhaka'),
             ('Swapnil Kabir','male','1990-1-04','01907744771','swapnil@gmail.com','Kabirhat,Nowakhali'),
             ('Hillol Talukdar','male','1998-11-12','01907777771','hillol@gmail.com','Banani,Dhaka');


INSERT INTO tbl_hospital(hs_name,hs_address,hs_contact,hs_email) 
VALUES('Al-Raiyan Hospital','Medical Road,Sylhet','01722000090','alraiyanhospital@gmail.com'),
      ('Popular Hospital LTD','Medical Road,Sylhet','01722011090','popularhospitalsyl@gmail.com'),
      ('Metropolitan Hospital','Mohakhali,Dhaka','01722111190','metropolitanhospital@gmail.com');
	  

INSERT INTO tbl_employee(emp_name,emp_gender,emp_contact,emp_email,emp_address,hospitalId)
VALUES('Hillol Talukdar','male','01674298644','talukdarhillol@gmail.com','Bagbari,Sylhet',1),
      ('Akkas Ali','male','01674298000','akkasali@gmail.com','Modhusahid,Sylhet',2),
      ('Fahmida Begum','female','01672228644','fahmidabegum@gmail.com','Jatrabari,Dhaka',3);
	  
INSERT INTO tbl_doctor(dr_name,dr_gender,dr_contact,dr_email,dr_degree,dr_specialization,dr_practice_from,dr_fees)
VALUES('Abul Hasan','male','01916216131','abulhasan@gmail.com','MBBS','Neurologist','1998-10-21',1000),
      ('Abdus Salam','male','01717217131','abdussalam@gmail.com','MBBS','Cardiologist ','2010-07-12',1000);
	  
INSERT INTO tbl_Chamber(ch_floor,ch_room,ch_contact,doctorId,hospitalId,employeeId)
VALUES('1','101','01398293944',1,2,3),
      ('2','201','01998294549',2,1,1);

INSERT INTO tbl_appointment(ap_startTime,ap_date,chamberId,patientId,employeeId)
VALUES('2:10PM','2019-10-10',3,1,7),
('1:00PM','2019-08-10',3,1,7),
('9:00AM','2019-01-12',3,1,7);