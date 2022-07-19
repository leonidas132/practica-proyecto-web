create database datosbusqueda;

create table datobusqueda(
     id int  auto_increment primary key,
     texto varchar(100),
     url varchar(100),
     contenido_web varchar (9000),
     fecha datetime
);