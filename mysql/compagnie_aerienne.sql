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
-- 1. INSERTION DE DONNEES 
-- INSERTION DE DONNEES DANS LA TABLE AVIONS 
INSERT INTO avions (id_avion, fabricant, modele, capacite, localite) 
VALUES (111, "BOEING", 787, 300, "NAIROBI"), (112, "BOEING", 737, 250, "SIDNEY"), (113, "AIRBUS", 320, 220, "MILAN"), (114, "AVIC", 250, 150, "PEKIN");

-- INSERTION DE DONNEES DANS LA TABLE PILOTES 
INSERT INTO pilotes(
    lname, fname, address
) VALUES 
    ("Baldé", "Djiby", "147 Val-d'Oise, 75000 PARIS"),
    ("Fontaine", "Elodie", "7 Bouguenais, 44000 NANTES"),
    ("Noubissi", "Wilfried", "202 SIDNEY, XXXXX SIDNEY"),
    ("Diamanka", "Yacine", "170 MONTREAL, XXXXX MONTREAL"),
    ("Kandé", "Ousmane", "230 MILAN, XXXXX MILAN");

-- INSERTION DE DONNEES DANS LA TABLE VOLS 
INSERT INTO vols(
    id_pilote, id_avion, numero_vol, 
    ville_depart, ville_arrivee, 
    heure_depart, heure_arrivee
) VALUES 
    (3, 111, "IT100", "SIDNEY", "LONDRE", "09:57:26", NULL),
    (5, 112, "IT101", "MILAN", "BERLIN", "02:30:19", NULL),
    (4, 113, "IT102", "MONTREAL", "TORONTO", "17:20:00", "19:00:00"),
    (1, 114, "IT104", "PARIS", "TORONTO", NULL, NULL);


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


-- 12. Afficher les noms et adresses des pilotes assurant les vols IT100 et IT104
SELECT pilotes.lname, pilotes.fname, pilotes.adresse
    FROM pilotes INNER JOIN vols ON pilotes.id_pilote = vols.id_pilote 
    WHERE vols.numero_vol = "IT100" OR vols.numero_vol = "IT104";

-- 13. Afficher les noms et adresses des pilotes qui sont en service
SELECT pilotes.lname, pilotes.fname, pilotes.adresse
    FROM pilotes 
        INNER JOIN vols ON pilotes.id_pilote = vols.id_pilote 
        WHERE ISNULL(vols.heure_arrivee) AND NOT ISNULL(vols.heure_depart);

-- 14. Afficher les noms et adresses des pilotes qui ne sont pas en service
SELECT pilotes.lname, pilotes.fname, pilotes.adresse
    FROM pilotes 
        INNER JOIN vols ON pilotes.id_pilote = vols.id_pilote 
        WHERE (NOT ISNULL(vols.heure_arrivee) AND NOT ISNULL(vols.heure_depart)) 
        OR (ISNULL(vols.heure_arrivee) AND ISNULL(vols.heure_depart));

-- 15. Afficher les noms des pilotes qui conduisent un AIRBUS
SELECT pilotes.lname, pilotes.fname 
    FROM vols 
        INNER JOIN avions ON vols.id_avion = avions.id_avion 
        INNER JOIN pilotes ON vols.id_pilote = pilotes.id_pilote 
        WHERE fabricant = 'AIRBUS';