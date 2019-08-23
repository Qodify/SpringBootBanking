insert into CURRENCY values(1,'EUR','Euro','€');
insert into CURRENCY values(2,'USD','US Dollar','$');


insert into PERSON values(1,'Quinten Spillemaeckers');
insert into BANKACCOUNT
(BANKACCOUNT_ID,IBAN,PROVIDER,BALANCE,CURRENCY_CODE,PERSON_ID)
values(1,'BE18587126223765','ING', 3000, 1,1);

insert into PERSON values(2,'Ingrid Janssens');
insert into BANKACCOUNT
(BANKACCOUNT_ID,IBAN,PROVIDER,BALANCE,CURRENCY_CODE,PERSON_ID)
values(2,'BE13999522923939','KBC', 9000, 1,2);