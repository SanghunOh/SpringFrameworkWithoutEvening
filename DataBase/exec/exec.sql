SELECT MEMBER_SEQ, PASSWORD, 1 ENABLED FROM CIP_MEMBER WHERE MEMBER_ID = 'system'

SELECT * FROM CIP_AUTHORITY_MEMBER WHERE MEMBER_SEQ = '0411beb9b4fb4dcdb13945f3172526891'

delete from CIP_COMMON_CODE
where COMMON_CODE_ID in (select COMMON_CODE_ID from CIP_COMMON_CODE
						start with COMMON_CODE_ID in ('Use_YN', 'System_Code_YN')
						connect by prior COMMON_CODE_ID = PARENT_COMMON_CODE_ID) ;
						
INSERT into (    AUTHORITY_ID      , MEMBER_SEQ     , REGISTER_SEQ     , REGISTRY_DATE     , MODIFIER_SEQ     , MODIFY_DATE    )   
values        
(    ?      , ?     , ?     , sysdate     , ?     , sysdate    )    ,    
(    ?      , ?     , ?     , sysdate     , ?     , sysdate    )						