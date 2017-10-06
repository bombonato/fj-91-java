<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8" />
<title>Cadastro</title>
<link rel="stylesheet" type="text/css" href="resources/css/estilo.css"/>
</head>
<body>
	<form>
		<label>Nome:</label>
		<input type="text" name="nome"/>
		<label>Idade:</label>
		<input type="text" name="idade"/> 
		<input type="submit" value="gravar"/>
		<table>
			<tr>
				<th>Nome</th>
				<th>Idade</th>
			<tr>
		</table>
	</form>
	<script src="resources/js/jquery.js"></script>
	<script>
		$("input[type=submit]").on("click", function(event) {
			event.preventDefault();
			$.ajax({
				url : "adiciona",
				data : $("form").serialize(),
				success : function(retorno, codigo, xhr) {
					$(retorno).appendTo("table");
				}
			});
		});
	</script>
</body>
</html>
