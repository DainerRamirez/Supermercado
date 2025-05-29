CREATE DATABASE gestionrh;
USE Gestionrh;

CREATE TABLE funcionarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    tipo_identificacion VARCHAR(20),
    numero_identificacion VARCHAR(20) UNIQUE,
    nombres VARCHAR(100),
    apellidos VARCHAR(100),
    estado_civil VARCHAR(20),
    sexo ENUM('M', 'F', 'Otro'),
    direccion VARCHAR(255),
    telefono VARCHAR(20),
    fecha_nacimiento DATE
);

CREATE TABLE grupo_familiar (
    id INT AUTO_INCREMENT PRIMARY KEY,
    funcionario_id INT,
    nombre VARCHAR(100),
    parentesco VARCHAR(50),
    FOREIGN KEY (funcionario_id) REFERENCES funcionarios(id) ON DELETE CASCADE
);

CREATE TABLE informacion_academica (
    id INT AUTO_INCREMENT PRIMARY KEY,
    funcionario_id INT,
    universidad VARCHAR(100),
    nivel_estudio VARCHAR(50),
    titulo VARCHAR(100),
    FOREIGN KEY (funcionario_id) REFERENCES funcionarios(id) ON DELETE CASCADE
);