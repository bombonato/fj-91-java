package br.com.caelum.fj91.js;

import java.io.InputStreamReader;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class ValidacaoJavascript {
	public static void main(String[] args) throws ScriptException, NoSuchMethodException {
		
		// Monta o contexto do Rhino
		ScriptEngineManager factory = new ScriptEngineManager();
        ScriptEngine engine = factory.getEngineByName("JavaScript");
        engine.eval(new InputStreamReader(ValidacaoJavascript.class.getResourceAsStream("/validacoes.js")));
		Invocable invocable = (Invocable) engine;
 
        String fraseEmMinusculo = "frase começando em minúsculo";
		
		// Invoca a validação para saber se começa com maiúscula
		// comecaComMaiuscula(valor) é uma função no script validacoes.js
		Object comecaComMaiuscula = invocable.invokeFunction("comecaComMaiuscula", fraseEmMinusculo);
        System.out.printf("\"%s\" começa com maiúscula? %b %n",fraseEmMinusculo, comecaComMaiuscula);

        
        // Disponibiliza objeto Java para o Javascript
        String texto = "pouco texto";
        int tamanhoMinimo = 20;

        // Invoca a validação para saber se possui um tamanho mínimo
        // possuiMinimoDeCaracteres(texto, tamanhoMinimo) é uma função no script validacoes.js
        Object possuiTamanhoMinimo = invocable.invokeFunction("possuiMinimoDeCaracteres",texto, tamanhoMinimo);
        System.out.println("O texto possui o tamanho mínimo? " + possuiTamanhoMinimo);
	}
}
