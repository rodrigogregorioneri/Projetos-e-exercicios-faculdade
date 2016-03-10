/*
SQLyog Community Edition- MySQL GUI v6.05
Host - 5.0.45-community-nt : Database - aula
*********************************************************************
Server version : 5.0.45-community-nt
*/
/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

create database if not exists `aula`;

USE `aula`;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

/*Table structure for table `clientes` */

DROP TABLE IF EXISTS `clientes`;

CREATE TABLE `clientes` (
  `id` int(10) NOT NULL auto_increment,
  `nome` varchar(80) default NULL,
  `data_nasc` varchar(10) default NULL,
  `cpf` varchar(15) default NULL,
  `rg` varchar(20) default NULL,
  `endereco` varchar(100) default NULL,
  `tel1` varchar(15) default NULL,
  `tel2` varchar(15) default NULL,
  `email` varchar(100) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

/*Data for the table `clientes` */

insert  into `clientes`(`id`,`nome`,`data_nasc`,`cpf`,`rg`,`endereco`,`tel1`,`tel2`,`email`) values (4,'Cris','12/01/1970','3333','33333','dasdasd','111','1111','1111');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
