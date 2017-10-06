// poderia vir de um servidor
var linguagens = [{nome: 'JavaScript'}, {nome: 'jQuery'}];

$.each(linguagens, function() {
	$('<li>').text(this.nome).appendTo('.lista');
});

$('button').click(function() {
	var input = $('input[type=text]');
	var linguagem = input.val();

	$('<li>').text(linguagem).appendTo('.lista');
	input.val('');
});
