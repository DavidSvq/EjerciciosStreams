package ejerciciosAvanzados;

import ejerciciosBasicos.ListaNumeros;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SeparaParesImpares {
    public static void main (String [] args){
        List<Integer> numeros = ListaNumeros.obtenerNumerosAleatorios(30,500);

        Map<Boolean,List<Integer>> paresImpares = numeros.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        for (Map.Entry<Boolean, List<Integer>> pI : paresImpares.entrySet()){
            if (pI.getKey()){
                System.out.println("Números pares: ");
                System.out.println(pI.getValue());
            }
            else{
                System.out.println("Números impares: ");
                System.out.println(pI.getValue());
            }

        }
    }
}
