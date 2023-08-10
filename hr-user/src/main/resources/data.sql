
    create table tb_role (
       id bigint not null auto_increment,
        role_name varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table tb_user (
       id bigint not null auto_increment,
        email varchar(255),
        name varchar(255),
        password varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table tb_user_role (
       user_id bigint not null,
        role_id bigint not null,
        primary key (user_id, role_id)
    ) engine=InnoDB;

    alter table tb_user 
       add constraint UK_4vih17mube9j7cqyjlfbcrk4m unique (email);

    alter table tb_user_role 
       add constraint FKea2ootw6b6bb0xt3ptl28bymv 
       foreign key (role_id) 
       references tb_role (id);

    alter table tb_user_role 
       add constraint FK7vn3h53d0tqdimm8cp45gc0kl 
       foreign key (user_id) 
       references tb_user (id);

    create table tb_role (
       id bigint not null auto_increment,
        role_name varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table tb_user (
       id bigint not null auto_increment,
        email varchar(255),
        name varchar(255),
        password varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table tb_user_role (
       user_id bigint not null,
        role_id bigint not null,
        primary key (user_id, role_id)
    ) engine=InnoDB;

    alter table tb_user 
       add constraint UK_4vih17mube9j7cqyjlfbcrk4m unique (email);

    alter table tb_user_role 
       add constraint FKea2ootw6b6bb0xt3ptl28bymv 
       foreign key (role_id) 
       references tb_role (id);

    alter table tb_user_role 
       add constraint FK7vn3h53d0tqdimm8cp45gc0kl 
       foreign key (user_id) 
       references tb_user (id);

    create table tb_role (
       id bigint not null auto_increment,
        role_name varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table tb_user (
       id bigint not null auto_increment,
        email varchar(255),
        name varchar(255),
        password varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table tb_user_role (
       user_id bigint not null,
        role_id bigint not null,
        primary key (user_id, role_id)
    ) engine=InnoDB;

    alter table tb_user 
       add constraint UK_4vih17mube9j7cqyjlfbcrk4m unique (email);

    alter table tb_user_role 
       add constraint FKea2ootw6b6bb0xt3ptl28bymv 
       foreign key (role_id) 
       references tb_role (id);

    alter table tb_user_role 
       add constraint FK7vn3h53d0tqdimm8cp45gc0kl 
       foreign key (user_id) 
       references tb_user (id);

    create table tb_role (
       id bigint not null auto_increment,
        role_name varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table tb_user (
       id bigint not null auto_increment,
        email varchar(255),
        name varchar(255),
        password varchar(255),
        primary key (id)
    ) engine=InnoDB;

    create table tb_user_role (
       user_id bigint not null,
        role_id bigint not null,
        primary key (user_id, role_id)
    ) engine=InnoDB;

    alter table tb_user 
       add constraint UK_4vih17mube9j7cqyjlfbcrk4m unique (email);

    alter table tb_user_role 
       add constraint FKea2ootw6b6bb0xt3ptl28bymv 
       foreign key (role_id) 
       references tb_role (id);

    alter table tb_user_role 
       add constraint FK7vn3h53d0tqdimm8cp45gc0kl 
       foreign key (user_id) 
       references tb_user (id);


INSERT INTO tb_user (name, email, password) VALUES ('Nina Brown', 'nina@gmail.com', '$2a$10$NYFZ/8WaQ3Qb6FCs.00jce4nxX9w7AkgWVsQCG6oUwTAcZqP9Flqu');
INSERT INTO tb_user (name, email, password) VALUES ('Leia Red', 'leia@gmail.com', '$2a$10$NYFZ/8WaQ3Qb6FCs.00jce4nxX9w7AkgWVsQCG6oUwTAcZqP9Flqu');

INSERT INTO tb_role (role_name) VALUES ('ROLE_OPERATOR');
INSERT INTO tb_role (role_name) VALUES ('ROLE_ADMIN');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);
