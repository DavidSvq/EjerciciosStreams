package ejerciciosBasicos;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class ListaNumeros {
    public static void main(String[] args) {
        ArrayList<Integer> listaNumeros = obtenerNumerosAleatorios();

        ArrayList<Integer> numerosPares = listaNumeros.stream()
                .filter(n -> n%2 == 0)
                .collect(Collectors.toCollection(ArrayList::new));

        numerosPares.forEach(System.out::println);
    }

    private static ArrayList<Integer> obtenerNumerosAleatorios() {
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        int i = 30;
        while (i > 0){
            listaNumeros.add((int) (Math.random() * 1000));
            i--;
        }
        return listaNumeros;
    }
}
