-- ----------------- TP 1: SQL ------------------
-- ----------------------------------------------
-- ON MET DES COMMENTAIRE AVEC -- ou #
-- TOOLS: https://ide.goorm.io/my/dashboard (no installation required) OU XAMPP (to be installed) OU MAMP (to be installed)

-- WHEN USING https://ide.goorm.io: 
    -- START MYSQL WITH : mysql-ctl cli
    -- SET THE DATABASES WITH: source compagnie_aerienne.sql

-- TO GET INFORMATION: describe avions


-- # Création de la base de données
DROP DATABASE IF EXISTS COMPAGNIE_AERIENNE;
CREATE DATABASE IF NOT EXISTS COMPAGNIE_AERIENNE;

-- Sélection de la base de données
USE COMPAGNIE_AERIENNE;

-- Création de la table PILOTES
CREATE TABLE IF NOT EXISTS pilotes (
    id_pilote INT NOT NULL AUTO_INCREMENT,
    lname VARCHAR(50),
    fname VARCHAR(50),
    address VARCHAR(100),
    PRIMARY KEY(id_pilote)
) ENGINE=INNODB;


-- Création de la table AVIONS
CREATE TABLE IF NOT EXISTS avions (
    id_avion INT NOT NULL,
    fabricant VARCHAR(50),
    modele VARCHAR(50),
    localite VARCHAR(100),
    capacite int,
    PRIMARY KEY(id_avion)
) ENGINE=INNODB;

-- Création de la table VOLS
CREATE TABLE IF NOT EXISTS vols (
    numero_vol INT NOT NULL AUTO_INCREMENT,
    id_pilote INT NOT NULL,
    id_avion INT NOT NULL,
    ville_depart VARCHAR(100),
    ville_arrivee VARCHAR(100),
    heure_depart TIME,
    heure_arrivee TIME,
    PRIMARY KEY(numero_vol),
    FOREIGN KEY (id_pilote) REFERENCES pilotes(id_pilote),
    FOREIGN KEY (id_avion) REFERENCES avions(id_avion)
) ENGINE=INNODB;

-- ----------------- TP 2: SQL ------------------
-- ----------------------------------------------

-- 1. INSERTION DE DONNEES DANS LA TABLE AVIONS 
INSERT INTO avions (id_avion, fabricant, modele, capacite, localite) 
VALUES (111, "BOEING", 787, 300, "NAIROBI"), (112, "BOEING", 737, 250, "SIDNEY"), (113, "AIRBUS", 320, 220, "MILAN"), (114, "AVIC", 250, 150, "PEKIN")

-- 2. Afficher tous les avions
SELECT * FROM avions;

-- 3. Afficher tous les avions par ordre croissant sur le fabricant
SELECT * FROM avions ORDER BY fabricant ASC;

-- 4. Afficher les noms et les capacités des avions
SELECT capacite FROM avions;

-- 5. Afficher les localités des avions sans redondance
SELECT DISTINCT(localite) from avions;

-- 6. Afficher les avions dont la localité est NAIROBI ou MILAN
SELECT * FROM avions WHERE localite = "NAIROBI" OR localite="MILAN";

-- 7. Modifier la capacité de l’avion numéro 113, la nouvelle capacité et 400
UPDATE avions SET capacite=400 where id_avion=113;

-- 8. Supprimer les avions dont la capacité est inférieure à 200
DELETE FROM avions WHERE capacite < 200;

-- 9. Afficher la capacité maximale, minimale, moyenne des avions
SELECT MAX(capacite) AS MAX_CAPACITY, MIN(capacite) AS MIN_CAPACITY, AVG(capacite) AS MEAN_CAPACITY FROM avions;

-- 10. Afficher les données des avions dont la capacité est la plus basse
SELECT * FROM avions WHERE capacite = (SELECT MIN(capacite) FROM avions);

-- 11. Afficher les données des avions dont la capacité et supérieure à la capacité moyenne
SELECT * FROM avions WHERE capacite > (SELECT avg(capacite) FROM avions);

-- 12. Afficher le nom et l’adresse des pilotes assurant les vols IT100 et IT104

-- 13. Afficher les numéros des pilotes qui sont en service

-- 14. Afficher les numéros des pilotes qui ne sont pas en service

-- 15. Afficher les noms des pilotes qui conduisent un AIRBUS
