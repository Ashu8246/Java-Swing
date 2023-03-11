/*
SQLyog Community Edition- MySQL GUI v8.04 
MySQL - 5.0.37-community-nt : Database - sms
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`sms` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `sms`;

/*Table structure for table `sms_login` */

DROP TABLE IF EXISTS `sms_login`;

CREATE TABLE `sms_login` (
  `Id` int(10) default NULL,
  `username` varchar(50) default NULL,
  `password` varchar(50) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `sms_login` */

insert  into `sms_login`(`Id`,`username`,`password`) values (1,'Admin','admin');

/*Table structure for table `stu_feesub` */

DROP TABLE IF EXISTS `stu_feesub`;

CREATE TABLE `stu_feesub` (
  `id` int(10) default NULL,
  `name` varchar(50) default NULL,
  `monthname` varchar(20) default NULL,
  `annualfee` int(50) default NULL,
  `monthlyfee` int(50) default NULL,
  `sportsfee` int(50) default NULL,
  `libfee` int(50) default NULL,
  `status` varchar(20) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `stu_feesub` */

insert  into `stu_feesub`(`id`,`name`,`monthname`,`annualfee`,`monthlyfee`,`sportsfee`,`libfee`,`status`) values (101,'Ashutosh','April',15000,2000,500,500,'Paid'),(102,'Aakaash','April',15000,2000,500,500,'Paid'),(103,'Akashat Rathod','April',10000,2000,500,500,'UnPaid'),(104,'Utkarsh','April',10000,3000,500,500,'UnPaid'),(104,'Utkarsh','April',12000,2000,500,500,'UnPaid'),(104,'Utkarsh','April',12000,2000,500,500,'UnPaid'),(104,'utkarsh','April',10000,2000,500,500,'UnPaid');

/*Table structure for table `stu_reg` */

DROP TABLE IF EXISTS `stu_reg`;

CREATE TABLE `stu_reg` (
  `id` int(10) default NULL,
  `name` varchar(100) default NULL,
  `fname` varchar(100) default NULL,
  `phone` varchar(13) default NULL,
  `fphone` varchar(13) default NULL,
  `class` varchar(50) default NULL,
  `roll` varchar(10) default NULL,
  `address` varchar(255) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `stu_reg` */

insert  into `stu_reg`(`id`,`name`,`fname`,`phone`,`fphone`,`class`,`roll`,`address`) values (102,'Aakash Yadav','Ramkisun Yadav ','8889682919','0099887765','12th','02','Surya dev nagar , cat road , indore'),(103,'Akshat rathod','Sudeep Rathod','1234567890','0987654321','12 th ','03','sudama nagar , indore'),(104,'Utkarsh Sharma','Ajit Sharma','9806887805','1234567890','MBA','04','cat road , indore');

/*Table structure for table `stu_reportcard` */

DROP TABLE IF EXISTS `stu_reportcard`;

CREATE TABLE `stu_reportcard` (
  `id` int(10) default NULL,
  `name` varchar(50) default NULL,
  `roll` varchar(5) default NULL,
  `class` varchar(4) default NULL,
  `physics` int(3) default NULL,
  `maths` int(3) default NULL,
  `chemistry` int(3) default NULL,
  `grade` varchar(8) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `stu_reportcard` */

insert  into `stu_reportcard`(`id`,`name`,`roll`,`class`,`physics`,`maths`,`chemistry`,`grade`) values (101,'Ashutosh Goud ','01','12th',77,88,87,'A+'),(102,'Aakash','01','12th',99,88,77,'A+'),(103,'Akshat Rathod','03','12th',77,88,99,'A+'),(104,'Utkarsh Sharma','04','MBA',88,77,89,'A+'),(104,'Utkarsh Sharma','04','12th',77,67,95,'A'),(103,'Akshat Rathod','03','12th',100,100,100,'A+');

/*Table structure for table `tea_reg` */

DROP TABLE IF EXISTS `tea_reg`;

CREATE TABLE `tea_reg` (
  `id` int(10) default NULL,
  `name` varchar(100) default NULL,
  `spec` varchar(100) default NULL,
  `subject` varchar(100) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `tea_reg` */

insert  into `tea_reg`(`id`,`name`,`spec`,`subject`) values (1001,'Pankaj ','Java Programmer','java');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
