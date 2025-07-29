/**
 * Convertir strings a mayúsculas
 *     Dada una lista de strings, convierte todos los elementos a mayúsculas usando map.
 */


package ejerciciosBasicos;

import java.util.ArrayList;
import java.util.List;

public class ConvertirEnMayusculas {
     public static void main (String[] args){
         List<String> palabras = new ArrayList<>(List.of("Maceta", "Persiana", "Carricoche", "Acuoso"));

         palabras.stream().map(p -> p.toUpperCase()).forEach(System.out::println);
     }



}
