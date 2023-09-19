CREATE SCHEMA IF NOT EXISTS backend;
SET SCHEMA backend;

CREATE TABLE backend.marca
(
    ID          INT AUTO_INCREMENT NOT NULL,
    NOMBRE     VARCHAR(255) NOT NULL,
    PRIMARY KEY (ID)
);


insert into backend.marca  (ID, NOMBRE) values (1, 'Ferrari');
insert into backend.marca  (ID, NOMBRE) values (2, 'FIAT');
insert into backend.marca  (ID, NOMBRE) values (3, 'Ford');
insert into backend.marca  (ID, NOMBRE) values (4, 'Acura');
insert into backend.marca  (ID, NOMBRE) values (5, 'Alfa Romeo');
insert into backend.marca  (ID, NOMBRE) values (6, 'Audi');
insert into backend.marca  (ID, NOMBRE) values (7, 'Bentley');
insert into backend.marca  (ID, NOMBRE) values (8, 'BMW');
insert into backend.marca  (ID, NOMBRE) values (9, 'Aston Martin');

CREATE TABLE backend.tipo_auto
(
    ID              INT AUTO_INCREMENT NOT NULL,
    NOMBRE          VARCHAR(255) NOT NULL,
    PRIMARY KEY (ID)
);

insert into tipo_auto (ID, NOMBRE) values (1, 'Sedan');
insert into tipo_auto (ID, NOMBRE) values (2, 'Hatchback');
insert into tipo_auto (ID, NOMBRE) values (3, 'Convertible');
insert into tipo_auto (ID, NOMBRE) values (4, 'SUV');
insert into tipo_auto (ID, NOMBRE) values (5, 'Pickup');
insert into tipo_auto (ID, NOMBRE) values (6, 'Coupe');
insert into tipo_auto (ID, NOMBRE) values (7, 'Wagon');

CREATE TABLE backend.modelo
(
    ID          INT AUTO_INCREMENT NOT NULL,
    NOMBRE     VARCHAR(255) NOT NULL,
    ANIO       INT NOT NULL,
    ID_MARCA      INT NOT NULL,
    PRIMARY KEY (ID),
    FOREIGN KEY (ID_MARCA) REFERENCES backend.marca(ID)
);

insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (1, '488 Spider', 2019,1);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (2, '812', 2019,1);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (3, 'GTC4Lusso', 2019,1);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (4, '124 Spider', 2019,2);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (5, '500', 2019,2);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (6, '500 Abarth', 2019,2);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (7, '500c', 2019,2);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (8, '500c Abarth', 2019,2);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (9, '500e', 2019,2);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (10, '500L', 2019,2);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (11, '500X', 2019,2);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (12, 'EcoSport', 2019,3);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (13, 'Edge', 2019,3);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (14, 'Escape', 2019,3);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (15, 'Expedition', 2019,3);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (16, 'Expedition MAX', 2019,3);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (17, 'Explorer', 2019,3);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (18, 'F150 Regular Cab', 2019,3);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (19, 'F150 Super Cab', 2019,3);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (20, 'F150 SuperCrew Cab', 2019,3);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (21, 'ILX', 2020,4);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (22, 'MDX', 2020,4);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (23, 'MDX Sport Hybrid', 2020,4);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (24, 'NSX', 2020,4);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (25, 'RDX', 2020,4);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (26, 'RLX', 2020,4);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (27, 'RLX Sport Hybrid', 2020,4);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (28, 'TLX', 2020,4);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (29, '4C Spider', 2020,5);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (30, 'Giulia', 2020,5);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (31, 'Stelvio', 2020,5);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (32, 'A3', 2020,6);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (33, 'A4', 2020,6);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (34, 'A5', 2020,6);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (35, 'A6', 2020,6);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (36, 'A6 allroad', 2020,6);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (37, 'A7', 2020,6);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (38, 'Q3', 2020,6);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (39, 'S6', 2021,6);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (40, 'S7', 2021,6);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (41, 'S8', 2021,6);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (42, 'SQ5', 2021,6);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (43, 'SQ5 Sportback', 2021,6);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (44, 'SQ7', 2021,6);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (45, 'SQ8', 2021,6);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (46, 'TT', 2021,6);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (47, 'Bentayga', 2021,7);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (48, 'Continental GT', 2021,7);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (49, 'Flying Spur', 2021,7);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (50, '2 Series', 2021,8);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (51, '3 Series', 2021,8);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (52, '4 Series', 2021,8);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (53, '5 Series', 2021,8);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (54, '7 Series', 2021,8);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (55, '8 Series', 2021,8);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (56, 'i3', 2021,8);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (57, 'M2', 2021,8);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (58, 'M3', 2021,8);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (59, 'M4', 2021,8);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (60, 'M5', 2021,8);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (61, 'M8', 2021,8);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (62, 'X1', 2021,8);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (63, 'X2', 2021,8);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (64, 'X3', 2021,8);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (65, 'X3 M', 2021,8);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (66, 'X4', 2021,8);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (67, 'DB11', 2022,9);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (68, 'DBS', 2022,9);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (69, 'DBX', 2022,9);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (70, 'Vantage', 2022,9);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (71, 'A3', 2022,6);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (72, 'A4', 2022,6);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (73, 'A4 allroad', 2022,6);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (74, 'A5', 2022,6);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (75, 'A6', 2022,6);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (76, 'A6 allroad', 2022,6);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (77, 'A7', 2022,6);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (78, 'A8', 2022,6);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (79, 'e-tron', 2022,6);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (80, 'e-tron GT', 2022,6);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (81, 'e-tron S', 2022,6);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (82, 'e-tron S Sportback', 2022,6);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (83, 'e-tron Sportback', 2022,6);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (84, 'Q3', 2022,6);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (85, 'Q4 e-tron', 2022,6);
insert into backend.modelo (ID, NOMBRE, ANIO, ID_MARCA) values (86, 'Q4 Sportback e-tron', 2022,6);


CREATE TABLE backend.modelo_tipo_auto
(
    ID_MODELO       INT NOT NULL,
    ID_TIPO_AUTO       INT NOT NULL,
    CONSTRAINT PK_MODELO_TIPO_AUTO PRIMARY KEY (ID_MODELO, ID_TIPO_AUTO)
);

insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (1, 3);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (2, 6);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (3, 2);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (4, 3);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (5, 2);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (6, 2);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (7, 3);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (8, 3);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (9, 2);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (10, 2);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (11, 4);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (12, 4);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (13, 4);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (14, 4);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (15, 4);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (16, 4);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (17, 4);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (18, 5);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (19, 5);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (20, 5);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (21, 1);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (22, 4);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (23, 4);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (24, 6);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (25, 4);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (26, 1);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (27, 1);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (28, 1);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (29, 3);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (30, 1);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (31, 4);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (32, 1);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (33, 1);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (34, 1);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (35, 1);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (36, 7);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (37, 1);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (38, 4);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (39, 1);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (40, 1);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (41, 1);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (42, 4);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (43, 4);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (44, 4);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (45, 4);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (46, 6);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (47, 4);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (48, 3);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (49, 1);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (50, 1);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (50, 6);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (50, 3);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (51, 1);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (52, 6);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (52, 3);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (53, 1);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (54, 1);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (55, 1);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (55, 3);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (55, 6);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (56, 2);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (57, 6);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (58, 1);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (59, 6);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (60, 1);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (61, 2);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (62, 4);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (63, 4);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (64, 4);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (65, 4);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (66, 4);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (67, 6);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (67, 3);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (68, 6);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (68, 3);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (69, 4);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (70, 6);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (70, 3);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (71, 1);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (72, 1);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (73, 7);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (74, 1);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (74, 6);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (74, 3);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (75, 1);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (76, 7);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (77, 1);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (78, 1);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (79, 4);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (80, 1);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (81, 4);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (82, 4);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (83, 4);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (84, 4);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (85, 4);
insert into backend.modelo_tipo_auto (ID_MODELO, ID_TIPO_AUTO) values (86, 4);
