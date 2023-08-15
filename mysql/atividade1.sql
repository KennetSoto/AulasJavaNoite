/*Crie um banco de dados chamado atividade_sql, crie nesse banco a tabela de pessoas, com os seguintes atributos:
nome,
idade,
telefone,
endereço,
e-mail,
insira ao menos 10 cadastros no banco e no máximo 20;

mostre os dados inseridos.
mostre os dados das pessoas que moram na mesma cidade e são maiores de 18 anos;
insira mais de um telefone para uma pessoa;
mostre quantas pessoas residem no mesmo estado;
mostre os dados das pessoas onde a idade é igual a 30 anos;
*/

CREATE DATABASE atividade_sql;

USE atividade_sql;

CREATE TABLE pessoas (
nome VARCHAR(70),
idade INT,
telefone VARCHAR(20),
endereço VARCHAR (100),
email VARCHAR(20)
);


INSERT INTO pessoas VALUES (
"Dudu", 34, 762534786324,"Rua Palestra Italia", "dudu@gmail.com"),
("Rony", 27, 87163498343, "Rua Turiassu", null),
("Veiga", 28, 963443254, "Av. Parque Antartica", "veiga23@gmail.com"),
("Weverton", 33, 934873432, "Av. Barra Funda", null),
("Abel", 46, 9862450823, "Rua Pompeia", "abel_belem@gmail.com"),
("Leila", 50, 79634207314, "Rua Oscar Freire", "leila@gmai.com"),
("Gustavo Gomes",34, 987134098134, "Rua Turiassu", null),
("Marcos Rocha",35, 98163487134, "Rua Palestra Italia", "marcos@gmail.com"),
("Zé Rafael", 30, 986134981374, "Av. barra Funda", null),
("Luan", 30, 98634986343, "Rua Turiassu", "luan_zag@gmail.com");

#mostre os dados inseridos.
select * from pessoas;

# mostre os dados das pessoas que moram na mesma cidade e são maiores de 18 anos;
SELECT * FROM pessoas WHERE endereço = 'Rua Turiassu' && idade > 18;

#insira mais de um telefone para uma pessoa;
INSERT INTO pessoas VALUES("Dudu", 34, 9873248734,"Rua Palestra Italia", "dudu@gmail.com");

#mostre quantas pessoas residem no mesmo estado;
SELECT count(*) as quantidade FROM pessoas WHERE endereço LIKE "%Turiassu%";

#mostre os dados das pessoas onde a idade é igual a 30 anos;
SELECT * FROM pessoas WHERE idade = 30;