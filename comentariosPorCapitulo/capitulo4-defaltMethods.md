# Apontamento Capitulo 4 - Default Methods

## O método forEach na interface interable

Por exemplo, o método forEach que utilizamos está declarado dentro de
java.lang.Iterable, que é mãe de Collection, por sua vez mãe de List.

default void forEach(Consumer<? super T> action) {
Objects.requireNonNull(action);
for (T t : this) {
action.accept(t);
}
}

Pois é. Método com código dentro de interfaces! Algo que nunca esperaríamos

ser possível no Java. Esses métodos são chamados de default methods (na documen-
tação do beta pode ser também encontrado defender methods ou ainda extension

methods).

Como ArrayList implementa List, que é filha (indireta) de Iterable,
a ArrayList possui esse método, quer ela queira ou não. É por esse motivo que
podemos fazer:

usuarios.forEach(u -> System.out.println(u.getNome()));

Esse default method, o forEach, espera receber uma implementação da inter-
face funcional Consumer<T> que já vimosser uma dasinterfaces presentes no novo

pacote java.util.function do Java 8. Ela possui um único método abstrato, o
accept, que recebe o tipo parametrizado T e executa o que você achar interessante.

## Novo método em Collection: removeIf

A interface Collection ganhou novos métodos com implementação default. Vi-
mos o forEach. Um outro é o removeIf, que recebe um Predicate. O

Predicate é uma interface funcional que permite testar objetos de um determi-
nado tipo. Dado um Predicate, o removeIf vai remover todos os elementos
que devolverem true para esse predicado.

Quase sempre é vantajoso utilizar um lambda em vez de criar uma classe anô-
nima. Uma das restrições do lambda é que não podemos declarar atributos, isto é,

manter estado dentro dela. Essa situação não aparece com frequência, mas veremos
sim alguns casos em que o uso do lambda não será possível ou teria de envolver
atributos da classe externa.

Veremos outros métodos que entraram nas coleções. Por exemplo, Map ga-
nhou computeIfPresent, computeIfAbsent, getOrDefault e outros mé-
todos úteis que costumavam nos forçar a escrever um código bem comum.

## Herança múltipla?

Métodos defaults foram adicionados para permitir que interfaces evoluam sem
quebrar código existente. Essa é uma das frases mais repetidas na lista de discussão
da especificação.

Eles não foram criados para permitir alguma variação de herança múltipla ou
de mixins. Vale lembrar que há uma série de restrições para esses métodos. Em
especial, eles não podem acessar atributos de instância, até porque isso não existe
em interfaces! Em outras palavras, não há herança múltipla ou compartilhamento
de estado.
