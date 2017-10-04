grammar Turma;

options {
  language=Java; 
}  
  
@header {
  package br.com.caelum.fj91.turma;
}

@lexer::header {
  package br.com.caelum.fj91.turma;
}

turma   
	: sigla (
	  		(PREPOSICAO? periodo  PREPOSICAO? sala) 
	  		|
	  		(PREPOSICAO? sala PREPOSICAO? periodo)
	  		)
	;
	
sigla 
	: ABR? HYPHEN? DOUBLE_DIGIT 
	;

periodo 
	: NOTURNO | SABADO 
	;

sala  
	: SALA? DIGIT 
	;

PREPOSICAO: 'ao' | 'aos' | 'de' | 'no' | 'na' ;
SABADO: 'sabado' | 'sabados' ;
NOTURNO: 'noturno' | 'noturnos' | 'noturna' | 'noturnas';
SALA:  'sala';
ABR: 'fj'|'FJ'|'rr'|'RR'|'cs'|'CS'|'pm'|'PM'|'wd'|'WD';

HYPHEN: '-';
DOUBLE_DIGIT: DIGIT DIGIT;  
DIGIT:  '0'..'9';
WS: (' '|'\t'|'\r'|'\n'|'\f')+ {$channel = HIDDEN;};
  
