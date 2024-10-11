package ejercicio1;

public class Main1 {
	public static void main(String[] args) {
        Articulo articulo1 = new Articulo("Laptop", 999.99, 10);

        articulo1.mostrarArticulo();
        articulo1.setNombre("MacBook Pro");
        articulo1.setPrecio(1299.99);
        articulo1.setStock(15);
        articulo1.mostrarArticulo();
    }
}


