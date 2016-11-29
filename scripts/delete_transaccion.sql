delete from BP_DATOS_ADICIONALES_DIRECTA where id in (select id from BP_ANEXO_DIRECTA where id_transaccion IN (select id_transaccion from bp_transaccion where codigo_barra = '900619460990000010201611048423550990000010O'));
delete from BP_ANEXO_DIRECTA where id_transaccion IN (select id_transaccion from bp_transaccion where codigo_barra = '900619460990000010201611048423550990000010O');
delete from bp_transaccion where codigo_barra = '900619460990000010201611048423550990000010O';
commit;

select * from bp_transaccion where codigo_barra = '900619460990000010201611048423550990000010O';

select table_name, constraint_name, status, owner
from all_constraints
where constraint_type = 'R'
and r_constraint_name in
 (
   select constraint_name from all_constraints
   where constraint_type in ('P', 'U')
 )
and constraint_name = 'FK_Q5EO9GVKXKEQ6L88G4MLDUK2C'
order by table_name, constraint_name