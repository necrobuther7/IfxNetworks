CREATE TABLE Empleado (
    id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nombres varchar(30),
    apellidos varchar(30),
    direccion varchar(40),
    telefono int,
    edad int,
    fechaNacimiento date
);

CREATE TABLE Cargo (
    id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nombre varchar(20),
    descripcion varchar(255)
);


CREATE TABLE Contrato (
    id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    fechainicio date,
    fechafin date,
	idcargo int,
    idpersona int,
    descripcion varchar(255)
);

ALTER TABLE fxNetworks.Contrato ADD CONSTRAINT fk_contrato_persona FOREIGN KEY (idpersona) REFERENCES IfxNetworks.Persona (id);

ALTER TABLE fxNetworks.Contrato ADD CONSTRAINT fk_contrato_cargo FOREIGN KEY (idcargo) REFERENCES IfxNetworks.Cargo (id);






