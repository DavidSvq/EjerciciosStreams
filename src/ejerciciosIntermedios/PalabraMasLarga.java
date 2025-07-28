package ejerciciosIntermedios;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PalabraMasLarga {
    public static void main (String [] args){
        List<String> palabras = new ArrayList<>(List.of("Maceta", "Persiana", "Carricoche", "Acuoso", "Zulo", "Abismo", "Losa"));


        String palabraMasLarga = palabras.stream().max(Comparator.comparingInt(String::length))
                .orElse("Lista vacia.");

        System.out.println("La palabra mas larga es " + palabraMasLarga);

        String palabraMasCorta = palabras.stream().min(Comparator.comparingInt(String::length))
                .orElse("Lista vacia.");

        System.out.println("La palabra más corta es " + palabraMasCorta);
    }
}
