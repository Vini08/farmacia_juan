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
-- Table structure for table `proveedor`
--

DROP TABLE IF EXISTS `proveedor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `proveedor` (
  `codigo_proveedor` int(11) NOT NULL AUTO_INCREMENT,
  `proveedor` varchar(25) DEFAULT NULL,
  `tel_proveedor` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`codigo_proveedor`)
) ENGINE=InnoDB AUTO_INCREMENT=64 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `proveedor`
--

LOCK TABLES `proveedor` WRITE;
/*!40000 ALTER TABLE `proveedor` DISABLE KEYS */;
INSERT INTO `proveedor` VALUES (1,'ACANTO','.'),(2,'ACME','.'),(3,'ADAMS','.'),(4,'APROFAM','.'),(5,'AVON','.'),(6,'BE Y FE','.'),(7,'CALIQUIMICA','.'),(8,'CAPLIN','.'),(9,'CAPLIN  2','.'),(10,'CAPLIN 2','.'),(11,'CAPLIN1','.'),(12,'CAPLIN2','.'),(13,'CODISA','.'),(14,'COIDE','.'),(15,'COIDE ','.'),(16,'CRISVI','.'),(17,'DANNY','.'),(18,'DESPENS','.'),(19,'DR HELP','.'),(20,'DROCCISA','.'),(21,'EMANUEL','.'),(22,'EMMANUEL','.'),(23,'FARKOT','.'),(24,'FARMA 3','.'),(25,'FARMALINE','.'),(26,'GENEMEDIC','.'),(27,'GNC X','.'),(28,'GNCX','.'),(29,'HIMALAYA','.'),(30,'JOEL VELASQUEZ','.'),(31,'LAFIMARQ','.'),(32,'LANCASCO','.'),(33,'MEDEX','.'),(34,'MEDRAL','.'),(35,'MOISES','.'),(36,'MS DISTRIBUCIONES','.'),(37,'OTROS','.'),(38,'PEDRO LEO','.'),(39,'PHARMOZ','.'),(40,'PSI','.'),(41,'RELAMPAGO','.'),(42,'RIETI','.'),(43,'ROBERPHARM','.'),(44,'ROLAND LOUIS','.'),(45,'RONY RAMIREZ','.'),(46,'RUIPHARMA','.'),(47,'SAN MATEO','.'),(48,'SANTOCACHON','.'),(49,'SELECTPHARMA','.'),(50,'SEVEN PHARMA','.'),(51,'SHALOM','.'),(52,'SNICKERS ','.'),(53,'SODAS','.'),(54,'TODO DISTRIBUCIONES','.'),(55,'UNIVERSAL','.'),(56,'UNIVERSAL ','.'),(57,'VALENTINA','.'),(58,'WAL X','.'),(59,'WALMX','.'),(60,'WASHINGTON','.'),(61,'WENPHARM','.'),(62,'WHENPHARM','.'),(63,'YULI','.');
/*!40000 ALTER TABLE `proveedor` ENABLE KEYS */;
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
