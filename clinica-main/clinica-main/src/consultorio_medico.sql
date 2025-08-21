

Create database projeto;

use projeto;


CREATE TABLE IF NOT EXISTS medicos (
  id int(10) NOT NULL AUTO_INCREMENT,
  crm varchar(11) NOT NULL,
  nome_medico varchar(50) NOT NULL,
  sexo varchar(50) NOT NULL,
  rg varchar(50) NOT NULL,
  telefone varchar(50) NOT NULL,
  endereco varchar(100) NOT NULL,
  cpf varchar(50) NOT NULL,
  senha_de_acesso varchar(50) NOT NULL,
  PRIMARY KEY (id),
  KEY crm (crm)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

CREATE TABLE IF NOT EXISTS `paciente` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) NOT NULL,
  `telefone` varchar(50) NOT NULL,
  `cpf` varchar(50) NOT NULL,
  `rg` varchar(50) NOT NULL,
  `endereco` varchar(50) NOT NULL,
  `sexo` varchar(50) NOT NULL,
  `convenio` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;


CREATE TABLE IF NOT EXISTS `consultas` (
  `id_consulta` int(10) NOT NULL AUTO_INCREMENT,
  `nome_medico` varchar(100) NOT NULL,
  `nome_paciente` varchar(100) NOT NULL,
  `data` date NOT NULL,
  `hora` time NOT NULL,
  
  PRIMARY KEY (`id_consulta`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

CREATE TABLE secretaria (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome_secretaria VARCHAR(100) NOT NULL,
    cpf VARCHAR(15) UNIQUE,
    senha VARCHAR(100),
    endereco varchar(100) NOT NULL,
     sexo  varchar(100) NOT NULL
);

create table administrador (
 id INT AUTO_INCREMENT PRIMARY KEY,
 nome VARCHAR(100) NOT NULL,
 senha VARCHAR(100) NOT NULL
 );


show tables;
describe medicos;
Select * from Medicos;
Select * from Paciente;
Select * from secretaria;
Select * from consultas;
Select * from administrador;



delete from medicos where id = 3;

SHOW COLUMNS FROM secretaria;

drop table  medicos;


  
INSERT INTO secretaria (nome_secretaria, cpf, senha, endereco,sexo) values
("Davi oliveira gaspar", "095.277.163-22", "230223", "Rua do arame", "Masculino");

INSERT INTO administrador (nome, senha) VALUES /* Para mexer no sistema primeiro se cria o adm*/
("Davi oliveira gaspar", "230223");


