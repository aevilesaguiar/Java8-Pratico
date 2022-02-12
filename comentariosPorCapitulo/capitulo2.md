# Apontamento Capitulo 2

Arrays.asList é uma maneira simples de criar uma List Imutavel. Poderia ter sido criado uma nova ArrayList e adicionado cada um dos usuarios

## Um novo método em todas as coleções: forEach

Ele recebe um objeto do tipo java.util.function.Consumer que tem um único método, o accept. Ela é uma
nova interface do Java 8, assim como todo o pacte do java.util.function

**lambda no Java é uma maneira mais simples de implementar uma interface que só tem um único método.**
No nosso caso, a interface Consumer é uma boa candidata;
