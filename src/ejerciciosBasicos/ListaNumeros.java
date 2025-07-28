package ejerciciosBasicos;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class ListaNumeros {
    public static void main(String[] args) {
        ArrayList<Integer> listaNumeros = obtenerNumerosAleatorios(30, 1000);

        ArrayList<Integer> numerosPares = listaNumeros.stream()
                .filter(n -> n%2 == 0)
                .collect(Collectors.toCollection(ArrayList::new));

        numerosPares.forEach(System.out::println);
    }

    public static ArrayList<Integer> obtenerNumerosAleatorios(int nNum, int nMax) {
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        int i = nNum;
        while (i > 0){
            listaNumeros.add((int) ((Math.random() * nMax) + 1));
            i--;
        }
        return listaNumeros;
    }
}
