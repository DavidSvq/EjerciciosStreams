package ejerciciosBasicos;

import java.util.ArrayList;
import java.util.List;

public class PalabrasOrdenadas {
    public static void main (String [] args){
        List<String> palabras = new ArrayList<>(List.of("Maceta", "Persiana", "Carricoche", "Acuoso", "Zulo", "Abismo", "Losa"));
        System.out.println("Palabras sin ordenar: ");
        palabras.forEach(System.out::println);

        System.out.println("Palabras ordenadas: ");
        palabras.stream().sorted().forEach(System.out::println);
    }
}
