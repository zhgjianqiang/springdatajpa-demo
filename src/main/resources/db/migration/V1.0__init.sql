create table users (
    id uuid default gen_random_uuid() primary key,
    create_time timestamp,
    update_time timestamp,
    name varchar(64),
    address_id uuid,
    department_id uuid
);

create table addresses (
    id uuid default gen_random_uuid() primary key,
    create_time timestamp,
    update_time timestamp,
    address_value varchar(128),
    user_id uuid
);

create table departments (
    id uuid default gen_random_uuid() primary key,
    create_time timestamp,
    update_time timestamp,
    name varchar(32)
);

create table businesses (
    id uuid default gen_random_uuid() primary key,
    create_time timestamp,
    update_time timestamp,
    name varchar(32)
);

create table user_business (
    user_id uuid,
    business_id uuid,
    unique(user_id, business_id)
);
