create database if not exists `test`;

USE `test`;

/*Table structure for table `alunos` */

DROP TABLE IF EXISTS `autores`;

CREATE TABLE `test`.`autores` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `primeiroNome` VARCHAR(50) NULL COMMENT '',
  `segundoNome` VARCHAR(50) NULL COMMENT '',
  PRIMARY KEY (`id`)  COMMENT '');

