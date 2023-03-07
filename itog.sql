create table animals
(
id_type int AUTO_INCREMENT PRIMARY KEY,
type varchar(20)
);

CREATE TABLE pets
(
    id_type int,
    id_kind int AUTO_INCREMENT PRIMARY KEY,
    kind VARCHAR(20) NOT NULL,
    FOREIGN KEY (id_type)
        REFERENCES animals(id_type)
);

CREATE TABLE pet_card
(
    id_type int,
    id_kind int,
    name VARCHAR(20) NOT NULL,
    command VARCHAR(20) NOT NULL,
    age int not null,
     FOREIGN KEY (id_type)
        REFERENCES animals(id_type),
	FOREIGN KEY (id_kind)
        REFERENCES pets(id_kind)
);

CREATE TABLE pack_animals
(
    id_type int,
    id_kind int AUTO_INCREMENT PRIMARY KEY,
    kind VARCHAR(20) NOT NULL,
    FOREIGN KEY (id_type)
        REFERENCES animals(id_type)
);

CREATE TABLE pack_card
(
    id_type int,
    id_kind int,
    name VARCHAR(20) NOT NULL,
    command VARCHAR(20) NOT NULL,
    age int not null,
     FOREIGN KEY (id_type)
        REFERENCES animals(id_type),
	FOREIGN KEY (id_kind)
        REFERENCES pack_animals(id_kind)
);

insert pack_animals(id_type, kind)
values
(2, 'horse'),
(2, 'mule'),
(2, 'camel'),
(2, 'donkey'),
(2, 'yak'),
(2, 'buffalo'),
(2, 'lama');

insert pets(id_type, kind)
values
(1, 'cat'),
(1, 'dog'),
(1, 'guinea pig'),
(1, 'hamster'),
(1, 'ferret'),
(1, 'rabbit'),
(1, 'fish');

insert animals(id_type, type)
values
(1, 'pet'),
(2, 'pack');

insert pet_card(id_type, id_kind, name, command, Age)
values
(1, 8, 'Eva', 'Foo', 8),
(1, 8, 'Pepsi', 'not', 6),
(1, 9, 'kevin', 'Foo', 10),
(1, 9, 'kevin', 'GiveTheFoot', 10),
(1, 9, 'kevin', 'Take', 10),
(1, 9, 'Pixel', 'Foo', 5),
(1, 9, 'Pixel', 'GiveTheFoot', 5),
(1, 9, 'Pixel', 'Fas', 5),
(1, 10, 'Polly', '-', 2),
(1, 10, 'Sara', '-', 2 ),
(1, 11, 'Scipy', 'Foo', 1),
(1, 12, 'Flaffy', '-', 2),
(1, 13, 'Buks', '-', 2),
(1, 14, 'Goldy', '-', 1),
(1, 14, 'Blacky', '-', 1);

insert pack_card(id_type, id_kind, name, command, Age)
values
(2, 8, 'Sivka', 'prrr',9),
(2, 8, 'Sivka', 'no!', 9),
(2, 8, 'Burka', 'prrr', 2),
(2, 8, 'Burka', 'no!', 2),
(2, 9, 'Uragan', 'Poshla', 4),
(2, 9, 'Uragan', 'Stop', 4),
(2, 10, 'Sahara', 'Poshla', 3),
(2, 10, 'Sahara', 'up', 3),
(2, 10, 'Sahara', 'down', 3),
(2, 10, 'Sahara', 'Stop', 3),
(2, 11, 'iaa', 'Smile', 7),
(2, 12, 'Smyak', 'Poshla', 9),
(2, 12, 'Smyak', 'Stop', 9),
(2, 13, 'Scala', 'Poshla', 2),
(2, 13, 'Scala', 'Home', 2),
(2, 13, 'Scala', 'Stop', 2),
(2, 14, 'Kusko', 'Be-Funny', 5),
(2, 14, 'Kusko', 'Be-Cute', 5);

delete from pack_card where id_kind = 10;

create table young_animals as
SELECT * FROM pack_card WHERE Age < 3 AND Age > 1
    UNION
SELECT * FROM pet_card WHERE Age < 3 AND Age > 1;

select * from pack_card
	UNION
SELECT * FROM pet_card;
