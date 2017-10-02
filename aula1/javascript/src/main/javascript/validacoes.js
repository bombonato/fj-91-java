function comecaComMaiuscula(texto) {
//	showOnConsole(texto);
	var resultado = /^[A-Z]+.*$/.test(texto);
	return resultado;
}

function possuiMinimoDeCaracteres(texto, tamanhoMinimo) {
//	showOnConsole(texto);
	return texto.length > tamanhoMinimo
}