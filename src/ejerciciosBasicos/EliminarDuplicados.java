package ejerciciosBasicos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EliminarDuplicados {
    public static void main (String[] args){
    ArrayList<Integer> nDupli = ListaNumeros.obtenerNumerosAleatorios(100, 15);
    System.out.println("Lista de números original: ");
    nDupli.forEach(System.out::println);

    System.out.println("Lista de números sin repetir y ordenados: ");
    //nDupli.stream().distinct().forEach(System.out::println);
        List<Integer> nSimp = nDupli.stream().distinct().collect(Collectors.toList());
    nSimp.stream().sorted().forEach(System.out::println);
    }
}
