/*1.Nas aulas que tivemos até agora, explique detalhadamente como criar um
banco de dados, uma tabela, iserir dados na tabela e consultar todos os dados de uma tabela;


2.Escolha 4 comandos do banco de
dados e explique o que cada um faz, use suas palavras.

3.Crie um banco de dados para
salvar dados de produtos:


A. A
tabela deve possuir: descrição, unidade de medida(ex.: und, lts, mts),
valor unitário, quantidade;


B. Cadastre
5 produtos e mostre os produtos cadastrados;


C. Concatene
uma mensagem para mostrar os dados de determinado produto: “há 4 pendrives no
estoque, com valor unitário de 35,25 reais;
*/

CREATE DATABASE atividade_2;
USE atividade_2;

DROP DATABASE atividade_2;

DROP TABLE produtos;

#mostre os dados inseridos.
select * from produtos;

#insere o produto na tabela
INSERT INTO produtos VALUES("lapis",5 ,3.00, 4);

CREATE TABLE produtos(
descricao varchar(45), 
tipo int,
valor_unitario double(7,2),
quantidade int
);

INSERT INTO produtos VALUES(
"caneta", 3, 5.00,6),
("borracha", 4, 2.00,4),
("apagador", 2, 6.00,2),
("caderno", 3, 10.00,5);

INSERT INTO produtos VALUES("pendrive", 1 ,35.25, 4);

SELECT * FROM produtos WHERE  descricao = "caneta" and CONCAT("há ", quantidade , " de ", descricao, " no estoque, com valor unitario de ", valor_unitario," de reais" );

SELECT  CONCAT("há ", quantidade , " de ", descricao, " no estoque, com valor unitario de ", valor_unitario," de reais" ) AS TABELA FROM produtos WHERE  descricao = "PENDRIVE" ;