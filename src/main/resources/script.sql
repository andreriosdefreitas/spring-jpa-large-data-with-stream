create table table_a (
                         id serial primary key,
                         column_a varchar(128) not null,
                         column_b varchar(128) not null,
                         column_c varchar(128) not null,
                         column_d varchar(128) not null,
                         column_e varchar(128) not null,
                         column_f varchar(128) not null,
                         column_g varchar(128) not null,
                         column_h varchar(128) not null,
                         column_i varchar(128) not null,
                         column_j varchar(128) not null,
                         column_k varchar(128) not null,
                         column_l varchar(128) not null,
                         column_m varchar(128) not null,
                         column_n varchar(128) not null,
                         column_o varchar(128) not null,
                         column_p varchar(128) not null,
                         column_q varchar(128) not null,
                         column_r varchar(128) not null,
                         column_s varchar(128) not null,
                         column_t varchar(128) not null,
                         column_u varchar(128) not null,
                         column_v varchar(128) not null,
                         column_w varchar(128) not null,
                         column_x varchar(128) not null,
                         column_y varchar(128) not null,
                         column_z varchar(128) not null
);

create table table_b (
                         id serial primary key,
                         table_a_id integer not null,
                         column_a varchar(128) not null,
                         column_b varchar(128) not null,
                         column_c varchar(128) not null,
                         column_d varchar(128) not null,
                         column_e varchar(128) not null,
                         column_f varchar(128) not null,
                         column_g varchar(128) not null,
                         column_h varchar(128) not null,
                         column_i varchar(128) not null,
                         column_j varchar(128) not null,
                         column_k varchar(128) not null,
                         column_l varchar(128) not null,
                         column_m varchar(128) not null,
                         column_n varchar(128) not null,
                         column_o varchar(128) not null,
                         column_p varchar(128) not null,
                         column_q varchar(128) not null,
                         column_r varchar(128) not null,
                         column_s varchar(128) not null,
                         column_t varchar(128) not null,
                         column_u varchar(128) not null,
                         column_v varchar(128) not null,
                         column_w varchar(128) not null,
                         column_x varchar(128) not null,
                         column_y varchar(128) not null,
                         column_z varchar(128) not null,
                         CONSTRAINT fk_table_a
                             FOREIGN KEY(table_a_id)
                                 REFERENCES table_a(id)
);

insert into table_b (column_a, column_b, column_c, column_d, column_e, column_f, column_g, column_h, column_i, column_j, column_k, column_l, column_m, column_n, column_o, column_p, column_q, column_r, column_s, column_t, column_u, column_v, column_w, column_x, column_y, column_z)
select md5(random()::text),
       md5(random()::text),
       md5(random()::text),
       md5(random()::text),
       md5(random()::text),
       md5(random()::text),
       md5(random()::text),
       md5(random()::text),
       md5(random()::text),
       md5(random()::text),
       md5(random()::text),
       md5(random()::text),
       md5(random()::text),
       md5(random()::text),
       md5(random()::text),
       md5(random()::text),
       md5(random()::text),
       md5(random()::text),
       md5(random()::text),
       md5(random()::text),
       md5(random()::text),
       md5(random()::text),
       md5(random()::text),
       md5(random()::text),
       md5(random()::text),
       md5(random()::text)
from generate_series(1, 10000000) s(i);

insert into table_b (table_a_id, column_a, column_b, column_c, column_d, column_e, column_f, column_g, column_h, column_i, column_j, column_k, column_l, column_m, column_n, column_o, column_p, column_q, column_r, column_s, column_t, column_u, column_v, column_w, column_x, column_y, column_z)
select *
from table_a;