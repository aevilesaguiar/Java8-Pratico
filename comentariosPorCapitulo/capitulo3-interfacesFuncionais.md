# Apontamento Capitulo 3 - Interfaces Funcionais

A interface Consumer tem apenas um único método abstrato, o accept, é por isso que quando faço forEach
o compilador sabe exatamente qual método usar no corpo do meu lambda;

Podemos dizer então que toda interface do Java que possui apenas um método abstrato pode
ser instanciada como um código lambda!
Isso vale até mesmo para as interfaces antigas, pré-Java 8, como por exemplo o
Runnable;

Apenas um lembrete: por padrão, todos os métodos de uma interface no Java
são públicos e abstratos.

A interface Runnable tem apenas um único método abstrato. Uma interface
que se enquadre nesse requisito é agora conhecida como uma interface funcional!
Ela sempre pode ser instanciada através de uma expressão lambda.

The Statement interface(nterface Statement)-> fornece métodos para executar consultas com o banco de dados. A interface de instrução é uma fábrica de ResultSet, ou seja, fornece o método de fábrica para obter o objeto de ResultSet.

Pacote java.util.function -> As interfaces funcionais fornecem tipos de destino para expressões lambda e referências de método.

[pacote:java.util.function](https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html)

## Outros exemplos : Listeners

Um outro uso bem natural de classe anônima é quando precisamos adicionar uma ação no click de um objeto do tipo java.awt.Button. Para isso, precisamos implementar um ActionListener.
Usamos a interface ActionListener como nada mais do que uma função de retorno, e pela sua estrutura de um único método ela se enquadra no requisito de interface funcional.

## A anotação @FuntionalInterface

Podemos marcar uma interface como funcional explicitamente, para que o fato de
ela ser uma interface funcional não seja pela simples coincidência de ter um único
método. Para fazer isso, usamos a anotação @FuncionalInterface:

Essa anotação serve apenas para que ninguém torne aquela interface em não-funcional acidentalmente. Ela é opcional justamente para que as interfaces das antigas bibliotecas possam também ser tratadas como lambdas, independente da anotação, bastando a existência de um único método abstrato.

## Indo mais a Fundo: Primeiros Detalhes

Interfaces funcionais são o coração do recurso de Lambda. O Lambda por si só não existe, e sim expressões lambda, quando atribuídas/inferidas a uma interface funcional. Durante o desenvolvimento do Java 8, o grupo que tocou o Lambda chamava essas interfaces de SAM Types (Single Abstract Method);

Se uma interface funcional não está envolvida, o compilador não consegue trabalhar com ela;
