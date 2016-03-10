create database if not exists `aula`;

USE `aula`;

/*Table structure for table `aluno` */

drop table if exists `produto`;

CREATE TABLE `produto` (
  `codigo` int(10) NOT NULL,
  `arqImagem` varchar(40) NOT NULL default '',
  PRIMARY KEY  (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 ROW_FORMAT=DYNAMIC COMMENT='InnoDB free: 4096 kB';

insert into aula.`produto` values (1,'51625A_2000.jpg');
insert into aula.`produto` values (2,'C8727A_2000.jpg');
insert into aula.`produto` values (3,'51625A_small.jpg');
insert into aula.`produto` values (4,'C8727A_small.jpg');
insert into aula.`produto` values (5,'impr_epsonc67_grd.jpg');
insert into aula.`produto` values (6,'impr_epsonc67_small.jpg');
insert into aula.`produto` values (7,'impr_epsonc87_grd.jpg');
insert into aula.`produto` values (8,'impr_epsonc87_small.jpg');
insert into aula.`produto` values (9,'impr_hp3845_grd.jpg');
insert into aula.`produto` values (10,'impr_hp3845_small.jpg');
insert into aula.`produto` values (11,'impr_hp5440_grd.jpg');
insert into aula.`produto` values (12,'impr_hp5440_small.jpg');
insert into aula.`produto` values (13,'impr_hp6540_grd.jpg');
insert into aula.`produto` values (14,'impr_hp6540_small.jpg');
insert into aula.`produto` values (15,'M20-00011_2000.jpg');
insert into aula.`produto` values (16,'M20-00011_small.jpg');
insert into aula.`produto` values (17,'MON33PD40BK_2000.jpg');
insert into aula.`produto` values (18,'MON33PD40BK_small.jpg');
insert into aula.`produto` values (19,'MS-262_2000.jpg');
insert into aula.`produto` values (20,'MS-262_small.jpg');
insert into aula.`produto` values (21,'TU2-ET200_2000.jpg');
insert into aula.`produto` values (22,'TU2-ET200_small.jpg');
insert into aula.`produto` values (23,'TU-400E_2000.jpg');
insert into aula.`produto` values (24,'TU-400E_small.jpg');


CREATE TABLE aula.`notas` (
  `nome` varchar(40) NOT NULL,
  `nota1` float,
  `nota2` float
) ENGINE=InnoDB DEFAULT CHARSET=latin1 ROW_FORMAT=DYNAMIC COMMENT='InnoDB free: 4096 kB';

