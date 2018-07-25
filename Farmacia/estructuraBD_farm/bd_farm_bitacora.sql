CREATE DATABASE  IF NOT EXISTS `bd_farm` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `bd_farm`;
-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: bd_farm
-- ------------------------------------------------------
-- Server version	5.6.26-log

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
-- Table structure for table `bitacora`
--

DROP TABLE IF EXISTS `bitacora`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bitacora` (
  `id_Bitacora` int(11) NOT NULL AUTO_INCREMENT,
  `usuario` varchar(25) DEFAULT NULL,
  `fecha_ingreso` varchar(25) DEFAULT NULL,
  `hora_ingreso` varchar(25) DEFAULT NULL,
  `hora_salida` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`id_Bitacora`)
) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bitacora`
--

LOCK TABLES `bitacora` WRITE;
/*!40000 ALTER TABLE `bitacora` DISABLE KEYS */;
INSERT INTO `bitacora` VALUES (1,'admin','2018-7-11','- - - -','00:38:52 PM'),(2,'admin','2018-7-11','00:38:58 PM','- - - -'),(3,'admin','2018-7-11','- - - -','00:39:48 PM'),(4,'admin','2018-7-11','00:40:08 PM','- - - -'),(5,'admin','2018-7-11','- - - -','00:40:49 PM'),(6,'admin','2018-7-11','00:42:47 PM','- - - -'),(7,'admin','2018-7-11','- - - -','00:44:12 PM'),(8,'admin','2018-7-11','00:44:21 PM','- - - -'),(9,'admin','2018-7-11','- - - -','00:45:18 PM'),(10,'admin','2018-7-11','00:45:23 PM','- - - -'),(11,'admin','2018-7-11','- - - -','00:46:48 PM'),(12,'admin','2018-7-11','00:46:55 PM','- - - -'),(13,'admin','2018-7-11','- - - -','00:48:09 PM'),(14,'admin','2018-7-11','00:48:25 PM','- - - -'),(15,'admin','2018-7-11','- - - -','00:49:01 PM'),(16,'admin','2018-7-11','00:49:07 PM','- - - -'),(17,'admin','2018-7-11','- - - -','00:49:42 PM'),(18,'admin','2018-7-11','00:50:17 PM','- - - -'),(19,'admin','2018-7-11','- - - -','00:50:25 PM'),(20,'admin','2018-7-11','00:50:40 PM','- - - -'),(21,'admin','2018-7-11','- - - -','00:54:54 PM'),(22,'admin','2018-7-11','00:56:06 PM','- - - -'),(23,'admin','2018-7-11','- - - -','00:59:46 PM'),(24,'admin','2018-7-11','01:00:54 PM','- - - -'),(25,'admin','2018-7-11','- - - -','01:01:08 PM'),(26,'admin','2018-7-11','01:01:43 PM','- - - -'),(27,'admin','2018-7-11','- - - -','01:11:06 PM'),(28,'admin','2018-7-12','09:53:20 AM','- - - -'),(29,'admin','2018-7-12','- - - -','09:53:23 AM'),(30,'admin','2018-7-12','09:55:51 AM','- - - -'),(31,'admin','2018-7-12','- - - -','09:56:03 AM'),(32,'admin','2018-7-12','09:56:14 AM','- - - -'),(33,'admin','2018-7-12','- - - -','09:56:58 AM'),(34,'admin','2018-7-12','10:22:31 AM','- - - -'),(35,'admin','2018-7-12','- - - -','10:22:36 AM'),(36,'admin','2018-7-12','10:23:21 AM','- - - -'),(37,'admin','2018-7-12','- - - -','10:23:26 AM'),(38,'admin','2018-7-12','10:23:36 AM','- - - -'),(39,'admin','2018-7-12','- - - -','10:23:39 AM'),(40,'vini','2018-7-12','10:27:22 AM','- - - -'),(41,'vini','2018-7-12','- - - -','10:27:35 AM');
/*!40000 ALTER TABLE `bitacora` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-07-12 10:33:22
