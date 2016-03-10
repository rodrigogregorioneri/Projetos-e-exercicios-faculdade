SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL';

CREATE SCHEMA IF NOT EXISTS `prova` DEFAULT CHARACTER SET latin1 ;
USE `prova` ;

-- -----------------------------------------------------
-- Table `prova`.`Produtos`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `prova`.`Produtos` ;

CREATE  TABLE IF NOT EXISTS `prova`.`Produtos` (
  `cod_produto` INT NOT NULL ,
  `nom_produto` VARCHAR(60) NULL ,
  `val_produto` DECIMAL(10,2)  NULL ,
  `in_produto` TINYINT(1)  NULL ,
  PRIMARY KEY (`cod_produto`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `prova`.`Clientes`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `prova`.`Clientes` ;

CREATE  TABLE IF NOT EXISTS `prova`.`Clientes` (
  `cod_cliente` INT NOT NULL ,
  `nom_cliente` VARCHAR(60) NULL ,
  `idade_cliente` INT NULL ,
  `tipo_cliente` VARCHAR(1) NULL ,
  PRIMARY KEY (`cod_cliente`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `prova`.`Cep`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `prova`.`Cep` ;

CREATE  TABLE IF NOT EXISTS `prova`.`Cep` (
  `cod_cep` INT NOT NULL ,
  `desc_cep` VARCHAR(60) NULL ,
  `lat_cep` DECIMAL(10,3)  NULL ,
  `long_cep` DECIMAL(10,3)  NULL ,
  PRIMARY KEY (`cod_cep`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `prova`.`Alunos`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `prova`.`Alunos` ;

CREATE  TABLE IF NOT EXISTS `prova`.`Alunos` (
  `cod_aluno` INT NOT NULL ,
  `desc_aluno` VARCHAR(60) NULL ,
  `rgm_aluno` VARCHAR(8) NULL ,
  `in_aluno` TINYINT(1)  NULL ,
  PRIMARY KEY (`cod_aluno`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `prova`.`Funcionario`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `prova`.`Funcionario` ;

CREATE  TABLE IF NOT EXISTS `prova`.`Funcionario` (
  `cod_funcionario` INT NOT NULL ,
  `nom_funcionario` VARCHAR(60) NULL ,
  `idade_funcionario` INT NULL ,
  `apons_funcionario` TINYINT(1)  NULL ,
  PRIMARY KEY (`cod_funcionario`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `prova`.`Veiculos`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `prova`.`Veiculos` ;

CREATE  TABLE IF NOT EXISTS `prova`.`Veiculos` (
  `cod_veiculos` INT NOT NULL ,
  `desc_veiculos` VARCHAR(60) NULL ,
  `val_veiculos` DECIMAL(10,2)  NULL ,
  `flex_veiculos` TINYINT(1)  NULL ,
  PRIMARY KEY (`cod_veiculos`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `prova`.`Municipios`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `prova`.`Municipios` ;

CREATE  TABLE IF NOT EXISTS `prova`.`Municipios` (
  `cod_municipio` INT NOT NULL ,
  `desc_municipio` VARCHAR(60) NULL ,
  `qtde_habitantes` DECIMAL(10,3)  NULL ,
  `pib_municipio` DECIMAL(10,3)  NULL ,
  PRIMARY KEY (`cod_municipio`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `prova`.`Universidade`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `prova`.`Universidade` ;

CREATE  TABLE IF NOT EXISTS `prova`.`Universidade` (
  `cod_universidade` INT NOT NULL ,
  `nom_universidade` VARCHAR(60) NULL ,
  `qtde_curso` INT NULL ,
  `qtde_alunos` INT NULL ,
  PRIMARY KEY (`cod_universidade`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `prova`.`Bancos`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `prova`.`Bancos` ;

CREATE  TABLE IF NOT EXISTS `prova`.`Bancos` (
  `cod_banco` INT NOT NULL ,
  `desc_banco` VARCHAR(60) NULL ,
  `qtde_agencia` INT NULL ,
  `qtde_funcionarios` INT NULL ,
  PRIMARY KEY (`cod_banco`) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `prova`.`Rodovias`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `prova`.`Rodovias` ;

CREATE  TABLE IF NOT EXISTS `prova`.`Rodovias` (
  `cod_rodovia` INT NOT NULL ,
  `desc_rodovia` VARCHAR(60) NULL ,
  `qtde_kilometros` DECIMAL(10,2)  NULL ,
  `tipo_rodovia` VARCHAR(2) NULL ,
  PRIMARY KEY (`cod_rodovia`) )
ENGINE = InnoDB;



SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
