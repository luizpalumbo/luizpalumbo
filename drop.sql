ALTER TABLE t_cidade DROP CONSTRAINT FK_t_cidade_ID
ALTER TABLE t_pais DROP CONSTRAINT FK_t_pais_ID
ALTER TABLE t_etiquetas DROP CONSTRAINT ttqtasLvrtiquetaID
DROP TABLE LIVRO
DROP TABLE PESSOA
DROP TABLE t_endereco
DROP TABLE t_cidade
DROP TABLE t_pais
DROP TABLE noticias
DROP TABLE T_Trilha_Musica
DROP TABLE T_Livros
DROP TABLE t_consumidor
DROP TABLE t_cartao_credito
DROP TABLE T_consumidor_metodos
DROP TABLE T_Livro_Etiqueta
DROP TABLE t_consumidor_com_endereco
DROP TABLE t_etiquetas
DELETE FROM SEQUENCE WHERE SEQ_NAME = 'SEQ_GEN'
