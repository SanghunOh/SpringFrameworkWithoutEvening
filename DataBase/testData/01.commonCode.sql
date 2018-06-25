delete
from CIP_COMMON_CODE;

insert into CIP_COMMON_CODE 
(COMMON_CODE_ID,NAME,ORDER_NUMBER,ATTRIBUTION_1,ATTRIBUTION_2,DESCRIPTION,SYSTEM_CODE_YN,USE_YN,PARENT_COMMON_CODE_ID,REGISTER_SEQ,REGISTRY_DATE,MODIFIER_SEQ,MODIFY_DATE) 
select 'Use_YN','Yes or No',1,,NULL,NULL'Using Yes or No','System_Code_Yes','Yes',,NULL'UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'Yes','Yes',1,,NULL,NULL'Using Yes','System_Code_Yes','Yes','Use_YN','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'No','No',2,,NULL,NULL'Using No','System_Code_Yes','Yes','Use_YN','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'System_Code_YN','Sytem Yes or No',1,,NULL,NULL'Sytem Using Yes or No','System_Code_Yes','Yes',,NULL'UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'System_Code_Yes','Yes',1,,NULL,NULL'Sytem Using Yes','System_Code_Yes','Yes','System_Code_YN','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'System_Code_No','No',2,,NULL,NULL'Sytem Using No','System_Code_Yes','Yes','System_Code_YN','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual ; 
