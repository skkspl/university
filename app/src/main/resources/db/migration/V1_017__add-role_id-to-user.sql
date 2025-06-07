alter table if exists "user"
add column if not exists role_id bigint,
add foreign key (role_id) references role(id);