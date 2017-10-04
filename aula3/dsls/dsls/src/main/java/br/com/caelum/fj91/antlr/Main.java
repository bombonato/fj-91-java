package br.com.caelum.fj91.antlr;

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import br.com.caelum.fj91.modelo.Turma;

public class Main {

	public static void main(String[] args) throws RecognitionException {
		
		//11 na sala1 noturno
		//FJ-31 noturna sala3
		
		CharStream input = new ANTLRStringStream("21 aos sabados na sala1");
		TurmaLexer lexer = new TurmaLexer(input);
		CommonTokenStream tokenStream = new CommonTokenStream(lexer);
		TurmaParser parser = new TurmaParser(tokenStream);

		Turma turma = parser.toTurma();
		
		System.out.println(turma);
	}


}
