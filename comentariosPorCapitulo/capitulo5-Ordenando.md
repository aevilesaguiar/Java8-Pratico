# Apontamento Capitulo 5 - Ordenando no Java

## Comparators como Lambda

Se uma classe implementa Comparable, podemos passar uma lista de instân-
cias dessa classe para o Collections.sort. Esse não é o caso de nossa classe

Usuario. Como é bem sabido, precisamos de um Comparator<Usuario>.

Comparator é uma interface funcional, com apenas um método abstrato. 
Podemos tirar proveito do lambda e reescrever a instanciação daquela classe anônima de maneira mais simples:

## Os cuidados com Comparators

Atenção! Para deixar o código maissucinto, não nos precavemos aqui
de possíveis usuários com atributo nome igual a null. Mesmo sendo
uma invariante do seu sistema, é importante sempre checar esses casos
particulares e definir se um usuário com nome nulo iria para o começo
ou fim nesse critério de comparação.

Há também a boa prática de utilizar comparators que já existem, como o
String.CASE_INSENSITIVE_ORDER. Seu código ficaria return
String.CASE_INSENSITIVE_ORDER.compare(u1.getNome(),
u2.getNome() ou ainda algum dos java.text.Collactors, junto
com as verificações de valores nulo.

## Metodo List.sort

Podemos ordenar uma lista de usuários de forma ainda mais sucinta:

usuarios.sort((u1, u2) -> u1.getNome().compareTo(u2.getNome()));

Isso finalmente é possível pois existe um novo método default sort decla-
rado na interface List, que simplesmente delega a invocação para o já conhecido

Collections.sort:

