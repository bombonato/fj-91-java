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

App **VisualVM 1.3.8** [link](https://visualvm.java.net)