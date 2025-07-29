package ejerciciosIntermedios;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ConcatenarStrings {
    public static void main (String[] args){
        List<String> palabras = new ArrayList<>(List.of("Maceta", "Persiana", "Carricoche", "Acuoso", "Zulo", "Abismo", "Losa"));

        String frase = palabras.stream().sorted().collect(Collectors.joining(", "));

        System.out.println(frase);
    }
}
