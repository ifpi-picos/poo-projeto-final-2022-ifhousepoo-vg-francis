CREATE TABLE usuario(
 id_usuario SERIAL PRIMARY KEY,
 nome VARCHAR(40) NOT NULL,
 email VARCHAR(60) NOT NULL,
 data_nascimento DATE NOT NULL,
 endereco VARCHAR(150) not null
);
CREATE TABLE Imovel (
 valorAluguel FLOAT NOT NULL, 
 descricao VARCHAR(100) NOT NULL,
 dataCadastro date not null,
 endereco VARCHAR(100) NOT NULL,
 id_imovel SERIAL PRIMARY KEY NOT NULL
);

CREATE TABLE Endereco (
 rua VARCHAR(100) NOT NULL,
 cidade VARCHAR(100) NOT NULL,
 bairro VARCHAR(100) NOT NULL,
 numero VARCHAR(100) NOT NULL,
 uf VARCHAR(100) NOT NULL,
 id_endereco SERIAL PRIMARY KEY
);