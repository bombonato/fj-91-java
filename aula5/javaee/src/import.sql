drop table if exists Grupo ;
drop table if exists Usuario;
drop table if exists Usuario_Grupo;

create table if not exists Grupo (id bigint not null auto_increment, nome varchar(255), primary key (id)) ENGINE=InnoDB ;
create table if not exists Usuario (id bigint not null auto_increment, login varchar(255), senha varchar(255), primary key (id)) ENGINE=InnoDB;
create table if not exists Usuario_Grupo (Usuario_id bigint not null, grupos_id bigint not null) ENGINE=InnoDB;

insert into Grupo(nome) values('ROLE_USER');
insert into Grupo(nome) values('ROLE_ADMIN');
insert into Usuario(login, senha) values('user','pass');
insert into Usuario(login, senha) values('admin','pass');
insert into Usuario_Grupo(Usuario_id, grupos_id) values(1,1);
insert into Usuario_Grupo(Usuario_id, grupos_id) values(2,2);

insert into Contato(nome, telefone) values('Caelum SP','11-5084-8222');
insert into Contato(nome, telefone) values('Caelum RJ','21-2220-4156');
insert into Contato(nome, telefone) values('Caelum DF','69-3039-4222');

