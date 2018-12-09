-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.0.22-community-nt


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema rashandb
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ rashandb;
USE rashandb;

--
-- Table structure for table `rashandb`.`admininfo`
--

DROP TABLE IF EXISTS `admininfo`;
CREATE TABLE `admininfo` (
  `uname` varchar(60) NOT NULL default '',
  `pass` varchar(70) NOT NULL default '',
  PRIMARY KEY  (`uname`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `rashandb`.`admininfo`
--

/*!40000 ALTER TABLE `admininfo` DISABLE KEYS */;
INSERT INTO `admininfo` (`uname`,`pass`) VALUES 
 ('admin','admin');
/*!40000 ALTER TABLE `admininfo` ENABLE KEYS */;


--
-- Table structure for table `rashandb`.`saleinfo`
--

DROP TABLE IF EXISTS `saleinfo`;
CREATE TABLE `saleinfo` (
  `salecode` varchar(45) NOT NULL default '',
  `itemcode` varchar(45) NOT NULL default '',
  `itemname` varchar(70) NOT NULL default '',
  `unit` varchar(45) NOT NULL default '',
  `price` varchar(45) NOT NULL default '',
  `date_time` varchar(100) NOT NULL default '',
  `saleid` varchar(100) NOT NULL default '',
  `purchaseunit` varchar(70) NOT NULL default '',
  `amount` varchar(45) NOT NULL default ''
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `rashandb`.`saleinfo`
--

/*!40000 ALTER TABLE `saleinfo` DISABLE KEYS */;
INSERT INTO `saleinfo` (`salecode`,`itemcode`,`itemname`,`unit`,`price`,`date_time`,`saleid`,`purchaseunit`,`amount`) VALUES 
 ('1','1','Surf Excel','Unit','32','12-08-2018 11:18:29 PM','SAM8296','1','32'),
 ('2','2','Amul Butter','Unit','21','12-08-2018 11:21:12 PM','SAM8296','2','42');
/*!40000 ALTER TABLE `saleinfo` ENABLE KEYS */;


--
-- Table structure for table `rashandb`.`staffinfo`
--

DROP TABLE IF EXISTS `staffinfo`;
CREATE TABLE `staffinfo` (
  `fname` varchar(100) NOT NULL default '',
  `dob` varchar(15) NOT NULL default '',
  `age` varchar(5) NOT NULL default '',
  `caddr` varchar(300) NOT NULL default '',
  `paddr` varchar(300) NOT NULL default '',
  `mobile` varchar(12) NOT NULL default '',
  `email` varchar(100) NOT NULL default '',
  `uname` varchar(70) NOT NULL default '',
  `pass` varchar(70) NOT NULL default '',
  PRIMARY KEY  (`uname`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `rashandb`.`staffinfo`
--

/*!40000 ALTER TABLE `staffinfo` DISABLE KEYS */;
INSERT INTO `staffinfo` (`fname`,`dob`,`age`,`caddr`,`paddr`,`mobile`,`email`,`uname`,`pass`) VALUES 
 ('Abhilash Mendhe','5/28/1994','24','Viman Nagar, Pune','Suyog Nagar, Nagpur','9545600797','abhilash@localhost.com','ABH5894','1234'),
 ('Sam Rogers','8/22/1996','20','Gujrat','Pune','9912345678','samrogers@localhost.com','SAM8296','sam@123'),
 ('Suchit','1/21/1993','25','pune','solapur','1234567890','suchit@locahost.com','SUC1193','1234');
/*!40000 ALTER TABLE `staffinfo` ENABLE KEYS */;


--
-- Table structure for table `rashandb`.`stockinfo`
--

DROP TABLE IF EXISTS `stockinfo`;
CREATE TABLE `stockinfo` (
  `itemc` varchar(10) NOT NULL default '',
  `itemn` varchar(80) NOT NULL default '',
  `unit` varchar(70) NOT NULL default '',
  `price` varchar(60) NOT NULL default '',
  `stock` varchar(60) NOT NULL default '',
  `date_time` varchar(100) NOT NULL default '',
  PRIMARY KEY  (`itemc`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `rashandb`.`stockinfo`
--

/*!40000 ALTER TABLE `stockinfo` DISABLE KEYS */;
INSERT INTO `stockinfo` (`itemc`,`itemn`,`unit`,`price`,`stock`,`date_time`) VALUES 
 ('1','Surf Excel','Unit','32','0','12-07-2018 10:17:26 AM'),
 ('2','Amul Butter','Unit','21','3','12-07-2018 10:17:59 AM'),
 ('3','Basmati Rice','Kg','40','64','12-07-2018 11:19:16 AM'),
 ('4','Besan','Kg','32','0','12-07-2018 11:22:52 AM'),
 ('5','Marie Biscuits','Unit','15','5','12-07-2018 5:18:9 PM'),
 ('6','Tata Salt','Kg','30','50','12-07-2018 5:18:9 PM'),
 ('7','Ashirwada Atta','Kg','40','33','12-07-2018 5:25:34 PM'),
 ('8','Sugar','Kg','22','70','12-07-2018 5:25:34 PM'),
 ('9','Duracell','Unit','35','100','12-07-2018 5:25:34 PM');
/*!40000 ALTER TABLE `stockinfo` ENABLE KEYS */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
