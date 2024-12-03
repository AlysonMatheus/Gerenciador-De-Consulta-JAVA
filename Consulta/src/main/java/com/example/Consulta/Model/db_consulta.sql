-
CREATE DATABASE db_consulta;


USE db_consultas;


CREATE TABLE medico (
    crm INT PRIMARY KEY,                        -- 
    nome VARCHAR(100) NOT NULL,                 -- 
    especialidade VARCHAR(50) NOT NULL,         -- 
    email VARCHAR(100) NOT NULL UNIQUE,         -- 
    telefone VARCHAR(15)                        -- 
);


CREATE TABLE paciente (
    cpf VARCHAR(11) PRIMARY KEY,                -- 
    nome VARCHAR(100) NOT NULL,                 -- 
    data_nascimento DATE NOT NULL,              -- 
    telefone VARCHAR(15),                       -- 
    data DATE                                   -- 
);


CREATE TABLE consulta (
    id INT AUTO_INCREMENT PRIMARY KEY,          -- 
    paciente_cpf VARCHAR(11) NOT NULL,          -- 
    medico_crm INT NOT NULL,                    -- 
    data_consulta DATE NOT NULL,                -- 
    hora_consulta TIME NOT NULL,                -- 
    descricao VARCHAR(255),                     -- 
    FOREIGN KEY (paciente_cpf) REFERENCES paciente(cpf) ON DELETE CASCADE,
    FOREIGN KEY (medico_crm) REFERENCES medico(crm) ON DELETE CASCADE
);
