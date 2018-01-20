CREATE DEFINER=`root`@`localhost` PROCEDURE `registrar_provedor`(IN codigo_proveedor varchar(25) ,
                                   IN empresa varchar(25),
                                   IN tel_empresa varchar(15),
                                   IN proveedor varchar(25),
                                   IN tel_proveedor varchar(15),
                                   IN no_cuenta_banco varchar(45))
BEGIN
   
     INSERT INTO proveedor(codigo_proveedor, empresa, tel_empresa, proveedor, Proveedor, tel_proveedor, no_cuenta_banco) VALUES(codigo_proveedor, empresa, tel_empresa, proveedor, Proveedor, tel_proveedor, no_cuenta_banco);
END