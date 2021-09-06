-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema new_schema
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema new_schema
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `new_schema` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `new_schema` ;

-- -----------------------------------------------------
-- Table `new_schema`.`USER`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `new_schema`.`USER` (
  `ID` INT NOT NULL AUTO_INCREMENT,
  `FIRST_NAME` VARCHAR(45) NOT NULL,
  `LAST_NAME` VARCHAR(45) NOT NULL,
  `EMAIL` VARCHAR(45) NOT NULL,
  `ROLE` VARCHAR(45) NOT NULL,
  `CREATED_AT` TIMESTAMP NULL DEFAULT NULL,
  `UPDATED_AT` TIMESTAMP NULL DEFAULT NULL,
  PRIMARY KEY (`ID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `new_schema`.`subscription`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `new_schema`.`subscription` (
  `ID` INT NOT NULL AUTO_INCREMENT,
  `COURSE_ID` INT NOT NULL,
  `PROGRESS` DOUBLE NULL DEFAULT NULL,
  `STATUS` VARCHAR(45) NULL DEFAULT NULL,
  `UPDATED_AT` TIMESTAMP NULL DEFAULT NULL,
  `CREATED_AT` TIMESTAMP NULL DEFAULT NULL,
  `USER_ID` INT NOT NULL,
  PRIMARY KEY (`ID`, `USER_ID`),
  INDEX `fk_subscription_COURSE_ID` (`COURSE_ID` ASC) VISIBLE,
  INDEX `fk_subscription_USER1_idx` (`USER_ID` ASC) VISIBLE,
  CONSTRAINT `fk_subscription_USER1`
    FOREIGN KEY (`USER_ID`)
    REFERENCES `new_schema`.`USER` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `new_schema`.`course`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `new_schema`.`course` (
  `ID` INT NOT NULL AUTO_INCREMENT,
  `NAME` VARCHAR(45) NULL DEFAULT NULL,
  `CATEGORY` VARCHAR(45) NULL DEFAULT NULL,
  `WORKLOAD` DOUBLE NULL DEFAULT NULL,
  `STATUS` VARCHAR(45) NULL DEFAULT NULL,
  `HAS_CERTIFICATE` TINYINT(1) NULL DEFAULT NULL,
  `EVALUATION` DOUBLE NULL DEFAULT NULL,
  `CREATED_AT` TIMESTAMP NOT NULL,
  `UPDATED_AT` TIMESTAMP NOT NULL,
  `subscription_ID` INT NOT NULL,
  `course_lesson_ID` INT NOT NULL,
  PRIMARY KEY (`ID`, `course_lesson_ID`),
  UNIQUE INDEX `ID_UNIQUE` (`ID` ASC) VISIBLE,
  CONSTRAINT `fk_course_subscription1`
    FOREIGN KEY (`ID`)
    REFERENCES `new_schema`.`subscription` (`COURSE_ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `new_schema`.`certificate`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `new_schema`.`certificate` (
  `ID` INT NOT NULL AUTO_INCREMENT,
  `COURSE_ID` INT NULL DEFAULT NULL,
  `ISSUED_AT` TIMESTAMP NULL DEFAULT NULL,
  `CREATED_AT` TIMESTAMP NULL DEFAULT NULL,
  `UPDATED_AT` TIMESTAMP NULL DEFAULT NULL,
  `USER_ID` INT NOT NULL,
  PRIMARY KEY (`ID`, `USER_ID`),
  INDEX `fk_certificate_course1_idx` (`COURSE_ID` ASC) VISIBLE,
  INDEX `fk_certificate_USER1_idx` (`USER_ID` ASC) VISIBLE,
  CONSTRAINT `fk_certificate_course1`
    FOREIGN KEY (`COURSE_ID`)
    REFERENCES `new_schema`.`course` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_certificate_USER1`
    FOREIGN KEY (`USER_ID`)
    REFERENCES `new_schema`.`USER` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `new_schema`.`course_approval`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `new_schema`.`course_approval` (
  `ID` INT NOT NULL AUTO_INCREMENT,
  `COURSE_ID` INT NULL DEFAULT NULL,
  `APPROVED_BY` VARCHAR(45) NULL DEFAULT NULL,
  `CREATED_AT` TIMESTAMP NULL DEFAULT NULL,
  `UPDATED_AR` TIMESTAMP NULL DEFAULT NULL,
  PRIMARY KEY (`ID`),
  INDEX `fk_course_approval_course1_idx` (`COURSE_ID` ASC) VISIBLE,
  CONSTRAINT `fk_course_approval_course1`
    FOREIGN KEY (`COURSE_ID`)
    REFERENCES `new_schema`.`course` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `new_schema`.`course_lesson`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `new_schema`.`course_lesson` (
  `ID` INT NOT NULL AUTO_INCREMENT,
  `COURSE_ID` INT NULL DEFAULT NULL,
  `TITLE` VARCHAR(45) NULL DEFAULT NULL,
  `DURATION` DOUBLE NULL DEFAULT NULL,
  `CREATED_AT` TIMESTAMP NULL DEFAULT NULL,
  `UPDATED_AT` TIMESTAMP NULL DEFAULT NULL,
  `course_ID` INT NOT NULL,
  PRIMARY KEY (`ID`, `course_ID`),
  INDEX `FK_INDEX_COURSEID` (`COURSE_ID` ASC) VISIBLE,
  INDEX `fk_course_lesson_course1_idx` (`course_ID` ASC) VISIBLE,
  CONSTRAINT `fk_course_lesson_course1`
    FOREIGN KEY (`course_ID`)
    REFERENCES `new_schema`.`course` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
