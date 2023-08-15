CREATE DATABASE normalizacao;
USE normalizacao;

/*
para uma tabela estar na primeira forma normal, é necessario quenão existam grupos
de valores repetidos, seus valores devem ser atomicos (unidos) e a tabela
deve possuir um identificador que identifique o dado com unico
*/

CREATE TABLE pessoa (
id INTEGER PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(50),
sobrenome VARCHAR(50),
idade INT,
sexo VARCHAR(15),
email VARCHAR (100),
cpf VARCHAR(18) not null unique,
cidade VARCHAR (150),
bairro VARCHAR (50),
cep VARCHAR (10),
complemento VARCHAR (100),
logradouro VARCHAR (50),
estado VARCHAR (50),
uf CHAR(2),
numero VARCHAR(10),
telefone VARCHAR(16),
ddd CHAR (3),
celular VARCHAR(16),
fixo VARCHAR (16),
comercial VARCHAR(16)
);

INSERT INTO pessoa VALUES(
NULL, "Abel", "Ferreira", 43, "masculino", "abel.tecnico@gmail.com","35472891863", "Belem", "central",2421341354, "casa 4", "Rua Pastel de belem", "Belem", "BL", 7, 55678334487, 351, 98466363728, 74692774662, 98327236236);

SELECT * FROM pessoa;

CREATE TABLE endereco(
idEndereco integer primary key auto_increment,
cep VARCHAR (10),
bairro VARCHAR(100),
cidade VARCHAR(100),
uf CHAR(2)
);

CREATE TABLE pessoa2(
idPessoa integer primary key auto_increment,
nome VARCHAR (50),
cpf VARCHAR (14) not null unique,
sexo varchar(10),
#AS CHAVES QUE VEM COM NOME COM _ SERVEM PARA SEREM IDENTIFICADAS COM ESTRANGERIAS
id_endereco INTEGER,
#As CONSTRAINT são usadas para especificar regras para os dados em uma tabela
CONSTRAINT fk_id_endereco_endereco
FOREIGN KEY (id_endereco) REFERENCES endereco(idEndereco)
);

CREATE TABLE telefone(
idTelefone INTEGER primary key auto_increment,
ddd VARCHAR(5),
numero VARCHAR(10),
id_pessoa INTEGER,
CONSTRAINT fk_id_pessoa_pessoa
# a chave estrangeira (id_pessoa) refere a tabela (pessoa2) e o atributo (idPessoa) 
FOREIGN KEY (id_pessoa) REFERENCES pessoa2(idPessoa)
);

INSERT INTO endereco VALUES(null, "08753-440", "não sei", "São Paulo", "sp"),
(null, "98763-454", "limoeiro", "Brasilia", "DF"),
(null, "78625-324", "não sei", "Brasilia", "df"),
(null, "897543-254", "calmom viana", "São Paulo", "SP");

INSERT INTO pessoa2 VALUES(null, "Dudu", "324.546.34-65", "M",1),
(null, "Leila", "987.245.45-54", "F",2),
(null, "Veiga", "342.424.43-54", "M",3);

INSERT INTO telefone VALUES (null, "061", "98769-8765", 1);

select *from pessoa2;
select *from endereco;
select * from telefone;

drop table pessoa2;
drop table endereco;



# Inner join para consultas mescladas
# INNER JOIN palavra-chave seleciona registros que possuem valores correspondentes em ambas as tabelas
SELECT * FROM endereco INNER JOIN pessoa2 ON endereco.idEndereco = pessoa2.id_endereco;
SELECT * FROM pessoa2 INNER JOIN endereco ON pessoa2.id_endereco = endereco.idEndereco;
SELECT * FROM pessoa2 INNER JOIN telefone ON pessoa2.idPessoa = telefone.id_pessoa;
SELECT nome,cpf, cep, bairro, cidade, uf FROM pessoa2 INNER JOIN endereco ON pessoa2.id_endereco = endereco.idEndereco;


