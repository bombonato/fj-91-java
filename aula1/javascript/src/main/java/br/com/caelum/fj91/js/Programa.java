package br.com.caelum.fj91.js;
	
import java.util.Arrays;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Programa {
	public static void main(String[] args) throws ScriptException {
		ScriptEngineManager factory = new ScriptEngineManager();
        ScriptEngine engine = factory.getEngineByName("JavaScript");

        Object eval = engine.eval("Java.to([1.1, 9.0, 4.7, 5.33],Java.type(\"double[]\"))");
        double[] array = (double[]) eval;
        
        System.out.println("Tamanho do array: " + array.length);
        System.out.println("Iterando no array e exibindo os elementos:");
        System.out.println(Arrays.toString(array));
	}
}
