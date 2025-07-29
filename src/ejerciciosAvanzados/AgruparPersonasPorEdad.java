package ejerciciosAvanzados;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AgruparPersonasPorEdad {

    public static class Persona{
        private String nombre;
        private int edad;

        public Persona() {
        }

        public Persona(String nombre, int edad) {
            this.edad = edad;
            this.nombre = nombre;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        @Override
        public String toString() {
            return "Persona{" +
                    "nombre='" + nombre + '\'' +
                    ", edad=" + edad +
                    '}';
        }
    }
    public static void main (String [] args){
        List<Persona> lP = new ArrayList<>();
        Persona p = new Persona("David", 30);
        lP.add(p);
        Persona p1 = new Persona("Maria", 20);
        lP.add(p1);
        Persona p2 = new Persona("Sonia", 30);
        lP.add(p2);
        Persona p3 = new Persona("Marco", 50);
        lP.add(p3);
        Persona p4 = new Persona("Lorena", 30);
        lP.add(p4);

        Map<Integer,List<Persona>> personasPorEdad = lP.stream().collect(Collectors.groupingBy(Persona::getEdad));

        personasPorEdad.entrySet().stream().forEach(entry ->
                System.out.println("Edad: " + entry.getKey()
                + " nombres: " + entry.getValue().stream()
                        .map(Persona::getNombre).collect(Collectors.joining(", "))));

    }
}
