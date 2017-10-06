insert into Grupo(nome) values('ROLE_USER');
insert into Grupo(nome) values('ROLE_ADMIN');
insert into Usuario(login, senha) values('user','pass');
insert into Usuario(login, senha) values('admin','pass');
insert into Usuario_Grupo(Usuario_id, grupos_id) values(1,1);
insert into Usuario_Grupo(Usuario_id, grupos_id) values(2,2);

insert into Contato(nome, telefone) values('Caelum SP','11-5084-8222');
insert into Contato(nome, telefone) values('Caelum RJ','21-2220-4156');
insert into Contato(nome, telefone) values('Caelum DF','69-3039-4222');

