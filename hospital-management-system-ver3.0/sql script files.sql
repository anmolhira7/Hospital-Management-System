CREATE DATABASE  IF NOT EXISTS `employee_directory`;
USE `employee_directory`;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `table_patient`;

CREATE TABLE `table_patient` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `address` varchar(80) DEFAULT NULL,
  `phone` varchar(15) DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL,
  `date_of_adm` date,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `employee`
--

INSERT INTO `table_patient` VALUES 
	(1,'Leslie','Andrews','Leslie@12','roshanara road','+1145355345','45533','2019-07-08'),
	(2,'Emma','Baumgarten','EmmaBaug@15','Okhla road','+9345455345','45533','2019-07-08'),
	(3,'Avani','Gupta','AvaniGupta@12','roshanara road rosahanara road','+7145455345','45533','2019-07-08'),
	(4,'Yuri','Petrov','YuripETRO@12','roshanara road rosahanara road','+7333455345','45533','2019-07-08'),
	(5,'Juan','Vega','JuanVega@12','roshanara road rosahanara road','+9145454345','45533','2019-07-08');

----------------------------------------------------------------- ------------------------------------     --------- ------------------------------- ---------------

---
---     Table structure for table `appointments`
---


DROP TABLE IF EXISTS `appointments`;
CREATE TABLE `appointments` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `patient_id` int(20) NOT NULL,
  `patient_name` varchar(30)DEFAULT NULL,
  `date_of_book` date,
  `doctor_name` varchar(35) DEFAULT NULL,
  `status` varchar(30) DEFAULT NULL,
 PRIMARY KEY (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

---
--- Data for table `appointments`
---

insert into appointments values(1,'1001','anmol','2019/04/19','R.S aggarwal','booked');
insert into appointments values(2,'1002','phuskar','2018/04/19','Rajan Jha','solved');
insert into appointments values(3,'1003','ravi','2017/04/19','R.S aggarwal','solved');
     
