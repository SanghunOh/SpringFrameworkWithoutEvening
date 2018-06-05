DELETE FROM CIP_AUTHORITY_MEMBER;

delete from CIP_MEMBER;

insert into CIP_MEMBER 
(MEMBER_SEQ,MEMBER_ID,PASSWORD,NAME,EMAIL,CELLPHONE,ORGANIZATION_SEQ,REGISTER_SEQ,REGISTRY_DATE,MODIFIER_SEQ,MODIFY_DATE) 
select 'UUID-1111-1111111','system_admin','system_admin','system admin','system_admin@pulsehu.com','010-1234-45678','UUID-11-CIPI9M','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-1111-1111112','guest','guest','system guest','guest@pulsehu.com','010-1234-45678','UUID-11-CIPI9M','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-1111-1111113','member','member','system member','member@pulsehu.com','010-1234-45678','UUID-11-CIPI9M','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-1111-1111114','system','system','system admin','system@pulsehu.com','010-1234-45678','UUID-11-CIPI9M','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-60528','Lehmanns_Marktstand','Lehmanns_Marktstand','Lehmanns Marktstand','Renate@Messner.com','010-6052-7678','UUID-11-CIPI9L','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-52066','Drachenblut_Delikatessend','Drachenblut_Delikatessend','Drachenblut Delikatessend','Sven@Ottlieb.com','010-520-9966','UUID-11-CIPI9Z','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-41101','Godos_Cocina_Típica','Godos_Cocina_Típica','Godos Cocina Típica','José@Pedro@Freyre.com','010-4110-0981','UUID-11-CIPI7Y','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-5021','Ana_Trujillo_Emparedados_y_helados','Ana_Trujillo_Emparedados_y_helados','Ana Trujillo Emparedados y helados','Ana@Trujillo.com','010-5021-9890','UUID-11-CIPI9A','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-5023','Antonio_Moreno_Taquería','Antonio_Moreno_Taquería','Antonio Moreno Taquería','Antonio@Moreno.com','010-5023-890','UUID-11-CIPI9Q','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-WA1-1DP','Around_the_Horn','Around_the_Horn','Around the Horn','Thomas@Hardy.com','010-979-09876','UUID-11-CIPI9L','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-S-958-22','Berglunds_snabbköp','Berglunds_snabbköp','Berglunds snabbköp','Christina@Berglund.com','010-958-2298','UUID-11-CIPI9E','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-68306','Blauer_See_Delikatessen','Blauer_See_Delikatessen','Blauer See Delikatessen','Hanna@Moos.com','010-6830-0966','UUID-11-CIPI9D','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-67000','Blondel_père_et_fils','Blondel_père_et_fils','Blondel père et fils','Frédérique@Citeaux.com','010-6700-9870','UUID-11-CIPI9Z','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-28023','Bólido_Comidas_preparadas','Bólido_Comidas_preparadas','Bólido Comidas preparadas','Martín@Sommer.com','010-280-9023','UUID-11-CIPI8Z','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-13008','Bon_app','Bon_app','Bon app','Laurence@Lebihans.com','010-1300-0988','UUID-11-CIPI7Z','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-T2F-8M4','Bottom-Dollar_Marketse','Bottom-Dollar_Marketse','Bottom-Dollar Marketse','Elizabeth@Lincoln.com','010-9087-9099','UUID-11-CIPI7Y','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-EC2-5NT','Bs_Beverages','Bs_Beverages','Bs Beverages','Victoria@Ashworth.com','010-9088-0987','UUID-11-CIPI9M','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-10109302','Cactus_Comidas_para_llevar','Cactus_Comidas_para_llevar','Cactus Comidas para llevar','Patricio@Simpson.com','010-1010-7658','UUID-11-CIPI9A','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-50227676','Centro_comercial_Moctezuma','Centro_comercial_Moctezuma','Centro comercial Moctezuma','Francisco@Chang.com','010-5022-9089','UUID-11-CIPI9Q','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-3012','Chop-suey_Chinese','Chop-suey_Chinese','Chop-suey Chinese','Yang@Wang.com','010-3012-0956','UUID-11-CIPI9L','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-05432-043','Comércio_Mineiro','Comércio_Mineiro','Comércio Mineiro','Pedro@Afonso.com','010-05432-043','UUID-11-CIPI9E','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-WX1-6LT','Consolidated_Holdings','Consolidated_Holdings','Consolidated Holdings','Elizabeth@Brown.com','010-8987-0944','UUID-11-CIPI9D','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-44000987','Du_monde_entier','Du_monde_entier','Du monde entier','Janine@Labrune.com','010-4400-12340','UUID-11-CIPI8Z','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-WX3-6FW','Eastern_Connection','Eastern_Connection','Eastern Connection','Ann@Devon.com','010-2465-8900','UUID-11-CIPI7Z','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-8010','Ernst_Handel','Ernst_Handel','Ernst Handel','Roland@Mendel.com','010-8010-8976','UUID-11-CIPI7Y','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-05442-030','Familia_Arquibaldo','Familia_Arquibaldo','Familia Arquibaldo','Aria@Cruz.com','010-05442-0830','UUID-11-CIPI9M','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-28034','FISSA_Fabrica_Inter._Salchichas_S.A.','FISSA_Fabrica_Inter._Salchichas_S.A.','FISSA Fabrica Inter. Salchichas S.A.','Diego@Roel.com','010-2803-0934','UUID-11-CIPI9A','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-59000','Folies_gourmandes','Folies_gourmandes','Folies gourmandes','Martine@Rancé.com','010-5900-2310','UUID-11-CIPI9Q','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-S-844-67','Folk_och_fä_HB','Folk_och_fä_HB','Folk och fä HB','Maria@Larsson.com','010-898-0967','UUID-11-CIPI9L','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-80805','Frankenversand','Frankenversand','Frankenversand','Peter@Franken.com','010-8080-6785','UUID-11-CIPI9E','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-4400032','France_restauration','France_restauration','France restauration','Carine@Schmitt.com','010-440-9600','UUID-11-CIPI9D','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-10100','Franchi_S.p.A.','Franchi_S.p.A.','Franchi S.p.A.','Paolo@Accorti.com','010-1010-3420','UUID-11-CIPI9Z','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-1675','Furia_Bacalhau_e_Frutos_do_Mar','Furia_Bacalhau_e_Frutos_do_Mar','Furia Bacalhau e Frutos do Mar','Lino@Rodriguez.com','010-1675-9806','UUID-11-CIPI8Z','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-8022','Galería_del_gastrónomo','Galería_del_gastrónomo','Galería del gastrónomo','Eduardo@Saavedra.com','010-8022-3425','UUID-11-CIPI7Z','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-04876-786','Gourmet_Lanchonetes','Gourmet_Lanchonetes','Gourmet Lanchonetes','André@Fonseca.com','010-04876-786','UUID-11-CIPI9M','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-97403','Great_Lakes_Food_Market','Great_Lakes_Food_Market','Great Lakes Food Market','Howard@Snyder.com','010-9740-0983','UUID-11-CIPI9A','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-1081','GROSELLA-Restaurante','GROSELLA-Restaurante','GROSELLA-Restaurante','Manuel@Pereira.com','010-1081-2314','UUID-11-CIPI9Q','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-05454-876','Hanari_Carnes','Hanari_Carnes','Hanari Carnes','Mario@Pontes.com','010-05454-876','UUID-11-CIPI9L','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-502276','HILARIÓN-Abastos','HILARIÓN-Abastos','HILARIÓN-Abastos','Carlos@Hernández.com','010-5022-0987','UUID-11-CIPI9E','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-97827','Hungry_Coyote_Import_Store','Hungry_Coyote_Import_Store','Hungry Coyote Import Store','Yoshi@Latimer.com','010-9782-9867','UUID-11-CIPI9D','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-482320','Hungry_Owl_All-Night_Grocers','Hungry_Owl_All-Night_Grocers','Hungry Owl All-Night Grocers','Patricia@McKenna.com','010-7564-0989','UUID-11-CIPI9Z','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-PO31-7PJ','Island_Trading','Island_Trading','Island Trading','Helen@Bennett.com','010-9870-9879','UUID-11-CIPI8Z','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-14776','Königlich_Essen','Königlich_Essen','Königlich Essen','Philip@Cramer.com','010-14776-5456','UUID-11-CIPI7Z','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-78000','La_corne_dabondance','La_corne_dabondance','La corne dabondance','Daniel@Tonini.com','010-7800-9875','UUID-11-CIPI7Y','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-31000','La_maison_dAsie','La_maison_dAsie','La maison dAsie','Annette@Roulet.com','010-3100-9880','UUID-11-CIPI9M','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-V3F-2K1','Laughing_Bacchus_Wine_Cellars','Laughing_Bacchus_Wine_Cellars','Laughing Bacchus Wine Cellars','Yoshi@Tannamuri.com','010-5468-9887','UUID-11-CIPI9A','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-99362','Lazy_K_Kountry_Store','Lazy_K_Kountry_Store','Lazy K Kountry Store','John@Steel.com','010-9936-4322','UUID-11-CIPI9Q','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-94117','Lets_Stop_N_Shop','Lets_Stop_N_Shop','Lets Stop N Shop','Jaime@Yorres.com','010-9411-9067','UUID-11-CIPI9E','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-3508','LILA-Supermercado','LILA-Supermercado','LILA-Supermercado','Carlos@González.com','010-3508-3567','UUID-11-CIPI9D','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-4980','LINO-Delicateses','LINO-Delicateses','LINO-Delicateses','Felipe@Izquierdo.com','010-4980-2345','UUID-11-CIPI9Z','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-24100','Magazzini_Alimentari_Riuniti','Magazzini_Alimentari_Riuniti','Magazzini Alimentari Riuniti','Giovanni@Rovelli.com','010-2410-9890','UUID-11-CIPI7Z','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-B-1180','Maison_Dewey','Maison_Dewey','Maison Dewey','Catherine@Dewey.com','010-1180-890','UUID-11-CIPI7Y','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-H1J-1C3','Mère_Paillarde','Mère_Paillarde','Mère Paillarde','Jean@Fresnière.com','010-0954-0987','UUID-11-CIPI9M','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-4179','Morgenstern_Gesundkost','Morgenstern_Gesundkost','Morgenstern Gesundkost','Alexander@Feuer.com','010-4179','UUID-11-CIPI9A','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-SW7-1RZ','North/South','North/South','North/South','Simon@Crowther.com','010-9809-3452','UUID-11-CIPI9Q','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-10103667','Océano_Atlántico_Ltda.','Océano_Atlántico_Ltda.','Océano Atlántico Ltda.','Yvonne@Moncada.com','010-1010-1234','UUID-11-CIPI9L','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-99508','Old_World_Delicatessen','Old_World_Delicatessen','Old World Delicatessen','Rene@Phillips.com','010-9950-8788','UUID-11-CIPI9E','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-50739','Ottilies_Käseladen','Ottilies_Käseladen','Ottilies Käseladen','Henriette@Pfalzheim.com','010-50739','UUID-11-CIPI9D','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-75012','Paris_spécialités','Paris_spécialités','Paris spécialités','Marie@Bertrand.com','010-75012','UUID-11-CIPI9Z','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-503376586','Pericles_Comidas_clásicas','Pericles_Comidas_clásicas','Pericles Comidas clásicas','Guillermo@Fernández.com','010-5033-6546','UUID-11-CIPI8Z','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-5020','Piccolo_und_mehr','Piccolo_und_mehr','Piccolo und mehr','Georg@Pipps.com','010-5020-0979','UUID-11-CIPI7Z','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-1756','Princesa_Isabel_Vinhoss','Princesa_Isabel_Vinhoss','Princesa Isabel Vinhoss','Isabel@de@Castro.com','010-1756-4657','UUID-11-CIPI7Y','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-02389-673','Que_Delícia','Que_Delícia','Que Delícia','Bernardo@Batista.com','010-0238-8673','UUID-11-CIPI9M','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-05487-020','Queen_Cozinha','Queen_Cozinha','Queen Cozinha','Lúcia@Carvalho.com','010-05487-020','UUID-11-CIPI9A','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-1307','QUICK-Stop','QUICK-Stop','QUICK-Stop','Horst@Kloss.com','010-1307-9879','UUID-11-CIPI9Q','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-10102546','Rancho_grande','Rancho_grande','Rancho grande','Sergio@Gutiérrez.com','010-1010-1234','UUID-11-CIPI9L','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-87110','Rattlesnake_Canyon_Grocery','Rattlesnake_Canyon_Grocery','Rattlesnake Canyon Grocery','Paula@Wilson.com','010-8711-9790','UUID-11-CIPI9E','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-42100','Reggiani_Caseifici','Reggiani_Caseifici','Reggiani Caseifici','Maurizio@Moroni.com','010-42100-5456','UUID-11-CIPI9D','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-02389-890','Ricardo_Adocicados','Ricardo_Adocicados','Ricardo Adocicados','Janete@Limeira.com','010-02389-8890','UUID-11-CIPI9Z','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-1203','Richter_Supermarkt','Richter_Supermarkt','Richter Supermarkt','Michael@Holz.com','010-1203-45354','UUID-11-CIPI8Z','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-28001','Romero_y_tomillo','Romero_y_tomillo','Romero y tomillo','Alejandra@Camino.com','010-28001-76787','UUID-11-CIPI7Z','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-4110','Santé_Gourmet','Santé_Gourmet','Santé Gourmet','Jonas@Bergulfsen.com','010-4110-3273','UUID-11-CIPI7Y','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-83720','Save-a-lot_Markets','Save-a-lot_Markets','Save-a-lot Markets','Jose@Pavarotti.com','010-83720-878','UUID-11-CIPI9M','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-OX15-4NB','Seven_Seas_Imports','Seven_Seas_Imports','Seven Seas Imports','Hari@Kumar.com','010-987-0945','UUID-11-CIPI9A','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-1734','Simons_bistro','Simons_bistro','Simons bistro','Jytte@Petersen.com','010-1734-8768','UUID-11-CIPI9Q','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-75016','Spécialités_du_monde','Spécialités_du_monde','Spécialités du monde','Dominique@Perrier.com','010-75016-86768','UUID-11-CIPI9L','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-82520','Split_Rail_Beer_&_Ale','Split_Rail_Beer_&_Ale','Split Rail Beer & Ale','Art@Braunschweiger.com','010-82520','UUID-11-CIPI9E','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-B-6000','Suprêmes_délices','Suprêmes_délices','Suprêmes délices','Pascale@Cartrain.com','010-6000-7657','UUID-11-CIPI9D','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-97201','The_Big_Cheese','The_Big_Cheese','The Big Cheese','Liz@Nixon.com','010-97201-9867','UUID-11-CIPI9Z','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-59801','The_Cracker_Box','The_Cracker_Box','The Cracker Box','Liu@Wong.com','010-59801-4566','UUID-11-CIPI8Z','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-44087','Toms_Spezialitäten','Toms_Spezialitäten','Toms Spezialitäten','Karin@Josephs.com','010-44087-4567','UUID-11-CIPI7Z','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-50338766','Tortuga_Restaurante','Tortuga_Restaurante','Tortuga Restaurante','Miguel@Angel@Paolino.com','010-5033-7868','UUID-11-CIPI7Y','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-05634-030','Tradição_Hipermercados','Tradição_Hipermercados','Tradição Hipermercados','Anabela@Domingues.com','010-0564-0390','UUID-11-CIPI9M','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-98034','Trails_Head_Gourmet_Provisioners','Trails_Head_Gourmet_Provisioners','Trails Head Gourmet Provisioners','Helvetius@Nagy.com','010-9803-9664','UUID-11-CIPI9A','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-8200','Vaffeljernet','Vaffeljernet','Vaffeljernet','Palle@Ibsen.com','010-8200-7633','UUID-11-CIPI9Q','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-69004','Victuailles_en_stock','Victuailles_en_stock','Victuailles en stock','Mary@Saveley.com','010-69004-9989','UUID-11-CIPI9L','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-51100','Vins_et_alcools_Chevalier','Vins_et_alcools_Chevalier','Vins et alcools Chevalier','Paul@Henriot.com','010-5110-3240','UUID-11-CIPI9E','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-70563','Die_Wandernde_Kuh','Die_Wandernde_Kuh','Die Wandernde Kuh','Rita@Müller.com','010-70563-9800','UUID-11-CIPI9D','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-90110','Wartian_Herkku','Wartian_Herkku','Wartian Herkku','Pirkko@Koskitalo.com','010-9011-9780','UUID-11-CIPI9Z','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-08737-363','Wellington_Importadora','Wellington_Importadora','Wellington Importadora','Paula@Parente.com','010-0873-9363','UUID-11-CIPI8Z','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-98128','White_Clover_Markets','White_Clover_Markets','White Clover Markets','Karl@Jablonski.com','010-9812-2348','UUID-11-CIPI7Z','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-21240','Wilman_Kala','Wilman_Kala','Wilman Kala','Matti@Karttunen.com','010-2124-03450','UUID-11-CIPI7Y','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-01-012','Wolski','Wolski','Wolski','Zbyszek.com','010-0107-7012','UUID-11-CIPI9M','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual union all 
select 'UUID-97219','Lonesome_Pine_Restaurant','Lonesome_Pine_Restaurant','Lonesome Pine Restaurant','Fran@Wilson.com','010-9721-9829','UUID-11-CIPI8Z','UUID-1111-1111111',sysdate,'UUID-1111-1111111',sysdate from dual ;

-- password = "123456" with BCryptPasswordEncoder() 
update CIP_MEMBER
set PASSWORD = '$2a$10$EblZqNptyYvcLm/VwDCVAuBjzZOI7khzdyGPBr08PpIi0na624b8.';

