DELETE FROM CIP_MENU_AUTHORITY;
DELETE FROM CIP_MENU;

-- 메뉴
insert into CIP_MENU 
(MENU_SEQ,NAME,ORDER_NUMBER,MENU_URI,USE_YN,PARENT_MENU_SEQ,REGISTER_SEQ,REGISTRY_DATE,MODIFIER_SEQ,MODIFY_DATE) 
select 'UUID-000001','HOME',1,'/','Y','','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all
select 'UUID-000002','ORGANIZATION',1,'/organization/list','Y','','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all
select 'UUID-0000021','LIST',1,'/organization/list','Y','UUID-000002','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all
select 'UUID-0000022','EDIT',2,'/organization/edit','Y','UUID-000002','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all
select 'UUID-000003','COMMON CODE',2,'/commonCode/list','Y','','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all
select 'UUID-0000031','LIST',1,'/commonCode/list','Y','UUID-000003','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all
select 'UUID-0000032','EDIT',2,'/commonCode/edit','Y','UUID-000003','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all
select 'UUID-000004','MEMBER',3,'/member/list','Y','','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all
select 'UUID-0000041','LIST',1,'/member/list','Y','UUID-000004','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all
select 'UUID-0000042','EDIT',2,'/member/edit','Y','UUID-000004','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual ;

