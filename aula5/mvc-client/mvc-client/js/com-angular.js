//criação do module
var app = angular.module('linguagemModule', []);

//criação do controlador
app.controller('LinguagensController', function($scope) {

	//objetos disponíves na tela
	$scope.linguagens = [new Linguagem("Java"), new Linguagem("JavaScript")];
	$scope.nome = "";

	//funções disponíveis na tela
	$scope.adiciona = function() {
		var novaLinguagem = new Linguagem($scope.nome);
		$scope.linguagens.push(novaLinguagem);
		$scope.nome = "";
	};
});

//definicao do modelo
function Linguagem(nome) {
	"use strict";

	var nome = nome;

	this.getNome = function() {
		return nome;
	}
}
