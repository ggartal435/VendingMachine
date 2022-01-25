package gaby.vendingmachine;

import java.util.InputMismatchException;
import javax.swing.JOptionPane;

public class Bandejas {
//    Cada uno de los rotulos donde se puede almacenar un producto.
//    ha de tener los siguientes atributos:
//    Codigo producto,Nombre producto, Precio producto y Cantidad producto.

    private int codigoBandeja;
    private String nombreProducto;
    private double precioPoducto;
    private int cantidadProducto;


    public Bandejas(int codigoBandeja, String nombreProducto, double precioPoducto, int cantidadProducto) {
        this.nombreProducto = nombreProducto = JOptionPane.showInputDialog("Introduzca Nombre producto:");
        this.precioPoducto = PedirPrecio(precioPoducto);
        this.cantidadProducto = PedirCantidad(cantidadProducto);
    }

    private double PedirPrecio(double precioPoducto) {
        double precio = 0;
        boolean validarPrecio = true;

        do {
            try {
                precio = Double.parseDouble(JOptionPane.showInputDialog("Intruduzca precio unitario del producto:"));
                validarPrecio = false;
            } catch (InputMismatchException IME) {
                JOptionPane.showConfirmDialog(null, "Introduzca PRECIO UNITARIO PRODUCTO con el formato $$$$.$$");
                validarPrecio = true;
            }
        } while (validarPrecio);

        return precio;
    }

    private int PedirCantidad(int cantidadProducto) {
        int cantidad = 0;
        boolean validarCantidad = true;

        do {
            try {
                do {                    
                    cantidad = Math.abs(Integer.parseInt(JOptionPane.showInputDialog("Introduzca cantidad de articulos(MAX=15)")));
                } while (cantidad>15);
                
                validarCantidad = false;
            } catch (InputMismatchException IME) {
                JOptionPane.showConfirmDialog(null, "Introduzca la CANTIDAD de PRODUCTO en formato NUMERERICO");
                validarCantidad = true;
            }
        } while (validarCantidad);

        return cantidad;
    }
    
    
}
