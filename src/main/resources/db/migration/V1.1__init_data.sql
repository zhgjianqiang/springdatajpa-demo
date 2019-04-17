insert into addresses values ('00000000-0000-0000-0000-000000000000', 'a小区');
insert into addresses values ('00000000-0000-0000-0000-000000000001', 'b小区');
insert into addresses values ('00000000-0000-0000-0000-000000000002', 'c小区');
insert into addresses values ('00000000-0000-0000-0000-000000000003', 'd小区');
insert into addresses values ('00000000-0000-0000-0000-000000000004', 'e小区');
insert into addresses values ('00000000-0000-0000-0000-000000000005', 'f小区');
commit;

insert into departments values ('00000000-0000-0000-0000-000000000000', '产品');
insert into departments values ('00000000-0000-0000-0000-000000000001', '研发');
insert into departments values ('00000000-0000-0000-0000-000000000002', '测试');
commit;

insert into businesses values ('00000000-0000-0000-0000-000000000000', 'a业务');
insert into businesses values ('00000000-0000-0000-0000-000000000001', 'b业务');
insert into businesses values ('00000000-0000-0000-0000-000000000002', 'c业务');
commit;

insert into users values ('00000000-0000-0000-0000-000000000000', 'a产品', '00000000-0000-0000-0000-000000000000', '00000000-0000-0000-0000-000000000000');
insert into users values ('00000000-0000-0000-0000-000000000001', 'b研发', '00000000-0000-0000-0000-000000000001', '00000000-0000-0000-0000-000000000001');
insert into users values ('00000000-0000-0000-0000-000000000002', 'c研发', '00000000-0000-0000-0000-000000000002', '00000000-0000-0000-0000-000000000001');
insert into users values ('00000000-0000-0000-0000-000000000003', 'd研发', '00000000-0000-0000-0000-000000000003', '00000000-0000-0000-0000-000000000001');
insert into users values ('00000000-0000-0000-0000-000000000004', 'e测试', '00000000-0000-0000-0000-000000000004', '00000000-0000-0000-0000-000000000002');
insert into users values ('00000000-0000-0000-0000-000000000005', 'f测试', '00000000-0000-0000-0000-000000000005', '00000000-0000-0000-0000-000000000002');
commit;

insert into user_business values ('00000000-0000-0000-0000-000000000000', '00000000-0000-0000-0000-000000000000');
insert into user_business values ('00000000-0000-0000-0000-000000000000', '00000000-0000-0000-0000-000000000001');
insert into user_business values ('00000000-0000-0000-0000-000000000000', '00000000-0000-0000-0000-000000000002');
insert into user_business values ('00000000-0000-0000-0000-000000000001', '00000000-0000-0000-0000-000000000000');
insert into user_business values ('00000000-0000-0000-0000-000000000001', '00000000-0000-0000-0000-000000000001');
insert into user_business values ('00000000-0000-0000-0000-000000000002', '00000000-0000-0000-0000-000000000001');
insert into user_business values ('00000000-0000-0000-0000-000000000003', '00000000-0000-0000-0000-000000000002');
insert into user_business values ('00000000-0000-0000-0000-000000000004', '00000000-0000-0000-0000-000000000001');
insert into user_business values ('00000000-0000-0000-0000-000000000005', '00000000-0000-0000-0000-000000000002');
commit;