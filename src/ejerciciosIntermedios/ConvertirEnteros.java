package ejerciciosIntermedios;

import ejerciciosBasicos.ListaNumeros;

import java.util.List;
import java.util.stream.Collectors;

public class ConvertirEnteros {
    public static void main (String[] args){
        List<Integer> numeros = ListaNumeros.obtenerNumerosAleatorios(20,20);

        List<Integer> numerosAlCuadrado = numeros.stream().map(n -> (n*n)).sorted().distinct().toList();

        System.out.println("Números: ");
        System.out.println(numeros);

        System.out.println("Números al cuadrado: ");
        System.out.println(numerosAlCuadrado);
    }
}
