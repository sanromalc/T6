
package tarea6edclase;

public class Tarea6EDClase {

    public static void main (String[] args) {
        Tarea6EDClase miCarrito = new Tarea6EDClase();
        
        miCarrito.aplicarDescuento(100, 5);
    }
            public static final double DESCUENTO1 = 0.8; //descuento menor
            public static final double DESCUENTO2 = 0.95;//descuento mayor
            public static final int DESCUENTO3 = 5;//descuento por cantidad
            
    public static void aplicarDescuento(double precioProducto, int numProductos) {
    double total;

        if (numProductos > 3) {
            precioProducto -= DESCUENTO3;
    }

        total = calcularTotal(precioProducto, numProductos);
    
        System.out.println("El total a pagar es: " + total);
        System.out.println("Enviado");
    }

    private static double calcularTotal(double precioProducto, int numProductos) {
    double total;

    if (numProductos != 0) {
        total = precioProducto * DESCUENTO1;
    } else {
        total = precioProducto * DESCUENTO2;
    }
    return total;
    
    }
    
}
