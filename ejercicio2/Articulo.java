package ejercicio2;

public class Articulo {
	 private String nombre;
	    private double precio;
	    private int stock;

	    public Articulo(String nombre, double precio, int stock) {
	        this.nombre = nombre;
	        this.precio = precio;
	        this.stock = stock;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public double getPrecio() {
	        return precio;
	    }

	    public void setPrecio(double precio) {
	        if (precio > 0) {
	            this.precio = precio;
	        } else {
	            System.out.println("Precio inválido, debe ser mayor que cero");
	        }
	    }

	    public int getStock() {
	        return stock;
	    }

	    public void setStock(int stock) {
	        if (stock >= 0) {
	            this.stock = stock;
	        } else {
	            System.out.println("Cantidad inválida, debe ser mayor o igual a cero");
	        }
	    }

	    public void mostrarArticulo() {
	        System.out.println("Nombre: " + nombre);
	        System.out.println("Precio: " + precio);
	        System.out.println("Stock disponible: " + stock);
	    }
}
