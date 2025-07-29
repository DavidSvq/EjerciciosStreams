package ejerciciosAvanzados;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;

public class ContarAparicionPalabras {
    public static void main (String [] args){
        List<String> palabras = new ArrayList<>(List.of("Maceta", "Persiana", "Carricoche", "Acuoso", "Zulo", "Abismo", "Losa", "Maceta", "Persiana", "Carricoche", "Acuoso", "Persiana", "Carricoche", "Acuoso"));

        Map<String, Long> vecesPalabra = palabras.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()));

        System.out.println("Número de veces que se repite cada palabra: ");
        vecesPalabra.forEach((palabra, veces) ->
                System.out.println(palabra + ": " + veces));
    }
}
