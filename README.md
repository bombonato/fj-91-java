# fj-91-java

# Aula1

Faz um apanhado dos cursos da Caelum. FJ11, FJ21, FJ25, FJ26, etc

**Tratar**
1. Arquitetura / Arquiteto
2. Java & JVM
3. OO e Design de Código
4. Separação de Conceitos (SOC)
5. Requisitos Não Funcionais e Decisões arquiteturais
6. Integração de Sistemas

## Arquitetura / Arquiteto de Software

* são as decisões difícies a serem tomadas no desenvolvimento de software
* é uma má prática tentar definir tudo no começo, pois ainda não se sabe muito sobre o problema, o que será desenvolvimento. Mais haver com modelo ágil
* o que existe é código, logo,arquitetura seria uma visão alto nível do código.
* Se confunde muito entre implemntação, design ou arquitetura. Arquitetura é uma visão alto nível de seu código. Logo, a implementação é uma visão de seu código
* Arquitetura e design são interpretações, visões, leituras críticas de uma implementação. (pg 3)

* O prefácio do livro foi feito pelo Jim Webber, criador do Neo4j.

* O arquiteto, segundo prefácio, é uma pessoa que conhece o sistema de ponto-a-ponta, que sabe, quais as decisões foram tomadas.

### Arquitetura de Referência / Preferência

* **Arquitetura de Referência**. A idéia era tentar colocar uma padronização na salada de tecnologias, o que coloca um pouco ordem ao caos. Mas por contrário, pode engessar para usar algo ou alguma tecnologia que não faz sentido usar para o projeto.
* **Arquitetura de Preferência**. A equipe/empresa prefere usar essa tecnologia. Mas para cada projeto, é possível discutir sobre a tecnologia.

* A idéia é que o arquiteto precise estar próximo ao código. Assim, próximo da equipe, auxiliando, ajudando e refletindo sobre as decisões tomadas no projeto. Por exemplo, o código esta muito acoplato. Buscar o equilibrio.
* O arquiteto acaba nem sempre tomando somente decisões técnicas, o que nem sempre é bom. Por exemplo, todos trabalham com Java/JSF e decide trocar para Angular. Tecnecamente é bom, mas a equipe sabe usar? Mas saber sobre a organização. Usar uma tecnologia nova que ninguem usa, qdo der problema, como obter suporte e ajuda sobre. Estas decisões precisam ser levadas em consideração.

* *Multi tenance* - qdo quer separar os acessos a recursos independentes entre eles. Por exemplo, usuário acessando recurso, mas eles não se exergam/interferem.

* Arquiteto coorporativo, isolado, o que não é bom. Precisa ter um pouco sobre liderança, para orientar equipe. Enquanto os desenvolvedores estão mais nos requisitos funcionais, o arquiteto também precisa refletir/se preocupar com os requisitos não funcionais.

## Java

Slogam Java - WORA - *Write Once Run Anyware*.

Vendor Lock-in - termo que fala sobre ficar preso em um único vendedor. A idéia do Java era não ficar preso.

Desde o começo, quem "manda" no Java é a comunidade. O JCP (*Java Community Process*). Não é a Oracle, não era a SUN, era o comite que tomava as decisões.

Para todas as novas funcionalidade, propostas, especificações ao JCP usa-se o JSR (*Java Specification Request*) e submete ao comite.

O problema da especificação e comite é que fica tudo muito mais lento e demorado. As decisões são mais difíceis, com menos inovações. Mais difícil de acompanhar o mercado.

### Especificação x Implemntação

Espcecificação | Impmentação
* JPA | Hibernate, EclipseLink
* JSF
* CDI
* EJB

