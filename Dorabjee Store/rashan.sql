-- MySQL dump 10.13  Distrib 8.0.15, for Linux (x86_64)
--
-- Host: localhost    Database: rashandb
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
-- Table structure for table `admininfo`
--

DROP TABLE IF EXISTS `admininfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `admininfo` (
  `uname` varchar(100) DEFAULT NULL,
  `pass` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admininfo`
--

LOCK TABLES `admininfo` WRITE;
/*!40000 ALTER TABLE `admininfo` DISABLE KEYS */;
INSERT INTO `admininfo` VALUES ('admin','admin');
/*!40000 ALTER TABLE `admininfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `saleinfo`
--

DROP TABLE IF EXISTS `saleinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `saleinfo` (
  `salecode` varchar(45) NOT NULL DEFAULT '',
  `itemcode` varchar(45) NOT NULL DEFAULT '',
  `itemname` varchar(70) NOT NULL DEFAULT '',
  `unit` varchar(45) NOT NULL DEFAULT '',
  `price` varchar(45) NOT NULL DEFAULT '',
  `date_time` varchar(100) NOT NULL DEFAULT '',
  `saleid` varchar(100) NOT NULL DEFAULT '',
  `purchaseunit` varchar(70) NOT NULL DEFAULT '',
  `amount` varchar(45) NOT NULL DEFAULT ''
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `saleinfo`
--

LOCK TABLES `saleinfo` WRITE;
/*!40000 ALTER TABLE `saleinfo` DISABLE KEYS */;
INSERT INTO `saleinfo` VALUES ('1','1','Surf Excel','Unit','32','12-08-2018 11:18:29 PM','SAM8296','1','32'),('2','2','Amul Butter','Unit','21','12-08-2018 11:21:12 PM','SAM8296','2','42'),('3','1','Surf Excel','Unit','30','12-11-2018 10:10:48 AM','SAM8296','4','120'),('4','5','Marie Biscuits','Unit','15','12-11-2018 10:25:20 AM','SAM8296','4','60'),('4','7','Ashirwada Atta','Kg','36','12-11-2018 10:25:28 AM','SAM8296','10','360');
/*!40000 ALTER TABLE `saleinfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `staffinfo`
--

DROP TABLE IF EXISTS `staffinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `staffinfo` (
  `fname` varchar(100) NOT NULL DEFAULT '',
  `dob` varchar(15) NOT NULL DEFAULT '',
  `age` varchar(5) NOT NULL DEFAULT '',
  `caddr` varchar(300) NOT NULL DEFAULT '',
  `paddr` varchar(300) NOT NULL DEFAULT '',
  `mobile` varchar(12) NOT NULL DEFAULT '',
  `email` varchar(100) NOT NULL DEFAULT '',
  `uname` varchar(70) NOT NULL DEFAULT '',
  `pass` varchar(70) NOT NULL DEFAULT '',
  PRIMARY KEY (`uname`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `staffinfo`
--

LOCK TABLES `staffinfo` WRITE;
/*!40000 ALTER TABLE `staffinfo` DISABLE KEYS */;
INSERT INTO `staffinfo` VALUES ('Abhilash Mendhe','5/28/1994','24','Viman Nagar, Pune','Suyog Nagar, Nagpur','9545600797','abhilash@localhost.com','ABH5894','1234'),('Sam Rogers','8/22/1996','20','Gujrat','Pune','9912345678','samrogers@localhost.com','SAM8296','sam@123'),('Suchit','1/21/1993','25','pune','solapur','1234567890','suchit@locahost.com','SUC1193','1234'),('Tushar','11/1/1997','21','tingre nagar, pune	','tingre nagar, pune','1234567890','tushar@localhost.com','TUS1197','1234');
/*!40000 ALTER TABLE `staffinfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `stockinfo`
--

DROP TABLE IF EXISTS `stockinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `stockinfo` (
  `itemc` varchar(10) NOT NULL DEFAULT '',
  `itemn` varchar(80) NOT NULL DEFAULT '',
  `unit` varchar(70) NOT NULL DEFAULT '',
  `price` varchar(60) NOT NULL DEFAULT '',
  `stock` varchar(60) NOT NULL DEFAULT '',
  `date_time` varchar(100) NOT NULL DEFAULT '',
  PRIMARY KEY (`itemc`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stockinfo`
--

LOCK TABLES `stockinfo` WRITE;
/*!40000 ALTER TABLE `stockinfo` DISABLE KEYS */;
INSERT INTO `stockinfo` VALUES ('1','Surf Excel','Unit','30','36','12-07-2018 10:17:26 AM'),('2','Amul Butter','Unit','21','33','12-07-2018 10:17:59 AM'),('3','Basmati Rice','Kg','40','64','12-07-2018 11:19:16 AM'),('4','Besan','Kg','37','50','12-07-2018 11:22:52 AM'),('5','Marie Biscuits','Unit','15','61','12-07-2018 5:18:9 PM'),('6','Tata Salt','Kg','30','50','12-07-2018 5:18:9 PM'),('7','Ashirwada Atta','Kg','36','23','12-07-2018 5:25:34 PM'),('8','Sugar','Kg','22','70','12-07-2018 5:25:34 PM'),('9','Duracell','Unit','35','100','12-07-2018 5:25:34 PM');
/*!40000 ALTER TABLE `stockinfo` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-03-27  8:01:03
