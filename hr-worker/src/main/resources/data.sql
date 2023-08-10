    create table tb_worker (
       id bigint not null auto_increment,
        daily_income double precision,
        name varchar(255),
        primary key (id)
    ) engine=InnoDB;

INSERT INTO tb_worker (name, daily_Income) VALUES ('Bob', 200.0);
INSERT INTO tb_worker (name, daily_Income) VALUES ('Maria', 300.0);
INSERT INTO tb_worker (name, daily_Income) VALUES ('Alex', 250.0);