As especificações ficam no [jcp.org](https://www.jcp.org)

* É bom acessar as especificações para pegar mais informações sobre a tecnologia que esta utilizando. Por exemplo, em JPA, saber deste guia se ele foi feito, por exemplo, pelo hibernate ou faz parte da especificação.

### Licença

Diz que o Java é gratuíto para criação de aplicações Cliente e Servidor (ClientSide e ServerSide). Já para aplicações embarcadas, ai é pago.

### JVM
Java é compilado e interpretado. Primeiro ele compila para Bytecode e apois usa o JIT para interpretar o código gerado para a Máquina.

Java não é só uma linguagem, é uma plataforma. Tem um código, as APIs, as especificações.

Para James Golsing, se puder tirar/descartar algo, ele diz que seria a linguarem Java, pois o que é o melhor da plataforma seria a JVM. Com ela, tudo é performática, roda bem, etc.

Com isso, surgiu compiladores para outras linguagens, para gerar bytecode e ai sim a JVM sabe ler e rodar bytecodes. Exemplos, jPython, jRuby, jPhp, Scala, etc

Use a linguagem certa par acada problema. Use Java, mas em determinado ponto pode usar outra linguagem mais adequada. Ex, usar Clojure, Scala, etc para tratar pontos de codificação em linguagem funcional.

Outro exemplo misturando linguagens. Fazer um formulário de validação em JavaScript antes de mandar para o Servidor (em Java). O problema dessa abordagem é que o usuário, pode desabilitar o JavaScript e passar por cima da validação. Para corrigir isso, teria que ter validadação do lado do servidor, o problema é códigos de validação duplicado (pg 17).

## JIT Compiler

Capítulo 2 (pág 21)

A JVM pega o programa e vai otimizando. Para tal o JIT atua nos **HotSpots** (número de chamadas de um método) para ir otimizando os códigos. Ou seja, ele começa lento, analiza e aprendendo as chamadas, otimiza e depois fica rápido (Diferente do C, que é linear). 

Normalmente, programas pequenos não são otimizados pelo JIT. Já programas que ficam em servidores, feito deploy, ou que rodam muito tempo, o JIT atua e otimiza. Se reinicar o servidor, ele mantem as otimizações aprendidas.

Exemplo de otimizaçao: juntar vários métodos e chamalos sequencialmente; mudar o for que faz um print, para imprimir diretamente os elmentos do array.

**Modo**
* server: habilita para 10.000 chamadas
* client: habilita para 5.000 chamadas
* se não chamar nada, quase sempre vai chamar em server.

*ergonomics*, foi implementado no Java5, para ele fazer a análise e atribuir os parâmetros para o JIT.

O que influência no JIT. "Boas práticas de programação". Ele está esperando que utilize pequenas classes, com poucos métodos, chamadas corretas. E não tudo um arquivão em uma linha só. O JIT vai trabalhar melhor nos códigos que usam as boas práticas.

time java -XX:CompileThreshold=1 -XX:+TieredCompilation -XX:+PrintCompilation Fibonacci 40

-XX:+PrintCompilation
* Mostrará os métodos que são otimizados pela JVM

-server e -client
* número invocações entre 10.000(server) e 1.500(client)

-XX:CompileThreshold=\<num>
* muda o modo de otimização para um valor espeifico de invocações desejadas 

-Xint
* desabilita totalmente o JIT


Otimizando mais o codigo C
```bash
gcc -O3 -o fibonacci_X fibonacci.c
```

```bash
gcc -m32 -mfpmath=sse -Ofast -flto -march=native -funroll-loops -o fibonacci_X fibonacci.c
```

YouTube JIT
- JVM JIT for dummies
- https://www.youtube.com/watch?v=0Yud4Q2HEz4
- https://www.youtube.com/watch?v=FnDHp3Qya6s

Para o **-Xms** e **-Xmx** é boa prática subir o servidor setando estes valores, evitando que o OS e JVM definam um valor por eles mesmos. Outra boa prática é suber tanto o -Xms e -Xmx com o MESMO valor.

### Garbage Collector

Primeiros momentos o algoritimo usado é *Mark and Sweep* (não mais utilizado hoje em dia). Enquanto rodava, parava a threads, parava o mundo (stop the world) 
* era lento
* trava o programa sempre que rodava
* deixava a memória fragmentada

Segundo momento, foi feito um estudo, chamado Hipótese das Gerações. Qdo rodava, 95% dos objetos eram eliminados. Mas faz sentido, pois a maioria dos objetos perdem a referência muito cedo. Uma var local, em um for, um if, etc, cria e inutiliza muito rápido.

Com isso, mudou a forma de liberar e como o gc funcionava. Chamou o algoritimo de *Generational Copying*. A idéia é copiar o que ainda está em uso (os 2% que não morre) para outra área e marcar o que foi copiado dizendo que pode ser reutilizado. Assim, não mais apagando e liberando os espaços, mas sim só indicando.

A JVM da Oracle, a JVM HotSpot, separa em 2 áreas grandes **Young** e **Old**, a idéia é copiar os objetos de Yong para Old, mas antes de fazer a cópia dos objetos ainda ativos(referenciados), eles são maturados, ou seja, ainda dentro da Young, ele cria 2 outras sub-áreas, S0 e S1, ao medida que vai fazendo as varreduras de gc, passa de Young para S0, em uma outra passada repassa de S0 para S1 e, no final, se o objeto ainda está ativo e possui referência então ai sim copia para Old (pois tem grande possibilidade de continuar ativo e não ser descartado). Pág 23.

O espaço da Young e Old fica no espaço chamado **Heap**. Existe outro espaço permanente chamado **PermGen**, no Java8 mudou para **MetaSpace** (pg 27).

* Young e Old: ficam os objetos do sistema
* PermGen: onde ficam as Classes, Strings, Internals

Ao analisar seu sistema, não é para o GC executar toda hora, ele deve rodar de vez enquando. Se esse for o caso, analisar o código (ex. pelo VisualVM outra ferramente de profiling) e analisar a parte do código onde está travando e consumindo muito.

De modo geral, não interferir no GC ou depender de seu comportamento é uma boa prática. (pg 33)

### Algoritimos
* Serial (tempo de parada maior, 5ms)
* Parallel (tempo 3ms)
* CMS (1ms)

Se não escolhar nada, normalmente a jvm pelo ergonomics vai escolher o algoritimo CMS. No java7, lança um novo algoritimo chamado *G1*, mas o padrão ainda fica como o CMS. A partir do Java8 ele já utiliza do G1 como padrão.

* G1
    * Completamente diferente, ele faz um Garbage First. Quebra toda a memória em uma matrix de vários quadrados/espaços (não usa mais a separação de Young e Old), e consegue descobrir uma região que mais tem objetos mortos, com isso ele consegue isolar só uma área para realizar a parada e efetuar o garbage colector nesta região, aumentando consideravelmente o desempenho. (pág. 29)

-XX:NewSize
* definir o tamanho da área do Young

-XX:NewRatio
* para definir a proporção do tamanho da memória heap do Young

```bash
java -verbose:gc EstressaGC
```

```bash
java -Xms100m -Xmx100m EstressaGC
```

```bash
java -verbose:gc -Xmx100M -Xms100M -XX:NewSize=80M EstressaGC
```

-XX:MaxMetaspaceSize=64m
* Limitar o tamanho do Metaspace no Java 8

App **VisualVM 1.3.8** [link](https://visualvm.java.net)

# Aula 2

## Classloader

Classloader, de maneira simplista, é uma classe que carrega classes para a memória.

É carregado no espaço PermGen.

pg 38

Existem 3 Classloaders principais do Java:
* Bootstrap
* Extension
* Application

Funciona em uma maneira de hierarquia. Toda vez que o Classloader vai carregar uma classe, ele pergunta ao classloader do pai se ELE consegue carregar, dessa forma, vai verificando na herança se os Classloaders do sistema consegue carregar uma classe específica. Assim, ele nunca vai carregar uma classe criada e sobrescrita pelo usuário que pertence ao sistema, criando assim um *mecanismo de segurança*.

### Classloader Hell (pg 41)
É possível criar seu próprio Classloader, basta herdar da classe Classloader. Mas não é uma boa prática. Dificilmente irá precisar fazer isso.

Nos servidores de aplicação (pg 40)
* Eles criam seu próprio Classloader
* Bibliotecas comuns - usadas por vários projetos e na mesma versão - usar o *Container classloader*
* Bibliotecas específicas, então usar o *WebApplication classloader*

Lembrar que as classes são carregadas por hierarquia. Logo, 

Exceções
* nesse contexto, dependendo das versões de libs que estão rodando no servidor e na sua aplicação, é possível ter situações estranhas (ex. pega alguns métodos de uma lib mais nova que esta no servidor e outros métodos de libs mais antiga que está no seu projeto).

* algumas possíveis exceções relacionadas a problemas de carregamento de libs:
    * ClassNotFoundException
    * NoSuchMethodError
    * ClassCastException

Um conceito que começaram a usar é de *Classloader Invertido*, onde na hierarquia o WebApplication herda diretamente da Bootstrap e tem uma referencia para o Container. A idéia é tentar dar prioridade as libs da aplicação. Contudo, essa prática não é recomendada, pode dar muitos problemas.

*Apache Xerces*
Ex. procurar por DOMParser (CTrl+T no Eclipse)
* org.apache. - para usar a versão 1
* org.sun.org.apache. - embutida no java, para versão 2

*JAXBContext*
* foi criado um diretório **endorsed** para ter prioridade no carregamento (pg 43). Pode ser passada pelo comando *-Djava.endorsed.dirs=*. No servidor de aplicação tem um diretório chamado endorsed, colocar as libs lá significa que o adm/programador endossa estas libs.

``` 
Acredita-se que uma Classe é igual quando tem o mesmo nome e mesmo pacote. Mas para o Java, também ele considera que a classe é igual se carregada no MESMO classloader. Ou seja, se mesmo o nome da classe for igual, mas carregada por classloader diferentes, então pode dar algum erro (ex. CastException)
```

Ao usar uma biblioteca que serializa um objeto e deserializa de volta para memória, verificar se não pode causar algum problema sobre erros de carregamento de classloader (ex. CastException). Pois ao serializar usa um classloader ao recarregar usa outro classloader.

OutOfMemoryError e Classloader
* É quase impossível uma aplicação Java conseguir evitar leaks de classloaders, por isso, em algum momento surgem os OutOfMemoryError frequentes nos hot deploys, sendo esse mais um motivo para evitá-los em produção.

## Design OO

### Encapsulamento

Não é questão de somente mudar os atributos para privado e gerar getter's e setter's.

```
Encapsular está mais para restringir e refletir a realidade em objetos, ou seja, respeitar as regras externas e incluir no objetos. Protegendo os atributos da classe evitando inconsistências no objeto.
```

Exemplo, em uma classe de Conta, existe o método sacar(), nele contempla suas regras em que momento pode ser feito um saque. Já o atributo saldo, não faz sentido criar um setSaldo(valor), visto que quebraria a regra que checa se a conta possui saldo e pode ser diminuida em caso positivo, causando uma inconsistêmcia.

Encapsulameno também tem haver com esconder os detalhes internos da classe. Por exemplo, na classe interna uso um List, e externamente (cliente) obtenho essa lista e uso um método da lista (.contains()); no futuro, se resolver alterar internamente alguma forma usada na classe, terá impacto externamente (p.ex. se alterar de List para Array, não terá mais o método .contains() usado externamente) - quebrando assim o encapsulamento - pois externamente está sabendo muito sobre o funcionamento da classe, deveria saber menos. Para resolver isso, basta esconder isso - encapsular - aquele funcionamento. Por exemplo, criando um novo método para tratar o que deseja e se no futuro precisar alterar, não irá causar efeito colateral, pois a alteração será somente interna a classe, externamente estrá usando o método criado. Como resultado, diminuindo o acoplamento entre as classes.

```
Um bom medidor, se mudar em um único ponto do código e não impactar externamente, significa que o código está bom. Agora, se tiver muito efeito colateral, então existe um grande acoplamento.
```

Outro ponto, a responsabilidade de execução deve ficar interna a classe, pois é ela que sabe seu domínio, como executar suas partes, seus detalhes internos. Exemplo, em uma classe Cafeteira, existem vários métodos internos, com os passos de como realizar a "criação" do café que devem ficam privados e expor uma classe que organiza a forma e os passos de como fazer o cafe (ex. fazerCafe()) que será exposto publicamente, pois quem sabe os passos de fazer o café é a própria classe, não o quem vai chamar externamente.

```
Esconda os comportamentos internos da classe e exponha os comportamentos. Garantindo a segurança dos atributos e validações e design da classe.
```

VER: [Lombok](https://projectlombok.org/)
* para gerar os getters e setters automaticamente, em tempo de compilação, a geração por anotações. A idéia é não ter que poluir o código com getters e setters e deixar menos verboso.

#### Histórico

Algumas das formas e motivos para utilizar formas de criação de código dessa forma (criações de getters, setters, etc) são resquicios da époco do **EJB2**. Ele acabava forçando a criação seguindo esse modelo, tentava facilitar o acesso a recursos do servidor (controle transacional, requisições, etc), parte de cliente/servidor, que escondia algumas implementações para facilitar a vida do usuário.
No EJB2, ele fazia um serviço que toda hora acessava o servidor para obter um dado. Existia muitos problemas de escalabilidade.

Como EJB2 era um problema e não tinha muio hardaware na época. Começou a utilizar um padrão chamado **DTO** (ou **VO**), com isso, faz o mapeamento do EJB para esse objeto de transferência de dados, agora só é feita uma chamada no servidor no servio EJB, e o dado é retornado para um DTO/VO. Agora para iterar nos dados é feito localmente.

A própria SUN na époco começou a sugerir um catálogo de padrões (livro *Core J2EE Patters*), o problema disso é que mata a orientação objetos, detona o encapsulamento, sem polimorfismo; O Modelo Anêmico (pg 67), parece um fantoche, quem controla a classe é a outra e não ela mesmo, regras em outra classe. Martin Fowler criticava muito esse modelo. Na época, esses problemas foram foram motivadores para o surgimento do **Springs**.

Martin Fowle, escreve um livro/catálogo *patterns of enterprise application architecture*, um padrão que era mais usado era o **Transactonal Script**, quase toda fábrica de software utilizada. Funciona assim, faz o código da Página => chama Controller => Service (regras de negócio) => DAO (lógica acesso BD) => Entity (mapeia as Entidades no BD). O problema desse modelo é que tem muitos problemas de OO, ex. todas as regras de negócio ficam no Service (200 milhões de linhas), não tem boas práticas de programação. Fácil para aplicar em projetos de CRUD (mas que ainda assim não muito complexos), só vai sentir em projetos depois de 3 a 5 anos, por ficarem grandes.

Outro modelo no livro é o **Domain Model**, mais difícil de encontrar, mais caro. Você terá diversas classes, para projetos que possuem muitas regras, validações, mais fácil de manter nestes tipos de projetos, fácil achar código. (pág 71).

### Herança

* Principal ponto: **reaproveitamento**
* Outro ponto: **polimorfismo**

Na classe DAO, normalmente os métodos costumam ser padronizados, salvar, pesquisar, apagar, etc. Com isso, muitos usam uma classe DAO Genérica (usando templates). Por normalmente o T é o que muda dessa classe, os métodos específicos, ai sim ficam na classe especializadas.

Dao.java
```java
class Dao<T> {
    public void salvar(T t){
        this.em.persist(t);
    }
}
```

ClienteDao.java (herança)
```java
class ClienteDao extends Dao<Cliente> {
    public List<Cliente> xpto() {
        //lógica método especifico do cliente dao
    }
}
```

O problema é que se existe alguma regra e no método pai esta implementado. Exemplo, uma regra que diz um usuário não pode ser excluido, mas no dao genérico existe a implentação do método excluir.

Uma forma de contornar isso, é sobrescrever o método colocando-o vazio. Mas isso faz com que fique sujo a classe específica.

Outra forma de contornar é usar **composicao** em vez de herança. A classe contém a outra (composição) em vez de ser a outra (herança). Mas vai ter que mapear os métodos que irá usar. Outro problema é que gera _acoplamento_.

ClienteDao.java (composição)
```java
class ClienteDao {
    private Dao<Cliente> dao;
}
```

Problema na classe Properties do Java
* tem o setProperties(String, String), mas também tem a put(Object, Object). Isso gera uma certa confusão devido o uso da herança do Map => HashMap

Outro problema é na HttpServelt da javax.servlet.http
* Ao criar um servlet e extends HttpServlet, quando for sobrescrever o init(), existe uma regra que é preciso lembrar de chamar o método init() do pai antes de executar suas regras do init. Isso quebra o encapsulamento, não existe nada automático, é necessário você saber que deve chamar inicialmente o init herdado do pai.
```java
class XptoServlet extends HttpServlet {
    public void init(ServletConfig config) {
        super.init(config); // se não chamar vai dar erro na inicialização do servidor de aplicação
    }
}
```

#### Transformar de Herança para Composição

HERANÇA
* neste caso, acaba herdando vários métodos do pai, que não deveriam ser utilizados, por exemplo o clear() do HashSet, ou seja, aumentando desnecessariamente a interface de uso (herdada pelo HashSet).

```java
package br.com.caelum.fj91.banco.modelo;

import java.util.Calendar;
import java.util.Collection;
import java.util.HashSet;

/**
 * Organiza as contas do banco por semestre de abertura
 */
public class Contas extends HashSet<Conta> {

	private int totalContasPrimeiroSemestre = 0;
	private int totalContasSegundoSemestre = 0;
	
	//@Override
	public boolean add(Conta conta) {
		int mes = conta.getDataAbertura().get(Calendar.MONTH);
		if (mes < 6) {
			totalContasPrimeiroSemestre++;
		} else {
			totalContasSegundoSemestre++;
		}
		
		return super.add(conta);
	}

	//@Override
	public boolean addAll(Collection<? extends Conta> c) {
		
		return super.addAll(c);
	}
	
	public int size() {
		return contas.size();
	}

	public int getTotalContasPrimeiroSemestre() {
		return totalContasPrimeiroSemestre;
	}
	
	public int getTotalContasSegundoSemestre() {
		return totalContasSegundoSemestre;
	}
	
}
```

COMPOSIÇÃO
* remover a herança
* criar atributo contas do tipo HashSet<Conta>
* chamar os métodos a partir deste atributo
* Assim, consegue reaproveitar o código, sem aumentar desnecessariamente a interfae de uso e de quebra, não precisar saber nada sobre a implmentação interna do HashSet.

```java
package br.com.caelum.fj91.banco.modelo;

import java.util.Calendar;
import java.util.Collection;
import java.util.HashSet;

/**
 * Organiza as contas do banco por semestre de abertura
 */
//public class Contas extends HashSet<Conta> {
public class Contas {

	private int totalContasPrimeiroSemestre = 0;
	private int totalContasSegundoSemestre = 0;
	
	HashSet<Conta> contas = new HashSet<Conta>();
	
	//@Override
	public boolean add(Conta conta) {
		int mes = conta.getDataAbertura().get(Calendar.MONTH);
		if (mes < 6) {
			totalContasPrimeiroSemestre++;
		} else {
			totalContasSegundoSemestre++;
		}
		
		//return super.add(conta);
		return contas.add(conta);
	}

	//@Override
	public boolean addAll(Collection<? extends Conta> c) {
		for (Conta conta : c) {
			int mes = conta.getDataAbertura().get(Calendar.MONTH);
			if (mes < 6) {
				totalContasPrimeiroSemestre++;
			} else {
				totalContasSegundoSemestre++;
			}
		}
		
		//return super.addAll(c);
		return contas.addAll(c);
	}
	
	public int size() {
		return contas.size();
	}

	public int getTotalContasPrimeiroSemestre() {
		return totalContasPrimeiroSemestre;
	}
	
	public int getTotalContasSegundoSemestre() {
		return totalContasSegundoSemestre;
	}
	
}
```
Utilizando:
```java
public static void main(String[] args) {
		
    // gera diversas contas diferentes
    Conta c1 = new Conta(123, new GregorianCalendar(2009, 1, 5));
    Conta c2 = new Conta(250, new GregorianCalendar(2009, 3, 10));
    Conta c3 = new Conta(327, new GregorianCalendar(2010, 5, 15));
    Conta c4 = new Conta(443, new GregorianCalendar(2010, 7, 17));
    Conta c5 = new Conta(533, new GregorianCalendar(2011, 9, 19));
    Conta c6 = new Conta(620, new GregorianCalendar(2011, 10, 22));
    Conta c7 = new Conta(793, new GregorianCalendar(2011, 11, 27));
    
    // armazena as contas
    Contas contas = new Contas();
    contas.addAll(Arrays.asList(c1, c2, c3, c4, c5, c6, c7));
    
    // testes
    System.out.println("Total de contas: " + contas.size());
    System.out.println("Contas do 1o semestre: " + contas.getTotalContasPrimeiroSemestre());
    System.out.println("Contas do 2o semestre: " + contas.getTotalContasSegundoSemestre());
}
```

Retorno:
```bash
Total de contas: 7
Contas do 1o semestre: 3
Contas do 2o semestre: 4
```

### Programar para Interfaces

As interfaces são mais seguras e com menos possibilidade de serem alteradas.

Também tem flexibilidade, pode trocar a instância por outra implmentação que também esteja ligada a interface. Consegue mudar a implmentação mexendo em um único ponto, sem gerar impactos de acoplamento.

Usar interfaces Java é um grand ebenefício nestes casos, pois interfaces não carregam nenhum detalhe de implmentação.

A *escolha da interface ideal* vai depender do que você quer permitir que o código invocador possa utilizar e realizar na referência retornada. Quanto menos específica, menor o acomplamento e mais possibilidades de diferentes implementações. Em contrapartida, o código cliente tem uma gama menor de métodos que podem ser invocados.