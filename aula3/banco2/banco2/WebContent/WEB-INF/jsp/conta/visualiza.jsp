<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	<h1>Conta <c:out value="${conta.numero}" escapeXml="true" /> do 
			<c:out value="${conta.titular.nome}" escapeXml="true" /></h1>
	
	<h3>Saldo atual: ${conta.saldo}</h3>
	
	<form action="saca" method="post">
		<input type="hidden" name="numero" value="${conta.numero}">
		Sacar R$ <input type="text" name="valor">
		<input type="submit" value="OK">
		${mensagem} <font color=red>${erro}</font>
	</form>
	
	<form action="deposita" method="post">
		<input type="hidden" name="numero" value="${conta.numero}">
		Depositar R$ <input type="text" name="valor">
		<input type="submit" value="OK">
		${deposito}
	</form>
	
	<h3>
		<a href="lista">Lista contas do ano</a>
	</h3>
	
</html>