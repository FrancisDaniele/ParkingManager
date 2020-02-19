CREATE DATABASE  IF NOT EXISTS `parking_manager` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `parking_manager`;
-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: parking_manager
-- ------------------------------------------------------
-- Server version	8.0.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `parkings`
--

DROP TABLE IF EXISTS `parkings`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `parkings` (
  `par_id` int NOT NULL,
  `par_name` varchar(45) NOT NULL,
  `par_municipio` varchar(45) DEFAULT NULL,
  `par_pDisponibles` int DEFAULT NULL,
  `par_pTotales` int DEFAULT NULL,
  PRIMARY KEY (`par_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `parkings`
--

LOCK TABLES `parkings` WRITE;
/*!40000 ALTER TABLE `parkings` DISABLE KEYS */;
INSERT INTO `parkings` VALUES (1,'Parking Estación Intermodal','Palma',39,50),(2,'Parking Parque del Mar','Palma',22,50),(3,'Parking Ocimax','Palma',19,50);
/*!40000 ALTER TABLE `parkings` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `use_Document` varchar(20) NOT NULL,
  `use_mail` varchar(45) NOT NULL,
  `use_name` varchar(45) NOT NULL,
  `use_surnames` varchar(45) NOT NULL,
  `use_telephone` varchar(20) DEFAULT NULL,
  `use_veh1` varchar(20) DEFAULT NULL,
  `use_veh1Electrico` varchar(20) DEFAULT NULL,
  `use_veh2` varchar(20) DEFAULT NULL,
  `use_veh2Electrico` varchar(20) DEFAULT NULL,
  `use_veh3` varchar(20) DEFAULT NULL,
  `use_veh3Electrico` varchar(20) DEFAULT NULL,
  `use_password` varchar(45) NOT NULL,
  PRIMARY KEY (`use_Document`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES ('43167147B','fdj00@iesemilidarder.com','Francis','Daniele Juncosa','601210462','0711 VIG','TRUE','2608 ZJC','',NULL,NULL,'123qweASD'),('44172238C','pepito@gmail.com','Jose','Garcia Perez','666666666','4949 PCU','FALSE',NULL,'',NULL,NULL,'123qweASD'),('45278134G','mtc@gemail.com','Marta','Torres Matas','646121314','6794 VRX','FALSE','1328 ERP','TRUE','4185 FUY','FALSE','123qweASD');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-02-19 13:35:42
