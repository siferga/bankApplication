-- Supprimer la table customer si elle existe
DROP TABLE IF EXISTS customer;

-- Supprimer la table accounts si elle existe
DROP TABLE IF EXISTS accounts;

-- Créer la table customer
CREATE TABLE `customer` (
                            `customer_Id` INT AUTO_INCREMENT PRIMARY KEY,
                            `name` VARCHAR(100) NOT NULL,
                            `email` VARCHAR(100) NOT NULL,
                            `mobile_number` VARCHAR(20) NOT NULL,
                            `create_dt` date DEFAULT NULL
);

CREATE TABLE `accounts` (
                            `customer_id` INT NOT NULL,
                            `account_number` INT AUTO_INCREMENT PRIMARY KEY,
                            `account_type` VARCHAR(100) NOT NULL,
                            `branch_address` VARCHAR(200) NOT NULL,
                            `create_dt` date DEFAULT NULL
);

INSERT INTO `customer` (`name`,`email`,`mobile_number`,`create_dt`)
VALUES ('sfg80','silvia@hotmail.com','008778000', CURDATE());

INSERT INTO `accounts` (`customer_id`,`account_type`,`branch_address`,`create_dt`)
VALUES (1,123456,'80 rue de la Fontaine, Pertuis', CURDATE());
