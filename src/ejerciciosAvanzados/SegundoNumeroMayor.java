package ejerciciosAvanzados;

import ejerciciosBasicos.ListaNumeros;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SegundoNumeroMayor {
    public static void main (String[] args){
        List<Integer> numeros = ListaNumeros.obtenerNumerosAleatorios(20, 1000);
        System.out.println("Lista de números: ");
        numeros.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        //Optional<Integer> n = numeros.stream().max(Comparator.comparingInt(Integer::intValue));
        Optional<Integer> n = numeros.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println("El segundo número mayor es " + n.get());

    }
}
