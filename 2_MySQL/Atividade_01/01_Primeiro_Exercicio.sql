CREATE DATABASE db_rh;
USE db_rh;

CREATE TABLE tb_funcionarios(
id BIGINT AUTO_INCREMENT, 
nome VARCHAR(255) NOT NULL, 
idade int not null, 
setor varchar(255), 
salario decimal not null,
primary key (id));

INSERT INTO tb_funcionarios(nome, idade, setor, salario) values ("Rogério", 25, "Operações", 5700);
INSERT INTO tb_funcionarios(nome, idade, setor, salario) values ("Matheus", 24, "Desenvolvimento", 3500);
INSERT INTO tb_funcionarios(nome, idade, setor, salario) values ("Jordan", 32, "Liderança", 8500);
INSERT INTO tb_funcionarios(nome, idade, setor, salario) values ("Murilo", 22, "Apoio técnico", 1700);
INSERT INTO tb_funcionarios(nome, idade, setor, salario) values ("Michelangelo", 20, "Artes", 1001.55);

SELECT * FROM tb_funcionarios;

SELECT * FROM tb_funcionarios WHERE salario > 2000;
SELECT * FROM tb_funcionarios WHERE salario < 2000;
UPDATE tb_funcionarios SET salario = 1353.50 WHERE id = 5;
