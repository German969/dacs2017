<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="POST" action="prueba">
			Accion: <select name="accion">
  						<option value="buscar">buscar</option>
  						<option value="agregar">agregar</option>
  						<option value="eliminar">eliminar</option>
					</select>
			Valor: <input type="text" name="valor" />
			En: <select name="donde">
  						<option value="cliente">cliente</option>
  						<option value="producto">producto</option>
  						<option value="pedido">pedido</option>
				</select>
            <input type="submit" value="Aceptar" />
    </form>
    <%= "hola a ver si anda esto" %>
</body>
</html>