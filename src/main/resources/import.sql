INSERT INTO COZINHA (id, nome) values(1, 'Tailandesa');
INSERT INTO COZINHA (id, nome) values(2, 'Brasileira');

INSERT INTO RESTAURANTE (nome, taxa_frete, cozinha_codigo) values('Habibs', 10, 1);
INSERT INTO RESTAURANTE (nome, taxa_frete, cozinha_codigo) values('Giraffas', 10, 2);
INSERT INTO RESTAURANTE (nome, taxa_frete, cozinha_codigo) values('Grilleto', 10, 2);
INSERT INTO RESTAURANTE (nome, taxa_frete, cozinha_codigo) values('Mcdonalds', 10, 2);
INSERT INTO RESTAURANTE (nome, taxa_frete, cozinha_codigo) values('Bobs', 10, 1);
INSERT INTO RESTAURANTE (nome, taxa_frete, cozinha_codigo) values('Divino', 10, 1);

INSERT INTO ESTADO(id, nome) values (1, 'Sao Paulo');
INSERT INTO ESTADO(id, nome) values (2, 'Minas Gerais');
INSERT INTO ESTADO(id, nome) values (3, 'Rio de Janeiro');
INSERT INTO ESTADO(id, nome) values (4, 'Bahia');


INSERT INTO CIDADE(nome, estado_id) values ('Taboao da Serra', 1);
INSERT INTO CIDADE(nome, estado_id) values ('Belo Horizonte', 2);
INSERT INTO CIDADE(nome, estado_id) values ('Rio de Janeiro', 3);
INSERT INTO CIDADE(nome, estado_id) values ('Salvador', 4);


INSERT INTO FORMA_PAGAMENTO(ID, DESCRICAO) VALUES (1, 'CARTAO DE CREDITO');
INSERT INTO FORMA_PAGAMENTO(ID, DESCRICAO) VALUES (2, 'CARTAO DE DEBITO');
INSERT INTO FORMA_PAGAMENTO(ID, DESCRICAO) VALUES (3, 'DINHEIRO');
INSERT INTO FORMA_PAGAMENTO(ID, DESCRICAO) VALUES (4, 'PIX');

INSERT INTO PERMISSAO (ID, NOME, DESCRICAO) VALUES (1, 'CONSULTAR_COZINHAS', 'PERMITIR CONSULTA');
INSERT INTO PERMISSAO (ID, NOME, DESCRICAO) VALUES (2, 'EDITAR_COZINHAS', 'PERMITIR EDITAR COZINHAS');


INSERT INTO RESTAURANTE_FORMA_PAGAMENTO (RESTAURANTE_ID, FORMA_PAGAMENTO_ID) VALUES (1,1), (1,2), (1,3), (2,3), (3,4), (4,4), (5,1), (5,2), (5,4), (6,1), (6,2), (6,3)