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
			Buscar: <input type="text" name="name" />
			En: <select>
  						<option value="cliente">cliente</option>
  						<option value="producto">producto</option>
  						<option value="pedido">pedido</option>
					</select>
            <input type="submit" value="buscar" />
    </form>
    <%= "hola a ver si anda esto" %>
</body>
</html>