#cria o banco de dados
CREATE DATABASE banco_teste;
#coloca o banco em uso
USE banco_teste;

#descarta o banco de dados
DROP DATABASE banco_teste;

#cria a tabela
CREATE TABLE pessoa (
nome VARCHAR(70),
idade INT,
telefone VARCHAR(20),
endereco VARCHAR (100),
email VARCHAR(20)
);

#senha: Sen@i123 ou Senai@123
#descreve a tabela
desc pessoa;

#insere o produto na tabela
INSERT INTO pessoa VALUES("Maria de lourdes da silva", 33, 'f', 80.65);

INSERT INTO pessoa(nome, idade) VALUES("Luan Ferreira", 33);

INSERT INTO pessoa VALUES (
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

#o select serve para projetar os dados, não somente para escolher
SELECT (2+4);

#pesquisa todos os dados da tabela
SELECT * FROM pessoa;
DESC pessoa;

#selecione apenas o campo nome na tabela pessoa onde a idade for igual a 33
select nome from pessoa where idade = 33;

#a procentagem % é utilizada para buscar o que esta entre a sua utilizaçao
select idade from pessoa where nome like "%Gomes%";

# o like é como o igual(=) porem percorre todo banco, deve se evitar a ultilização
select idade from pessoa where nome like "Gomes";

# pesquisa condicionada 
SELECT * FROM pessoa WHERE endereco = "Rua Turiassu" OR idade > 29;

# pesquisa condicionada
SELECT * FROM pessoa WHERE endereco = "Rua Turiassu" AND idade > 29;

# count serve para contar os dados da tabela
SELECT count(*) FROM pessoa;

# o AS serve para apelidar o resultado
SELECT count(*) AS participantes FROM pessoa;

# colocar entre aspas permite ter uma descição melhor, sem precisar ligar as palavras
SELECT count(*) AS "participantes da tabela" FROM pessoa;

#group by serve para agrupa linhas baseado em semelhanças entre elas
SELECT  count(*) as quantidade, nome FROM pessoa WHERE idade >15 GROUP BY nome;

#NULL nao é um dado, é um valor que indica dados ausentes ou desconhecidos em um campo.
SELECT nome FROM pessoa WHERE  email IS NULL;

#comando destrava a segurança que não permite instruções SQL executadas sem a cláusula "WHERE"
SET SQl_SAFE_UPDATES = 0;

#update de dados usando a clausula where
UPDATE pessoa SET email ="meuemail@gmail.com" WHERE nome ="Leila";

SELECT nome, email FROM pessoa WHERE nome = "LEILA";

# atualizando onde os dados sao nulos
UPDATE pessoa SET email ="meuemail@gmail.com" WHERE email IS NULL AND nome = "Weverton";

#mostrar dados em ordem alfabetica pelo nome
SELECT * FROM pessoa ORDER BY nome ASC;

#criando outra tabela
create table produto(
	descricaoProduto varchar(70),
    #quando há o parenteses indica a quantidade de casas (total) e quantidade de números
    #após a virgular que será mostrado
    preco double(6,2),
    #enum é um tipo de dado com opções pré definidas
    status_pedido enum("entregue", "preparando", "saiu para entrega")
);

#para acessar o dado do enum, podemos usar o nome da opção ou a casa que ele ocupa(indice)
insert into produto values("Sanduba", 15.56, 3);
insert into produto values("Sanduba", 15.56, 2);
insert into produto values("Sanduba", 15.56, 1);
select * from produto;

#alterar a tabela adicionado o campo quantidade
ALTER TABLE produto ADD quantidade int;

#checar os campos da tabela em ordem decrescente
DESC produto;
