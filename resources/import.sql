insert into tb_dia_semana values (1, 'Domingo'),(2, 'Segunda'),(3, 'Terça'),(4, 'Quarta'),(5, 'Quinta'),(6, 'Sexta'), (7, 'Sábado');

insert into tb_cidade (id, nome, latitude, longitude) values (1, 'Sao Paulo', -23.5489, -46.6388);

insert into previsao (id, temperatura_minima, temperatura_maxima, humidade_ar, descricao, data_hora, latitude, longitude, id_dia_semana, id_cidade) values (1, 10.0, 18.7, 86, 'Nublado', '24/03/2019 22:30', 22.0, 34.0, 1, 1);

insert into usuario (id, login, senha) values (1, 'admin', 'admin')