-- MariaDB dump 10.19  Distrib 10.4.25-MariaDB, for Win64 (AMD64)
--
-- Host: localhost    Database: dbRistoranti
-- ------------------------------------------------------
-- Server version	10.4.25-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `comuni`
--

DROP TABLE IF EXISTS `comuni`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `comuni` (
  `CAP` int(5) NOT NULL,
  `nome` varchar(255) NOT NULL,
  PRIMARY KEY (`CAP`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comuni`
--

LOCK TABLES `comuni` WRITE;
/*!40000 ALTER TABLE `comuni` DISABLE KEYS */;
INSERT INTO `comuni` VALUES (31020,'Villorba'),(31022,'Preganziol'),(31029,'Vittorio Veneto'),(31032,'Casale sul Sile'),(31055,'Quinto di Treviso'),(31059,'Zero Branco');
/*!40000 ALTER TABLE `comuni` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ristoranti`
--

DROP TABLE IF EXISTS `ristoranti`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ristoranti` (
  `cod_rist` int(10) unsigned zerofill NOT NULL AUTO_INCREMENT,
  `nome` varchar(255) NOT NULL,
  `sitoWeb_social` varchar(255) DEFAULT NULL,
  `tipologia` enum('misto','caffe','cinese','fast food','indiana','giapponese','mexicana','italiana settentrionale','pizzeria','pesce','italiana meridionale','vegetariana','enoteca') DEFAULT 'misto',
  `locazione` varchar(255) NOT NULL,
  `recensione_media` decimal(2,1) NOT NULL,
  `telefono` bigint(12) DEFAULT NULL,
  `descrizione` varchar(255) DEFAULT NULL,
  `cap` int(5) NOT NULL,
  `id_serv` int(10) unsigned zerofill NOT NULL,
  PRIMARY KEY (`cod_rist`),
  KEY `cap` (`cap`),
  KEY `id_serv` (`id_serv`),
  CONSTRAINT `rist_com` FOREIGN KEY (`cap`) REFERENCES `comuni` (`CAP`) ON UPDATE CASCADE,
  CONSTRAINT `rist_serv` FOREIGN KEY (`id_serv`) REFERENCES `servizi` (`ID_Serv`) ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ristoranti`
--

LOCK TABLES `ristoranti` WRITE;
/*!40000 ALTER TABLE `ristoranti` DISABLE KEYS */;
/*!40000 ALTER TABLE `ristoranti` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `servizi`
--

DROP TABLE IF EXISTS `servizi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `servizi` (
  `ID_Serv` int(10) unsigned zerofill NOT NULL AUTO_INCREMENT,
  `asporto` tinyint(1) NOT NULL,
  `cons_posto` tinyint(1) NOT NULL,
  `ser_domicilio` tinyint(1) NOT NULL,
  `rist_pranzo` tinyint(1) NOT NULL,
  `rist_cena` tinyint(1) NOT NULL,
  `WiFi` tinyint(1) NOT NULL,
  `toilette` tinyint(1) NOT NULL,
  PRIMARY KEY (`ID_Serv`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `servizi`
--

LOCK TABLES `servizi` WRITE;
/*!40000 ALTER TABLE `servizi` DISABLE KEYS */;
INSERT INTO `servizi` VALUES (0000000001,1,1,0,1,1,0,1),(0000000002,1,1,1,1,1,1,1),(0000000003,0,0,0,1,1,1,0),(0000000004,0,1,0,0,1,1,1),(0000000005,1,0,0,1,0,0,0);
/*!40000 ALTER TABLE `servizi` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-04-05 23:15:20
