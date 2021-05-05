CREATE TABLE cardapio (
	id BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(50),
    preco DECIMAL(10)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO cardapio (nome, preco) VALUES ('Mussarela', 20);
INSERT INTO cardapio (nome, preco) VALUES ('Portuguesa', 30);
INSERT INTO cardapio (nome, preco) VALUES ('Bacon', 30);
INSERT INTO cardapio (nome, preco) VALUES ('Calabresa', 20);
INSERT INTO cardapio (nome, preco) VALUES ('Atum', 25);
INSERT INTO cardapio (nome, preco) VALUES ('Escarola', 30);
INSERT INTO cardapio (nome, preco) VALUES ('Chilena', 30);
INSERT INTO cardapio (nome, preco) VALUES ('Camarão', 40);

