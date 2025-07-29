package ejerciciosIntermedios;

import java.util.ArrayList;
import java.util.List;

public class FiltrarContar {
    public static void main (String[] args){
        List<String> palabras = new ArrayList<>(List.of("Maceta", "Persiana", "Carricoche", "Acuoso", "Zulo", "Abismo", "Losa"));

        long nP = palabras.stream().filter(p -> p.startsWith("A")).count();

        System.out.println("Números de palabras que empiezan por A son " + nP);
    }
}
