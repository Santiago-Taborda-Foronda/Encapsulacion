package ejercicio2;
import java.util.ArrayList;

import javax.swing.JOptionPane;
public class Inventario {
	public static void main(String[] args) {
        ArrayList<Articulo> catalogoArticulos = new ArrayList<>();

        catalogoArticulos.add(new Articulo("Computador", 999.99, 10));
        catalogoArticulos.add(new Articulo("Celular", 599.99, 25));
        catalogoArticulos.add(new Articulo("Audifonos", 79.99, 50));
        catalogoArticulos.add(new Articulo("Teclado ", 129.99, 15));

        for (Articulo art : catalogoArticulos) {
            art.mostrarArticulo();
            System.out.println("---------------");
        }

        catalogoArticulos.get(2).setPrecio(89.99);

        catalogoArticulos.remove(3);

        System.out.println("\n>>>>>>Catálogo actualizado<<<<<");
        for (Articulo art : catalogoArticulos) {
            art.mostrarArticulo();
            System.out.println("---------------");
        }

        System.out.println("\n <<<< Búsqueda de artículo >>>>");
        String nombreBusqueda = JOptionPane.showInputDialog("Ingrese el nombre del artículo");

        for (Articulo art : catalogoArticulos) {
            if (art.getNombre().equalsIgnoreCase(nombreBusqueda)) {
                System.out.println("\nArtículo encontrado:");
                art.mostrarArticulo();
                return; 
            }
        }

        System.out.println("Artículo no encontrado");
    }
}
