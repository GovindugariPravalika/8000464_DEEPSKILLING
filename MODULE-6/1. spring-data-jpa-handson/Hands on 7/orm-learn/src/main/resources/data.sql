CREATE DATABASE IF NOT EXISTS ormlearn;

USE ormlearn;

CREATE TABLE IF NOT EXISTS country(
    co_code VARCHAR(2) PRIMARY KEY,
    co_name VARCHAR(50)
);

INSERT IGNORE INTO country VALUES ('IN','India');
INSERT IGNORE INTO country VALUES ('US','United States of America');