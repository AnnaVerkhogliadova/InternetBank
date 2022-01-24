CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    balance integer
);

CREATE TABLE operations (
    operation_id SERIAL PRIMARY KEY,
    user_id integer,
    date date,
    sum integer,
    type_of_operation text,
    CONSTRAINT fk_operations_user_id__users_id FOREIGN KEY (user_id) REFERENCES users (id)
);