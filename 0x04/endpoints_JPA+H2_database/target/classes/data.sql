insert into cliente (id, idade, nome, email) values(1, 40, 'Ze Fulano', 'zezinho@email.com');
insert into cliente (id, idade, nome, email) values(2, 26, 'Manoel Antunes', 'manoel@email.com');
insert into telefone (id, cliente_id, ddd, numero) values (1,2,'14','35445585');
insert into telefone (id, cliente_id, ddd, numero) values (2,2,'14','99668855');
insert into telefone (id, cliente_id, ddd, numero) values (3,1,'18','98253636');
insert into endereco (id, cliente_id, bairro, cidade, endereco, estado, logradouro, numero) values (1,1,'CENTRO', 'CIDADE DO NORTE', 'ALI PERTO','SP','AVENIDA' ,'100');
insert into endereco (id, cliente_id, bairro, cidade, endereco, estado, logradouro, numero) values (2,2,'JARDIM BONITO', 'CIDADE DO NORTE', 'LÁ LONGE','SP','RUA' ,'487');
