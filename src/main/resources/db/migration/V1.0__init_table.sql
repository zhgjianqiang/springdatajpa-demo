create table users (
    id uuid default uuid_generate_v4() primary key,
    name varchar(64),
    status boolean,
    address_id uuid,
    department_id uuid
);

create table addresses (
    id uuid default uuid_generate_v4() primary key,
    info varchar(128)
);

create table departments (
    id uuid default uuid_generate_v4() primary key,
    name varchar(32)
);

create table businesses (
    id uuid default uuid_generate_v4() primary key,
    name varchar(32)
);

create table user_business (
    user_id uuid,
    business_id uuid,
    unique(user_id, business_id)
);
