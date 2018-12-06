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
  `itemcode` varchar(10) NOT NULL default '',
  `itemname` varchar(100) NOT NULL default '',
  `unit` varchar(45) NOT NULL default '',
  `price` varchar(45) NOT NULL default '',
  `date_time` varchar(100) NOT NULL default '',
  `saleid` varchar(80) NOT NULL default '',
  `salecode` varchar(45) NOT NULL default '',
  `purchaseunit` varchar(45) NOT NULL default '',
  `amount` varchar(100) NOT NULL default '',
  PRIMARY KEY  (`itemcode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `rashandb`.`saleinfo`
--

/*!40000 ALTER TABLE `saleinfo` DISABLE KEYS */;
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
 ('Abhilash Mendhe','5/28/1994','24','Viman Nagar, Pune','Suyog Nagar, Nagpur','9545600797','abhilash@localhost.com','ABH5894','12345'),
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
 ('1','Ashirwad Atta','Kg','32','40','12-06-2018 2:47:17 PM'),
 ('2','Surf Excel','Unit','67','10','12-06-2018 6:19:48 PM'),
 ('3','Sugar','Kg','15','5','12-06-2018 6:19:48 PM'),
 ('4','Lux Soap','Unit','30','40','12-06-2018 6:19:48 PM');
/*!40000 ALTER TABLE `stockinfo` ENABLE KEYS */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
