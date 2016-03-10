/*
SQLyog Community Edition- MySQL GUI v6.51
MySQL - 5.5.8 : Database - aula
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

create database if not exists `aula`;

USE `aula`;

/*Table structure for table `alunos` */

DROP TABLE IF EXISTS `alunos`;

CREATE TABLE `alunos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `rgm` varchar(7) NOT NULL,
  `nome` varchar(80) NOT NULL,
  `curso` varchar(4) NOT NULL,
  `email` varchar(100) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Data for the table `alunos` */

insert  into `alunos`(`id`,`rgm`,`nome`,`curso`,`email`) values (1,'44','44','CCP','454@fsdfji.comb.r');

/*Table structure for table `clientes` */

DROP TABLE IF EXISTS `clientes`;

CREATE TABLE `clientes` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) NOT NULL,
  `endereco` varchar(45) NOT NULL,
  `cidade` varchar(45) NOT NULL,
  `cep` varchar(9) NOT NULL,
  `estado` varchar(2) NOT NULL,
  `email` varchar(45) NOT NULL,
  `cliente` varchar(1) NOT NULL,
  `estadocivil` varchar(10) NOT NULL,
  `interesse1` varchar(10) NOT NULL,
  `interesse2` varchar(10) NOT NULL,
  `interesse3` varchar(10) NOT NULL,
  `interesse4` varchar(10) NOT NULL,
  `comentario` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Data for the table `clientes` */

insert  into `clientes`(`id`,`nome`,`endereco`,`cidade`,`cep`,`estado`,`email`,`cliente`,`estadocivil`,`interesse1`,`interesse2`,`interesse3`,`interesse4`,`comentario`) values (1,'asdfasdf','ASDFASDF','4','49999999','RJ','DFJI@JC.COM.BR','S','Casado','Fin.Aut.','null','Credito','null','ASDFASDF');

/*Table structure for table `dados` */

DROP TABLE IF EXISTS `dados`;

CREATE TABLE `dados` (
  `nome` varchar(100) DEFAULT NULL,
  `nota1` float DEFAULT NULL,
  `nota2` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `dados` */

insert  into `dados`(`nome`,`nota1`,`nota2`) values ('1',1,1);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
