CREATE DATABASE db_generation_game_online;
USE db_generation_game_online;

CREATE TABLE tb_classes (
id bigint auto_increment, 
classe varchar(255) not null, 
subclasse varchar(255) not null,
primary key (id));

CREATE TABLE tb_personagens (
numero bigint auto_increment, 
nome varchar(255),
ataque bigint not null, 
defesa bigint not null, 
nivel bigint not null, 
primary key (numero)
);

SELECT * from tb_classes;

SELECT * from tb_personagens;

ALTER TABLE tb_personagens ADD classes_id bigint;
AlTER TABLE tb_personagens ADD CONSTRAINT fk_personagen_categoria FOREIGN KEY (classes_id) REFERENCES tb_classes(id);

INSERT INTO tb_classes (classe, subclasse) values ("Mago", "Guerreiro");
INSERT INTO tb_classes (classe, subclasse) values ("Guerreiro", "Mago");
INSERT INTO tb_classes (classe, subclasse) values ("Suporte", "Corpo a Corpo");
INSERT INTO tb_classes (classe, subclasse) values ("Suporte", "Distancia");
INSERT INTO tb_classes (classe, subclasse) values ("Mago", "Suporte");

INSERT INTO tb_personagens (nome, ataque, defesa, nivel, classes_id) values ("Jaspeon", 85, 150, 10, 1);
INSERT INTO tb_personagens (nome, ataque, defesa, nivel, classes_id) values ("Rumildo", 91, 30, 15, 2);
INSERT INTO tb_personagens (nome, ataque, defesa, nivel, classes_id) values ("Yoki", 33, 92, 17, 3);
INSERT INTO tb_personagens (nome, ataque, defesa, nivel, classes_id) values ("Castro", 45, 32, 33, 4);
INSERT INTO tb_personagens (nome, ataque, defesa, nivel, classes_id) values ("Celeron", 120, 85, 21, 5);
INSERT INTO tb_personagens (nome, ataque, defesa, nivel, classes_id) values ("Martinez", 175, 75, 55, 1);
INSERT INTO tb_personagens (nome, ataque, defesa, nivel, classes_id) values ("Jordan", 99, 55, 88, 2);
INSERT INTO tb_personagens (nome, ataque, defesa, nivel, classes_id) values ("Rafaello", 33, 175, 13, 3);

SELECT * FROM tb_personagens WHERE ataque > 2000;

SELECT * FROM tb_personagens WHERE defesa BETWEEN 1000 AND 2000;

SELECT * FROM tb_personagens WHERE nome LIKE "c%";
SELECT * FROM tb_personagens WHERE nome LIKE "c_s%";

SELECT nome, ataque, defesa, nivel, classes_id from tb_personagens INNER JOIN tb_classes on tb_classes.id = tb_personagens.classes_id; 

SELECT nome, ataque, defesa, nivel, classes_id from tb_personagens INNER JOIN tb_classes on tb_classes.classe = tb_personagens.classes_id = "Guerreiro"; 

