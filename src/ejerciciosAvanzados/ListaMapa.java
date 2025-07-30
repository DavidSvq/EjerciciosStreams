package ejerciciosAvanzados;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListaMapa {

    public static class Producto {
        private int id;
        private String nombre;

        public Producto(int id, String nombre) {
            this.id = id;
            this.nombre = nombre;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        @Override
        public String toString() {
            return "Producto{" +
                    "id=" + id +
                    ", nombre='" + nombre + '\'' +
                    '}';
        }
    }
    public static void main (String [] args){
        Producto p = new Producto(1, "p1");
        Producto p1 = new Producto(2, "p2");
        Producto p2 = new Producto(3, "p3");
        Producto p3 = new Producto(4, "p14");
        Producto p4 = new Producto(5, "p15");
        Producto p5 = new Producto(6, "p16");
        Producto p6 = new Producto(7, "p17");
        Producto p7 = new Producto(8, "p18");

        List<Producto> productos = new ArrayList<>();

        productos.add(p);
        productos.add(p1);
        productos.add(p2);
        productos.add(p3);
        productos.add(p4);
        productos.add(p5);
        productos.add(p6);
        productos.add(p7);

        Map<Integer, String> productoMapeado = productos.stream()
                .collect(Collectors.toMap(Producto::getId, Producto::getNombre));

        for (Map.Entry<Integer, String> ps: productoMapeado.entrySet()){
            System.out.println("Id : " + ps.getKey() + " Nombre: " + ps.getValue());
        }

    }
}
