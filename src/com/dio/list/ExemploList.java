package com.dio.list;

import java.util.*;

class ExemploList {
    public static void main(String[] args) {
        // Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

//      List notas = new ArrayList(); // antes do java 5
//      ArrayList<Double> notas = new ArrayList<>();
//      List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        /*List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(10d);
        System.out.println(notas);*/
        /*List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(1d);
        notas.remove(5d);
        System.out.println(notas);*/

        System.out.println("Crie uma lista e adicione as sete notas: ");

        List<Double> notas = new ArrayList<>();

        notas.add(7D);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5D);
        notas.add(7D);
        notas.add(0D);
        notas.add(3.6);

        System.out.println(notas.toString());

        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5D));


        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");

        notas.add(4, 8.0D);

        System.out.println(notas);

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");

        notas.set(notas.indexOf(5D), 6.0);

        System.out.println(notas.toString());

        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5.0D));

        System.out.println("Exiba todas as notas na ordem em que foram informados: ");

        for (Double nota: notas) System.out.println(nota);

//        System.out.println("Exiba a terceira nota adicionada");
//
//        System.out.println("Exiba a menor nota: ");
//
//        System.out.println("Exiba a maior nota: ");
//
//
//        System.out.println("Exiba a soma dos valores: ");
//
//        System.out.println("Exiba a média das notas: ");
//
//        System.out.println("Remova a nota 0: ");
//
//        System.out.println("Remova a nota da posição 0");
//
//        System.out.println("Remova as notas menores que 7 e exiba a lista: ");

//        System.out.println("Apague toda a lista");
//
//        System.out.println("Confira se a lista está vazia: ");

        /*
        Para você: Resolva esses exercícios utilizando os métodos da implementação LinkedList:
        System.out.println("Crie uma lista chamada notas2 " +
                "e coloque todos os elementos da list Arraylist nessa nova lista: ");
        System.out.println("Mostre a primeira nota da nova lista sem removê-lo: ");
        System.out.println("Mostre a primeira nota da nova lista removendo-o: ");
*/

    }
}
