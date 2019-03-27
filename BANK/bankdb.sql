-- MySQL dump 10.13  Distrib 8.0.15, for Linux (x86_64)
--
-- Host: localhost    Database: bankdb
-- ------------------------------------------------------
-- Server version	8.0.15

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8mb4 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `accinfo`
--

DROP TABLE IF EXISTS `accinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `accinfo` (
  `accno` varchar(15) NOT NULL DEFAULT '',
  `custname` varchar(80) NOT NULL DEFAULT '',
  `dob` varchar(13) NOT NULL DEFAULT '',
  `address` varchar(300) NOT NULL DEFAULT '',
  `email` varchar(60) NOT NULL DEFAULT '',
  `mobile` varchar(10) NOT NULL DEFAULT '',
  `openbal` varchar(10) NOT NULL DEFAULT '',
  PRIMARY KEY (`accno`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `accinfo`
--

LOCK TABLES `accinfo` WRITE;
/*!40000 ALTER TABLE `accinfo` DISABLE KEYS */;
INSERT INTO `accinfo` VALUES ('111','Ajeet Bhau','AUG/14/1993','Ravet, pune','ajeetbhau@gmail.com','9437512333','0.0'),('1212','Sam Dsouza','APR/04/1972','Karve nagar','sam@gmail.com','1234567891','2500.0'),('123','Abhilash Mendhe','MAY/28/1994','Viman Nagar, Pune','abhilash@localhost.com','9545600797','6000.0'),('234','Suchit Pawar','JAN/21/1993','viman nagar, pune','suchitp@localhost.com','9843234552','1900.0'),('345','Shreepad Kale','DEC/07/1993','Kasba Peth, Pune','shreepad@loacalhost.com','8087663153','1300.0');
/*!40000 ALTER TABLE `accinfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `empinfo`
--

DROP TABLE IF EXISTS `empinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `empinfo` (
  `name` varchar(100) DEFAULT NULL,
  `dob` varchar(12) NOT NULL DEFAULT '',
  `email` varchar(60) NOT NULL DEFAULT '',
  `address` varchar(300) NOT NULL DEFAULT '',
  `uname` varchar(70) NOT NULL DEFAULT '',
  `pass` varchar(70) NOT NULL DEFAULT '',
  PRIMARY KEY (`uname`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empinfo`
--

LOCK TABLES `empinfo` WRITE;
/*!40000 ALTER TABLE `empinfo` DISABLE KEYS */;
INSERT INTO `empinfo` VALUES ('Tushar Gawli','DEC/09/1994','tushar@localhost.com','Vadgaon Sheri, Pune','Gtushar','1234'),('ajit','AUG/14/1993','apjambl@gmail.com','ravet','Jajit','ajit@123'),('Shreepad','DEC/1/1970','shreepad@localhost.com','kasbapeth, pune','Kshreepad','123'),('Abhilash Mendhe','MAY/28/1994','abhilash@localhost.com','viman nagar, pune','Mabhilash','abhi@123'),('suchit','JAN/21/1993','suchit@localhost.com','viman nagar, pune','Psuchit','suchit@123'),('Sam Rogers','APR/20/1992','samrogers@gmail.com','vishrantwadi, pune','Rsam','sam@123'),('Tushar Shinde','NOV/01/1997','tushar@localhost.com','Tingre Nagar, Rashvin\nke ghar ke paas.','tushar71','1234');
/*!40000 ALTER TABLE `empinfo` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-03-27  7:59:10
