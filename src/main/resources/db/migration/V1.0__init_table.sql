create table users (
    id uuid default gen_random_uuid() primary key,
    name varchar(64),
    status boolean,
    address_id uuid,
    department_id uuid
);

create table addresses (
    id uuid default gen_random_uuid() primary key,
    info varchar(128)
);

create table departments (
    id uuid default gen_random_uuid() primary key,
    name varchar(32)
);

create table businesses (
    id uuid default gen_random_uuid() primary key,
    name varchar(32)
);

create table user_business (
    user_id uuid,
    business_id uuid,
    unique(user_id, business_id)
);
