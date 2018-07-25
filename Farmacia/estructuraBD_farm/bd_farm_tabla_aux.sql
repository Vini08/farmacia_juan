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
-- Table structure for table `tabla_aux`
--

DROP TABLE IF EXISTS `tabla_aux`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tabla_aux` (
  `Codigo_Producto` varchar(30) NOT NULL,
  `Codigo_Barra` varchar(30) DEFAULT NULL,
  `Categoria` varchar(45) DEFAULT NULL,
  `Producto` varchar(185) DEFAULT NULL,
  `Proveedor` varchar(25) DEFAULT NULL,
  `Descripcion` varchar(1000) DEFAULT NULL,
  `Ubicacion` varchar(25) DEFAULT NULL,
  `Unidades` int(11) DEFAULT NULL,
  `Alerta_Unidades` int(11) DEFAULT NULL,
  `Fecha_Vencimiento` varchar(45) DEFAULT NULL,
  `Precio_Compra` decimal(15,2) DEFAULT NULL,
  `Precio_Venta` decimal(15,2) DEFAULT NULL,
  `Precio_Mayoreo` decimal(15,2) DEFAULT NULL,
  `Precio_Etiqueta` decimal(15,2) DEFAULT NULL,
  `Descuento` varchar(35) DEFAULT NULL,
  `autorizy` varchar(20) DEFAULT NULL,
  `porciones` varchar(45) DEFAULT NULL,
  `cant` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tabla_aux`
--

LOCK TABLES `tabla_aux` WRITE;
/*!40000 ALTER TABLE `tabla_aux` DISABLE KEYS */;
/*!40000 ALTER TABLE `tabla_aux` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-07-12 10:33:23
