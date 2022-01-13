create table users
(
    id      integer not null
        constraint user_pkey
            primary key,
    balance integer
);

alter table users
    owner to postgres;


