package ejerciciosBasicos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContarStringMayorDeCinco {
    public static void main (String [] args){
        List<String> palabras = Arrays.asList("Cinco", "Grandioso", "Oso","Aldenao", "Faro", "Longitud");

        Long cantidad = palabras.stream()
                .filter(palabra ->palabra.length() > 5)
                .count();

        System.out.println("Palabras con más de 5 caracteres de longitud: " + cantidad);
    }
}
