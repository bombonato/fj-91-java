<html>
<head>
<title>Login</title>
</head>
<body>

	<h2>Aplicação Spring</h2>

	Tem dois usuários disponíveis, o grupo ROLE_USER tem acesso livre.
	
	<br /> <br />   

	Login: user <br /> 
	Senha: pass <br /> 
	Grupo: ROLE_USER

	<br /> <br />   
	
	Login: admin <br /> 
	Senha: pass  <br /> 
	Grupo: ROLE_ADMIN <br /> 

	<br /> <hr />
	 
	<h2>Login</h2>
	
	<form action="login" method="post">
		Login : 
		<input type="text" name="j_username" /><br /> 
		Senha : 
		<input type="password" name="j_password" /><br /> 
		<input type="submit" value="Login">
	</form>
	
	<hr />
	
	<h2>WebServices disponíveis</h2>
	
	<a href="ContatosWS">WebService WS* Contatos</a>
	
	<br /> 
	
	<a href="contatos/1">WebService Rest Contatos</a>
	
</body>
</html>