create database consultorio_medico;

Create database projeto;

use projeto;

CREATE TABLE IF NOT EXISTS medicos (
  id int(10) NOT NULL AUTO_INCREMENT,
  crm int(11) NOT NULL,
  nome_medico varchar(50) NOT NULL,
  cpf varchar(50) NOT NULL,
  rg varchar(50) NOT NULL,
  telefone varchar(50) NOT NULL,
  endereco varchar(100) NOT NULL,
  sexo varchar(50) NOT NULL,
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
  `id_con` int(10) NOT NULL AUTO_INCREMENT,
  `id_med` int(10) NOT NULL,
  `id_pac` int(10) NOT NULL,
  `data` date NOT NULL,
  `hora` time NOT NULL,
  PRIMARY KEY (`id_con`),
  KEY `FK_consultas_paciente` (`id_pac`),
  KEY `FK_consultas_medicos` (`id_med`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

CREATE TABLE IF NOT EXISTS secretaria (
  id int(10) NOT NULL AUTO_INCREMENT,
  nome_secretaria varchar(50) NOT NULL,
  cpf varchar(50) NOT NULL,
  rg varchar(50) NOT NULL,
  telefone varchar(50) NOT NULL,
  endereco varchar(100) NOT NULL,
  sexo varchar(50) NOT NULL,
  senha varchar(50) NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

show tables;
Select * from Medicos;
Select * from Paciente;
Select * from secretaria;
Select * from consultas;

SHOW COLUMNS FROM secretaria;

drop table  secretaria;


SELECT 
  c.id_con,
  c.data,
  c.hora,
  m.nome_medico AS nome_do_medico,
  p.nome AS nome_do_paciente
FROM 
  consultas c
JOIN 
  medicos m ON c.id_med = m.id
JOIN 
  paciente p ON c.id_pac = p.id;
  
  
INSERT INTO medicos (crm, nome_medico, cpf, rg, telefone, endereco, sexo) VALUES
(1234, 'Dr. João Silva', '111.222.333-44', 'MG-12.345.678', '(31) 99999-1111', 'Rua A, 100', 'Masculino'),
(2345, 'Dra. Ana Costa', '222.333.444-55', 'MG-23.456.789', '(31) 98888-2222', 'Rua B, 200', 'Feminino'),
(3456, 'Dr. Pedro Lima', '333.444.555-66', 'MG-34.567.890', '(31) 97777-3333', 'Rua C, 300', 'Masculino'),
(4567, 'Dra. Maria Souza', '444.555.666-77', 'MG-45.678.901', '(31) 96666-4444', 'Rua D, 400', 'Feminino'),
(5678, 'Dr. Carlos Mendes', '555.666.777-88', 'MG-56.789.012', '(31) 95555-5555', 'Rua E, 500', 'Masculino');

INSERT INTO paciente (nome, telefone, cpf, rg, endereco, sexo, convenio) VALUES
('Lucas Martins', '(31) 90000-1111', '101.202.303-44', 'MG-11.222.333', 'Av. Central, 123', 'Masculino', 'Unimed'),
('Juliana Rocha', '(31) 90000-2222', '202.303.404-55', 'MG-22.333.444', 'Rua Flor, 456', 'Feminino', 'Bradesco Saúde'),
('Fernando Dias', '(31) 90000-3333', '303.404.505-66', 'MG-33.444.555', 'Travessa Sol, 789', 'Masculino', 'SulAmérica'),
('Amanda Reis', '(31) 90000-4444', '404.505.606-77', 'MG-44.555.666', 'Rua Estrela, 101', 'Feminino', 'Amil'),
('Beatriz Alves', '(31) 90000-5555', '505.606.707-88', 'MG-55.666.777', 'Rua Lua, 202', 'Feminino', 'Hapvida');


INSERT INTO consultas (id_med, id_pac, data, hora) VALUES
(1, 1, '2025-08-01', '09:00:00'),
(2, 2, '2025-08-02', '10:30:00'),
(3, 3, '2025-08-03', '14:00:00'),
(4, 4, '2025-08-04', '16:15:00'),
(5, 5, '2025-08-05', '11:45:00');


INSERT INTO secretaria (nome_secretaria, cpf, rg, telefone, endereco, sexo, senha) VALUES
('Marina Lopes', '606.707.808-99', 'MG-66.777.888', '(31) 91111-0000', 'Rua das Flores, 10', 'Feminino', 'senha123'),
('Carlos Souza', '707.808.909-00', 'MG-77.888.999', '(31) 92222-1111', 'Rua das Palmeiras, 20', 'Masculino', '123senha'),
('Larissa Gomes', '808.909.010-11', 'MG-88.999.000', '(31) 93333-2222', 'Av. das Américas, 30', 'Feminino', 'admin123'),
('João Pedro', '909.010.121-22', 'MG-99.000.111', '(31) 94444-3333', 'Rua das Árvores, 40', 'Masculino', 'segredo'),
('Fernanda Lima', '010.121.232-33', 'MG-00.111.222', '(31) 95555-4444', 'Rua do Sol, 50', 'Feminino', 'senha456');
