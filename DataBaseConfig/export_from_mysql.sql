-- MySQL dump 10.13  Distrib 5.7.24, for Win64 (x86_64)
--
-- Host: localhost    Database: code
-- ------------------------------------------------------
-- Server version	5.7.24-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `admin` (
  `adminID` int(11) NOT NULL AUTO_INCREMENT,
  `adminAccount` varchar(45) DEFAULT NULL,
  `adminPassword` varchar(20) DEFAULT NULL,
  `adminLeval` int(11) DEFAULT NULL,
  `adminMessage` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`adminID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` VALUES (1,'rgzhang','a530371306',9999,'none'),(2,'nihaonihao','123456',9999,'none');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `apply`
--

DROP TABLE IF EXISTS `apply`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `apply` (
  `guardianID` int(11) NOT NULL,
  `studentID` int(11) NOT NULL,
  `applyDate` datetime DEFAULT NULL,
  `applySubmit` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`guardianID`,`studentID`),
  KEY `studentID` (`studentID`),
  CONSTRAINT `apply_ibfk_1` FOREIGN KEY (`guardianID`) REFERENCES `guardian` (`guardianID`),
  CONSTRAINT `apply_ibfk_2` FOREIGN KEY (`studentID`) REFERENCES `student` (`studentID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `apply`
--

LOCK TABLES `apply` WRITE;
/*!40000 ALTER TABLE `apply` DISABLE KEYS */;
/*!40000 ALTER TABLE `apply` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bbsinfo`
--

DROP TABLE IF EXISTS `bbsinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bbsinfo` (
  `bbsID` int(11) NOT NULL,
  `studentID` int(11) NOT NULL,
  `postDate` datetime DEFAULT NULL,
  `theme` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`bbsID`),
  KEY `studentID` (`studentID`),
  CONSTRAINT `bbsinfo_ibfk_1` FOREIGN KEY (`studentID`) REFERENCES `student` (`studentID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bbsinfo`
--

LOCK TABLES `bbsinfo` WRITE;
/*!40000 ALTER TABLE `bbsinfo` DISABLE KEYS */;
/*!40000 ALTER TABLE `bbsinfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bbstalk`
--

DROP TABLE IF EXISTS `bbstalk`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bbstalk` (
  `talkID` int(11) NOT NULL,
  `studentID` int(11) NOT NULL,
  `bbsID` int(11) NOT NULL,
  `talkTo` int(11) DEFAULT NULL,
  `likeCount` int(11) DEFAULT NULL,
  `BBSTalkMessage` varchar(200) DEFAULT NULL,
  `bbstalkTime` datetime DEFAULT NULL,
  PRIMARY KEY (`talkID`),
  KEY `bbsID` (`bbsID`),
  KEY `studentID` (`studentID`),
  CONSTRAINT `bbstalk_ibfk_1` FOREIGN KEY (`bbsID`) REFERENCES `bbsinfo` (`bbsID`),
  CONSTRAINT `bbstalk_ibfk_2` FOREIGN KEY (`studentID`) REFERENCES `student` (`studentID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bbstalk`
--

LOCK TABLES `bbstalk` WRITE;
/*!40000 ALTER TABLE `bbstalk` DISABLE KEYS */;
/*!40000 ALTER TABLE `bbstalk` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `checkoutpoint`
--

DROP TABLE IF EXISTS `checkoutpoint`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `checkoutpoint` (
  `studentID` int(11) NOT NULL,
  `checkpointID` int(11) NOT NULL,
  `toalTime` int(11) DEFAULT '0',
  `program` varchar(2000) DEFAULT NULL,
  `saveTime` datetime DEFAULT NULL,
  `isSuccess` int(1) DEFAULT '0',
  PRIMARY KEY (`studentID`,`checkpointID`),
  KEY `studentLevel` (`studentID`,`checkpointID`),
  CONSTRAINT `checkoutpoint_ibfk_1` FOREIGN KEY (`studentID`) REFERENCES `student` (`studentID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `checkoutpoint`
--

LOCK TABLES `checkoutpoint` WRITE;
/*!40000 ALTER TABLE `checkoutpoint` DISABLE KEYS */;
INSERT INTO `checkoutpoint` VALUES (1,1,7,'h3333','2019-05-25 16:59:17',1),(1,3,3,'as111',NULL,1),(1,102,NULL,'printf(hello spring)',NULL,1),(1,203,0,NULL,NULL,1),(1,1201,NULL,'printf(hello spring)',NULL,1);
/*!40000 ALTER TABLE `checkoutpoint` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `checkpoint`
--

DROP TABLE IF EXISTS `checkpoint`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `checkpoint` (
  `checkPointID` int(11) NOT NULL,
  `checkPointName` varchar(20) DEFAULT NULL,
  `checkPointLevel` int(11) DEFAULT NULL,
  `checkPointCate` int(11) DEFAULT NULL,
  `checkpointCode` varchar(1000) DEFAULT NULL,
  `checkpointData` datetime DEFAULT NULL,
  `checkpointRemark` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`checkPointID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `checkpoint`
--

LOCK TABLES `checkpoint` WRITE;
/*!40000 ALTER TABLE `checkpoint` DISABLE KEYS */;
INSERT INTO `checkpoint` VALUES (1,NULL,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `checkpoint` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `freedommode`
--

DROP TABLE IF EXISTS `freedommode`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `freedommode` (
  `studentID` int(11) NOT NULL,
  `program` varchar(500) DEFAULT NULL,
  `source` varchar(40) DEFAULT NULL,
  `freeModeSaveTime` datetime DEFAULT NULL,
  `toaltime` int(11) DEFAULT NULL,
  PRIMARY KEY (`studentID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `freedommode`
--

LOCK TABLES `freedommode` WRITE;
/*!40000 ALTER TABLE `freedommode` DISABLE KEYS */;
INSERT INTO `freedommode` VALUES (1,'asdd','bbb',NULL,11);
/*!40000 ALTER TABLE `freedommode` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `guardian`
--

DROP TABLE IF EXISTS `guardian`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `guardian` (
  `guardianID` int(11) NOT NULL,
  `guardianName` varchar(30) DEFAULT NULL,
  `guardianGender` varchar(2) DEFAULT NULL,
  `guardianEmail` varchar(30) DEFAULT NULL,
  `guardianAge` int(11) DEFAULT '0',
  `guardianPhone` varchar(15) DEFAULT NULL,
  `guardianAddress` varchar(80) DEFAULT NULL,
  `guardianRemark` varchar(45) DEFAULT NULL,
  `guardianRegisterTime` datetime DEFAULT NULL,
  PRIMARY KEY (`guardianID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `guardian`
--

LOCK TABLES `guardian` WRITE;
/*!40000 ALTER TABLE `guardian` DISABLE KEYS */;
/*!40000 ALTER TABLE `guardian` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `guardianlogin`
--

DROP TABLE IF EXISTS `guardianlogin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `guardianlogin` (
  `guardianID` int(11) NOT NULL AUTO_INCREMENT,
  `guardianAccount` varchar(30) NOT NULL,
  `guardianPassword` varchar(20) DEFAULT NULL,
  `nickname` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`guardianID`),
  UNIQUE KEY `guardianAccount_UNIQUE` (`guardianAccount`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `guardianlogin`
--

LOCK TABLES `guardianlogin` WRITE;
/*!40000 ALTER TABLE `guardianlogin` DISABLE KEYS */;
/*!40000 ALTER TABLE `guardianlogin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `guardianloginmessage`
--

DROP TABLE IF EXISTS `guardianloginmessage`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `guardianloginmessage` (
  `guardianloginID` int(11) NOT NULL AUTO_INCREMENT,
  `guardianID` varchar(45) DEFAULT NULL,
  `loginIP` varchar(45) DEFAULT NULL,
  `loginData` datetime DEFAULT NULL,
  `loginMessage` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`guardianloginID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `guardianloginmessage`
--

LOCK TABLES `guardianloginmessage` WRITE;
/*!40000 ALTER TABLE `guardianloginmessage` DISABLE KEYS */;
/*!40000 ALTER TABLE `guardianloginmessage` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student` (
  `studentID` int(11) NOT NULL,
  `studentName` varchar(30) DEFAULT NULL,
  `studentGender` varchar(2) DEFAULT NULL,
  `studentEmail` varchar(30) DEFAULT NULL,
  `studentAge` int(11) DEFAULT NULL,
  `studentPhone` varchar(15) DEFAULT NULL,
  `studentSchool` varchar(45) DEFAULT NULL,
  `studentNumber` varchar(20) DEFAULT NULL,
  `studentGrade` varchar(10) DEFAULT NULL,
  `studentRemark` varchar(100) DEFAULT NULL,
  `studentRegisterTime` datetime DEFAULT NULL,
  PRIMARY KEY (`studentID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES (1,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `studentlogin`
--

DROP TABLE IF EXISTS `studentlogin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `studentlogin` (
  `studentID` int(11) NOT NULL AUTO_INCREMENT,
  `studentAccount` varchar(30) NOT NULL,
  `studentPassword` varchar(20) DEFAULT NULL,
  `nickname` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`studentID`),
  UNIQUE KEY `studentAccount_UNIQUE` (`studentAccount`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `studentlogin`
--

LOCK TABLES `studentlogin` WRITE;
/*!40000 ALTER TABLE `studentlogin` DISABLE KEYS */;
INSERT INTO `studentlogin` VALUES (1,'nihaonihao','123456','as'),(2,'qqq','asd','aaa'),(4,'qq2q','asd','aaa'),(5,'nihaonihao2','123456','rgzhang');
/*!40000 ALTER TABLE `studentlogin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `studentloginmessage`
--

DROP TABLE IF EXISTS `studentloginmessage`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `studentloginmessage` (
  `studentLoginID` int(11) NOT NULL AUTO_INCREMENT,
  `studentID` int(11) DEFAULT NULL,
  `loginIP` varchar(45) DEFAULT NULL,
  `loginData` datetime DEFAULT NULL,
  `loginMessage` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`studentLoginID`)
) ENGINE=InnoDB AUTO_INCREMENT=81 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `studentloginmessage`
--

LOCK TABLES `studentloginmessage` WRITE;
/*!40000 ALTER TABLE `studentloginmessage` DISABLE KEYS */;
INSERT INTO `studentloginmessage` VALUES (15,1,'0:0:0:0:0:0:0:1','2019-04-14 17:04:47',NULL),(16,1,'192.168.3.16','2019-04-14 17:09:36',NULL),(17,1,'0:0:0:0:0:0:0:1','2019-04-14 22:31:12',NULL),(18,1,'0:0:0:0:0:0:0:1','2019-04-14 22:31:58',NULL),(19,1,'0:0:0:0:0:0:0:1','2019-04-14 22:38:31',NULL),(20,1,'0:0:0:0:0:0:0:1','2019-04-14 22:44:41',NULL),(21,1,'192.168.3.11','2019-04-14 23:13:16',NULL),(22,1,'192.168.3.16','2019-04-14 23:15:03',NULL),(23,1,'0:0:0:0:0:0:0:1','2019-04-17 23:28:13',NULL),(24,1,'0:0:0:0:0:0:0:1','2019-04-17 23:29:39',NULL),(25,1,'192.168.3.16','2019-04-17 23:31:24',NULL),(26,1,'192.168.3.16','2019-04-17 23:31:39',NULL),(27,1,'0:0:0:0:0:0:0:1','2019-04-17 23:39:33',NULL),(28,1,'192.168.3.16','2019-04-17 23:39:36',NULL),(29,1,'192.168.3.16','2019-04-17 23:42:24',NULL),(30,1,'0:0:0:0:0:0:0:1','2019-04-17 23:44:55',NULL),(31,1,'0:0:0:0:0:0:0:1','2019-04-18 08:43:45',NULL),(32,1,'0:0:0:0:0:0:0:1','2019-05-24 22:33:35',NULL),(33,1,'0:0:0:0:0:0:0:1','2019-05-25 14:30:56',NULL),(34,1,'0:0:0:0:0:0:0:1','2019-05-25 14:31:57',NULL),(35,1,'127.0.0.1','2019-05-28 12:14:50','nihaonihao'),(36,1,'127.0.0.1','2019-05-28 12:20:14','nihaonihao'),(37,1,'127.0.0.1','2019-05-28 16:02:06','nihaonihao'),(38,1,'127.0.0.1','2019-05-28 16:05:12','nihaonihao'),(39,1,'127.0.0.1','2019-05-28 16:28:34','nihaonihao'),(40,1,'127.0.0.1','2019-05-28 19:17:30','nihaonihao'),(41,1,'127.0.0.1','2019-05-29 11:04:43','nihaonihao'),(42,1,'127.0.0.1','2019-05-29 11:07:32','nihaonihao'),(43,1,'127.0.0.1','2019-05-29 11:07:53','nihaonihao'),(44,1,'127.0.0.1','2019-05-29 11:08:06','nihaonihao'),(45,1,'127.0.0.1','2019-05-29 11:08:16','nihaonihao'),(46,1,'127.0.0.1','2019-05-29 11:09:37','nihaonihao'),(47,1,'127.0.0.1','2019-05-29 11:12:09','nihaonihao'),(48,1,'127.0.0.1','2019-05-29 11:12:52','nihaonihao'),(49,1,'127.0.0.1','2019-05-29 11:13:49','nihaonihao'),(50,1,'127.0.0.1','2019-05-29 11:14:40','nihaonihao'),(51,1,'127.0.0.1','2019-05-29 11:15:15','nihaonihao'),(52,1,'127.0.0.1','2019-05-29 11:20:43','nihaonihao'),(53,1,'127.0.0.1','2019-05-29 11:22:15','nihaonihao'),(54,1,'127.0.0.1','2019-05-29 11:24:02','nihaonihao'),(55,1,'127.0.0.1','2019-05-29 11:24:30','nihaonihao'),(56,1,'127.0.0.1','2019-05-29 11:25:53','nihaonihao'),(57,1,'127.0.0.1','2019-05-29 11:30:04','nihaonihao'),(58,1,'127.0.0.1','2019-05-29 11:33:38','nihaonihao'),(59,1,'127.0.0.1','2019-05-29 11:34:09','nihaonihao'),(60,1,'127.0.0.1','2019-05-29 11:36:20','nihaonihao'),(61,1,'127.0.0.1','2019-05-29 11:37:35','nihaonihao'),(62,1,'127.0.0.1','2019-05-29 11:40:40','nihaonihao'),(63,1,'127.0.0.1','2019-05-29 11:42:32','nihaonihao'),(64,1,'127.0.0.1','2019-05-29 11:43:08','nihaonihao'),(65,1,'127.0.0.1','2019-05-29 11:45:27','nihaonihao'),(66,1,'127.0.0.1','2019-05-29 11:45:56','nihaonihao'),(67,1,'127.0.0.1','2019-05-29 11:46:12','nihaonihao'),(68,1,'127.0.0.1','2019-05-29 12:54:44','nihaonihao'),(69,1,'127.0.0.1','2019-05-29 13:04:38','nihaonihao'),(70,1,'127.0.0.1','2019-05-29 13:26:54','nihaonihao'),(71,1,'127.0.0.1','2019-05-29 15:26:03','nihaonihao'),(72,1,'127.0.0.1','2019-05-29 16:30:59','nihaonihao'),(73,1,'127.0.0.1','2019-05-30 11:04:55','nihaonihao'),(74,1,'127.0.0.1','2019-05-30 11:05:29','nihaonihao'),(75,1,'127.0.0.1','2019-05-30 11:08:07','nihaonihao'),(76,1,'127.0.0.1','2019-05-30 11:08:54','nihaonihao'),(77,1,'127.0.0.1','2019-05-30 11:10:53','nihaonihao'),(78,1,'127.0.0.1','2019-05-30 11:18:09','nihaonihao'),(79,1,'127.0.0.1','2019-05-30 23:16:56','nihaonihao'),(80,1,'127.0.0.1','2019-05-31 08:35:17','nihaonihao');
/*!40000 ALTER TABLE `studentloginmessage` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-06-01 14:50:15
