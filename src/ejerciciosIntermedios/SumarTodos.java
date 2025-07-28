package ejerciciosIntermedios;

import ejerciciosBasicos.ListaNumeros;

import java.util.ArrayList;

public class SumarTodos {
    public static void main (String [] args){
        ArrayList<Integer> num = ListaNumeros.obtenerNumerosAleatorios(10, 50);

        int sum = num.stream().mapToInt(Integer::intValue).sum();

        System.out.println("Lista de números: ");
        num.forEach(System.out::println);

        System.out.println("La suma es " + sum);

    }
}
