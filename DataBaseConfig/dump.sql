-- MySQL dump 10.13  Distrib 5.7.24, for Win64 (x86_64)
-- creat by : rgzhang
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
-- Table structure for table `checkoutpoint`
--

DROP TABLE IF EXISTS `checkoutpoint`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `checkoutpoint` (
  `studentID` int(11) NOT NULL,
  `checkpointID` int(11) NOT NULL,
  `toalTime` int(11) DEFAULT '0',
  `program` varchar(5000) DEFAULT NULL,
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
INSERT INTO `checkoutpoint` VALUES (1,1,7,'h3333','2019-05-25 16:59:17',1),(1,3,3,'as111',NULL,1),(1,102,NULL,'printf(hello spring)',NULL,1),(1,201,2,'<xml xmlns=\"http://www.w3.org/1999/xhtml\"><block type=\"start_block\" id=\"!nU*#a;/Ukw?@/,/DSRS\" x=\"10\" y=\"10\"><next><block type=\"move\" id=\"=%X:(E9^}8hSmagF2K#:\"><next><block type=\"move\" id=\"PHehyS-5{eV8(^)sLwxL\"><next><block type=\"turnleft\" id=\"`v.MtO9IS){YQ|u5%_S~\"><next><block type=\"move\" id=\"xYuaJ_O%Y0[yk_.^S7]N\"></block></next></block></next></block></next></block></next></block></xml>','2019-06-16 23:14:35',1),(1,203,4,'<xml xmlns=\"http://www.w3.org/1999/xhtml\"><block type=\"start_block\" id=\"U5+@oyUZba8.CgyF?YrO\" x=\"10\" y=\"10\"><next><block type=\"controls_repeat_ext\" id=\"?46iCGDR@7TGGNm]3(}3\"><value name=\"TIMES\"><shadow type=\"math_number\" id=\"2i(?hB:%vA*vy-NCN3D$\"><field name=\"NUM\">5</field></shadow></value><statement name=\"DO\"><block type=\"move\" id=\"]$Q.#atnGi!a}VFZy|JY\"></block></statement></block></next></block></xml>','2019-06-17 00:19:57',1),(1,204,1,'<xml xmlns=\"http://www.w3.org/1999/xhtml\"><block type=\"start_block\" id=\"!{bKSLEop~Gb*]fjKV{J\" x=\"10\" y=\"10\"><next><block type=\"controls_repeat_ext\" id=\"luM2mAu!pzGj2wqfR`F`\"><value name=\"TIMES\"><shadow type=\"math_number\" id=\"w[+;%(^,w4hx+FUQ=_J5\"><field name=\"NUM\">5</field></shadow></value><statement name=\"DO\"><block type=\"move\" id=\"7%s0zmV=+~S@{zpa)5qz\"></block></statement></block></next></block></xml>','2019-06-17 00:20:31',1),(1,1001,2,'<xml xmlns=\"http://www.w3.org/1999/xhtml\"><block type=\"start_block\" id=\"[fwKdxw,EH6Zw@iQq$!l\" x=\"10\" y=\"10\"><next><block type=\"controls_repeat_ext\" id=\"`UJ3GQU}t:,G.-S9a~I{\"><value name=\"TIMES\"><block type=\"math_number\" id=\"V@1GAefvNfPs3,JJ)^Ut\"><field name=\"NUM\">3</field></block></value><statement name=\"DO\"><block type=\"move_step\" id=\"#+HmFcobw]pqjBq6ndls\"><field name=\"move\">moveforward</field><field name=\"step\">50</field><next><block type=\"turn_angle\" id=\"[K`(jVzI{5n6O_S*(mdC\"><field name=\"turndire\">left</field><field name=\"turnangle\">120</field></block></next></block></statement></block></next></block></xml>','2019-06-05 12:51:29',1),(1,1002,1,'<xml xmlns=\"http://www.w3.org/1999/xhtml\"><variables><variable type=\"\" id=\"=Rj5=;9L:pPQEck]Jl%b\">i</variable></variables><block type=\"start_block\" id=\"THO#YiX,n7^~vRIE`SyC\" x=\"10\" y=\"10\"><next><block type=\"controls_for\" id=\"zo~3EVfc.^GBecZr{rk2\"><field name=\"VAR\" id=\"=Rj5=;9L:pPQEck]Jl%b\" variabletype=\"\">i</field><value name=\"FROM\"><block type=\"math_number\" id=\"U4kX~knMBQevt%%:K6IB\"><field name=\"NUM\">50</field></block></value><value name=\"TO\"><block type=\"math_number\" id=\".I+`+-.O2ui|P/q^^}c}\"><field name=\"NUM\">100</field></block></value><value name=\"BY\"><block type=\"math_number\" id=\"2PL[NzYj[-0]xbT{kEX}\"><field name=\"NUM\">10</field></block></value><statement name=\"DO\"><block type=\"controls_repeat_ext\" id=\"m/`c=9+9d1N7ch)osd[i\"><value name=\"TIMES\"><block type=\"math_number\" id=\"wbN^,z@V.}yoG{_=TZ,4\"><field name=\"NUM\">3</field></block></value><statement name=\"DO\"><block type=\"lr_move\" id=\"i,YLV_,uCdU?TfDM3=,m\"><field name=\"move\">moveforward</field><value name=\"NAME\"><block type=\"variables_get\" id=\"zOfhA7=|mj@aeKo1.G,E\"><field name=\"VAR\" id=\"=Rj5=;9L:pPQEck]Jl%b\" variabletype=\"\">i</field></block></value><next><block type=\"turn_angle\" id=\"id0TiwA$r+D7ze2o=FOJ\"><field name=\"turndire\">left</field><field name=\"turnangle\">120</field></block></next></block></statement></block></statement></block></next></block></xml>','2019-06-11 11:03:31',1),(1,1201,NULL,'<xml xmlns=\"http://www.w3.org/1999/xhtml\"><block type=\"start_block\" id=\"4#+Egj.VinjwM.G#N.2n\" x=\"10\" y=\"10\"><next><block type=\"controls_repeat_ext\" id=\"q!2j$rUs.44{bs.N=%G:\"><value name=\"TIMES\"><shadow type=\"math_number\" id=\"J/R(%@-~uI?,%U67,b#7\"><field name=\"NUM\">4</field></shadow></value><statement name=\"DO\"><block type=\"movepx\" id=\"Z:To#A~sEMG*JWgjpCZ]\"><field name=\"moveDirection\">moveForward</field><field name=\"pixelNumber\">100</field><next><block type=\"turn\" id=\"toaPZ=@$9vmmw0AP4w4+\"><field name=\"direction\">turnLeft</field><field name=\"degree\">90</field></block></next></block></statement></block></next></block></xml>','2019-06-05 11:08:41',1),(6,901,1,'<xml xmlns=\"http://www.w3.org/1999/xhtml\"><block type=\"start_block\" id=\"a}?~y_YAex,OMKhG04LT\" x=\"10\" y=\"10\"><next><block type=\"controls_repeat_ext\" id=\"__SVwJ6v?mTS]Eg.S%{E\"><value name=\"TIMES\"><block type=\"math_number\" id=\"1I|`@E^#6SK({A91ZyS7\"><field name=\"NUM\">5</field></block></value><statement name=\"DO\"><block type=\"move\" id=\"u4{|~gOzfRO,L4mi:tq;\"><next><block type=\"lr_gatherhoney\" id=\"#va7s/WfSk2tFx4WG0Pa\"></block></next></block></statement></block></next></block></xml>','2019-06-05 12:57:04',1),(6,1001,2,'<xml xmlns=\"http://www.w3.org/1999/xhtml\"><block type=\"start_block\" id=\"cu*Tp7h8U0gon00SzeoN\" x=\"10\" y=\"10\"><next><block type=\"controls_repeat_ext\" id=\",D@kdiv=$3A{lC+HMX-%\"><value name=\"TIMES\"><block type=\"math_number\" id=\"0vp*O4D}wYrizregre[,\"><field name=\"NUM\">3</field></block></value><statement name=\"DO\"><block type=\"move_step\" id=\"w;Eq]BmLjb7h]MHChL^f\"><field name=\"move\">moveforward</field><field name=\"step\">50</field><next><block type=\"turn_angle\" id=\"hAc=RN3(J1{_H:H-F{=2\"><field name=\"turndire\">left</field><field name=\"turnangle\">120</field></block></next></block></statement></block></next></block></xml>','2019-06-05 13:03:35',1),(6,1002,1,'<xml xmlns=\"http://www.w3.org/1999/xhtml\"><variables><variable type=\"\" id=\"kq)`*fjC1!HHWUFv?+oY\">i</variable></variables><block type=\"start_block\" id=\"3[G5k9H`BHa8XyV~)TD[\" x=\"10\" y=\"10\"><next><block type=\"controls_for\" id=\"qoK;!E9VN$|bYOW8t,R;\"><field name=\"VAR\" id=\"kq)`*fjC1!HHWUFv?+oY\" variabletype=\"\">i</field><value name=\"FROM\"><block type=\"math_number\" id=\"r#3!~Pg[+F}-jV`$`|pu\"><field name=\"NUM\">50</field></block></value><value name=\"TO\"><block type=\"math_number\" id=\"l@7Z*psdt%KphwdF*y^%\"><field name=\"NUM\">100</field></block></value><value name=\"BY\"><block type=\"math_number\" id=\"0}MxOFc|$]4m.r53jR4b\"><field name=\"NUM\">10</field></block></value><statement name=\"DO\"><block type=\"controls_repeat_ext\" id=\"M5?x,XHKOaP9f#0f#$WK\"><value name=\"TIMES\"><block type=\"math_number\" id=\"zl0A7m~%Oik3?;KXEfeg\"><field name=\"NUM\">3</field></block></value><statement name=\"DO\"><block type=\"lr_move\" id=\"9x.O4,dL8p!~9I$V%m6;\"><field name=\"move\">moveforward</field><value name=\"NAME\"><block type=\"variables_get\" id=\"iqEYp8yJrFYKWEAbJ`BQ\"><field name=\"VAR\" id=\"kq)`*fjC1!HHWUFv?+oY\" variabletype=\"\">i</field></block></value><next><block type=\"turn_angle\" id=\"_}U#J~9pq[Cj(y9wH!0d\"><field name=\"turndire\">left</field><field name=\"turnangle\">120</field></block></next></block></statement></block></statement></block></next></block></xml>','2019-06-05 16:21:56',1),(6,1003,1,'<xml xmlns=\"http://www.w3.org/1999/xhtml\"><variables><variable type=\"\" id=\"{r7zP[ajf^:?lx1na:F$\">i</variable></variables><block type=\"start_block\" id=\"4Ctf*Z|g7h8,v(NFnd(v\" x=\"10\" y=\"10\"><next><block type=\"controls_for\" id=\"c/T$d738Ic(rk];kXT2c\"><field name=\"VAR\" id=\"{r7zP[ajf^:?lx1na:F$\" variabletype=\"\">i</field><value name=\"FROM\"><block type=\"math_number\" id=\"b{`d|/_*:3mOqya$R=x|\"><field name=\"NUM\">20</field></block></value><value name=\"TO\"><block type=\"math_number\" id=\"Sucl18XefRXrLFjwW;U_\"><field name=\"NUM\">200</field></block></value><value name=\"BY\"><block type=\"math_number\" id=\"FhJ.JU[Df3*ME:S#JFme\"><field name=\"NUM\">20</field></block></value><statement name=\"DO\"><block type=\"controls_repeat_ext\" id=\"pFPM;|?f#/P).C16*)Z3\"><value name=\"TIMES\"><block type=\"math_number\" id=\"iHH_5VO?:nalrJ/!xz2#\"><field name=\"NUM\">3</field></block></value><statement name=\"DO\"><block type=\"lr_move\" id=\"d/$qeTJk$A5!N:4:IFQy\"><field name=\"move\">moveforward</field><value name=\"NAME\"><block type=\"variables_get\" id=\"|EKOAT}lOfm`I4y;G?e2\"><field name=\"VAR\" id=\"{r7zP[ajf^:?lx1na:F$\" variabletype=\"\">i</field></block></value><next><block type=\"turn_angle\" id=\"~J%3{(Wj;m6!_ba_7e1u\"><field name=\"turndire\">left</field><field name=\"turnangle\">120</field></block></next></block></statement></block></statement></block></next></block></xml>','2019-06-09 23:12:16',1);
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
INSERT INTO `student` VALUES (1,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(6,NULL,NULL,'rgzhang@team.ustc.sse.blockly',24,'17181574827','USTC',NULL,NULL,NULL,'2019-06-05 12:55:20'),(7,NULL,NULL,'',NULL,'','',NULL,NULL,NULL,'2019-06-11 11:02:25');
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
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `studentlogin`
--

LOCK TABLES `studentlogin` WRITE;
/*!40000 ALTER TABLE `studentlogin` DISABLE KEYS */;
INSERT INTO `studentlogin` VALUES (1,'nihaonihao','123456','as'),(2,'qqq','asd','aaa'),(4,'qq2q','asd','aaa'),(5,'nihaonihao2','123456','rgzhang'),(6,'demo1','123456','测试人员'),(7,'nihaonihao23','123456','123123');
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
) ENGINE=InnoDB AUTO_INCREMENT=96 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `studentloginmessage`
--

LOCK TABLES `studentloginmessage` WRITE;
/*!40000 ALTER TABLE `studentloginmessage` DISABLE KEYS */;
INSERT INTO `studentloginmessage` VALUES (15,1,'0:0:0:0:0:0:0:1','2019-04-14 17:04:47',NULL),(16,1,'192.168.3.16','2019-04-14 17:09:36',NULL),(17,1,'0:0:0:0:0:0:0:1','2019-04-14 22:31:12',NULL),(18,1,'0:0:0:0:0:0:0:1','2019-04-14 22:31:58',NULL),(19,1,'0:0:0:0:0:0:0:1','2019-04-14 22:38:31',NULL),(20,1,'0:0:0:0:0:0:0:1','2019-04-14 22:44:41',NULL),(21,1,'192.168.3.11','2019-04-14 23:13:16',NULL),(22,1,'192.168.3.16','2019-04-14 23:15:03',NULL),(23,1,'0:0:0:0:0:0:0:1','2019-04-17 23:28:13',NULL),(24,1,'0:0:0:0:0:0:0:1','2019-04-17 23:29:39',NULL),(25,1,'192.168.3.16','2019-04-17 23:31:24',NULL),(26,1,'192.168.3.16','2019-04-17 23:31:39',NULL),(27,1,'0:0:0:0:0:0:0:1','2019-04-17 23:39:33',NULL),(28,1,'192.168.3.16','2019-04-17 23:39:36',NULL),(29,1,'192.168.3.16','2019-04-17 23:42:24',NULL),(30,1,'0:0:0:0:0:0:0:1','2019-04-17 23:44:55',NULL),(31,1,'0:0:0:0:0:0:0:1','2019-04-18 08:43:45',NULL),(32,1,'0:0:0:0:0:0:0:1','2019-05-24 22:33:35',NULL),(33,1,'0:0:0:0:0:0:0:1','2019-05-25 14:30:56',NULL),(34,1,'0:0:0:0:0:0:0:1','2019-05-25 14:31:57',NULL),(35,1,'127.0.0.1','2019-05-28 12:14:50','nihaonihao'),(36,1,'127.0.0.1','2019-05-28 12:20:14','nihaonihao'),(37,1,'127.0.0.1','2019-05-28 16:02:06','nihaonihao'),(38,1,'127.0.0.1','2019-05-28 16:05:12','nihaonihao'),(39,1,'127.0.0.1','2019-05-28 16:28:34','nihaonihao'),(40,1,'127.0.0.1','2019-05-28 19:17:30','nihaonihao'),(41,1,'127.0.0.1','2019-05-29 11:04:43','nihaonihao'),(42,1,'127.0.0.1','2019-05-29 11:07:32','nihaonihao'),(43,1,'127.0.0.1','2019-05-29 11:07:53','nihaonihao'),(44,1,'127.0.0.1','2019-05-29 11:08:06','nihaonihao'),(45,1,'127.0.0.1','2019-05-29 11:08:16','nihaonihao'),(46,1,'127.0.0.1','2019-05-29 11:09:37','nihaonihao'),(47,1,'127.0.0.1','2019-05-29 11:12:09','nihaonihao'),(48,1,'127.0.0.1','2019-05-29 11:12:52','nihaonihao'),(49,1,'127.0.0.1','2019-05-29 11:13:49','nihaonihao'),(50,1,'127.0.0.1','2019-05-29 11:14:40','nihaonihao'),(51,1,'127.0.0.1','2019-05-29 11:15:15','nihaonihao'),(52,1,'127.0.0.1','2019-05-29 11:20:43','nihaonihao'),(53,1,'127.0.0.1','2019-05-29 11:22:15','nihaonihao'),(54,1,'127.0.0.1','2019-05-29 11:24:02','nihaonihao'),(55,1,'127.0.0.1','2019-05-29 11:24:30','nihaonihao'),(56,1,'127.0.0.1','2019-05-29 11:25:53','nihaonihao'),(57,1,'127.0.0.1','2019-05-29 11:30:04','nihaonihao'),(58,1,'127.0.0.1','2019-05-29 11:33:38','nihaonihao'),(59,1,'127.0.0.1','2019-05-29 11:34:09','nihaonihao'),(60,1,'127.0.0.1','2019-05-29 11:36:20','nihaonihao'),(61,1,'127.0.0.1','2019-05-29 11:37:35','nihaonihao'),(62,1,'127.0.0.1','2019-05-29 11:40:40','nihaonihao'),(63,1,'127.0.0.1','2019-05-29 11:42:32','nihaonihao'),(64,1,'127.0.0.1','2019-05-29 11:43:08','nihaonihao'),(65,1,'127.0.0.1','2019-05-29 11:45:27','nihaonihao'),(66,1,'127.0.0.1','2019-05-29 11:45:56','nihaonihao'),(67,1,'127.0.0.1','2019-05-29 11:46:12','nihaonihao'),(68,1,'127.0.0.1','2019-05-29 12:54:44','nihaonihao'),(69,1,'127.0.0.1','2019-05-29 13:04:38','nihaonihao'),(70,1,'127.0.0.1','2019-05-29 13:26:54','nihaonihao'),(71,1,'127.0.0.1','2019-05-29 15:26:03','nihaonihao'),(72,1,'127.0.0.1','2019-05-29 16:30:59','nihaonihao'),(73,1,'127.0.0.1','2019-05-30 11:04:55','nihaonihao'),(74,1,'127.0.0.1','2019-05-30 11:05:29','nihaonihao'),(75,1,'127.0.0.1','2019-05-30 11:08:07','nihaonihao'),(76,1,'127.0.0.1','2019-05-30 11:08:54','nihaonihao'),(77,1,'127.0.0.1','2019-05-30 11:10:53','nihaonihao'),(78,1,'127.0.0.1','2019-05-30 11:18:09','nihaonihao'),(79,1,'127.0.0.1','2019-05-30 23:16:56','nihaonihao'),(80,1,'127.0.0.1','2019-05-31 08:35:17','nihaonihao'),(81,1,'127.0.0.1','2019-06-05 10:46:34','nihaonihao'),(82,1,'127.0.0.1','2019-06-05 12:55:25','nihaonihao'),(83,6,'127.0.0.1','2019-06-05 12:56:14','demo1'),(84,6,'127.0.0.1','2019-06-05 13:36:12','demo1'),(85,6,'127.0.0.1','2019-06-05 16:20:40','demo1'),(86,6,'127.0.0.1','2019-06-09 22:34:41','demo1'),(87,6,'127.0.0.1','2019-06-09 22:42:45','demo1'),(88,6,'127.0.0.1','2019-06-09 22:44:49','demo1'),(89,6,'127.0.0.1','2019-06-09 22:47:05','demo1'),(90,6,'127.0.0.1','2019-06-09 22:56:26','demo1'),(91,6,'127.0.0.1','2019-06-09 23:10:49','demo1'),(92,1,'127.0.0.1','2019-06-11 11:02:29','nihaonihao'),(93,1,'127.0.0.1','2019-06-14 12:55:04','nihaonihao'),(94,1,'127.0.0.1','2019-06-16 23:10:31','nihaonihao'),(95,1,'127.0.0.1','2019-06-17 00:16:53','nihaonihao');
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

-- Dump completed on 2019-06-17 23:14:11
