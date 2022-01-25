package gaby.vendingmachine;

import java.math.BigDecimal;
import javax.swing.JOptionPane;

public class SistemaDinero {

    private boolean devolucion = true;

    //Para poder dividir el pago entre parte entera y parte decimal
    //Ej: 20.35€==> 20(Parte entera) .30(Parte decimal)
    private double parteEntera;
    private double parteDecimal;

    //Cantidad Billetes de 20 10 y 5 y sus contadores
    private int Bill20;
    private int Bill10;
    private int Bill5;

    private int ContadorBill20;
    private int ContadorBill10;
    private int ContardorBill5;

    //Cantidad Monedas de EUROs 2 y 1 y sus contadores
    private int moneda2;
    private int moneda1;

    private int ContadorMoneda2;
    private int ContadorMoneda1;

    //cantidad Monedas de CENTIMOS 0.5 0.2 0.1 0.05 0.02 y 0.01 y sus contadores
    private int moneda05;
    private int moneda02;
    private int moneda01;
    private int moneda005;
    private int moneda002;
    private int moneda001;

    private int ContadorMoneda05;
    private int ContadorMoneda02;
    private int ContadorMoneda01;
    private int ContadorMoneda005;
    private int ContadorMoneda002;
    private int ContadorMoneda001;

//Metodo que nos comprobara si hay cambio disponible:
    public double ComprobantePagoEfectivo(double pagado, double precioProducto) {

        if (pagado == precioProducto) {
                return 0.0;
          
        } else {
            parteDecimal = pagado % 1;
            parteEntera = pagado - parteDecimal;

            //Comprobamos parte decimal
            if (parteDecimal >= 0.5) {
                do {
                    parteDecimal = -0.5;
                    moneda05--;
                    ContadorMoneda05++;
                } while (parteDecimal >= 0.5);
            }

            if (parteDecimal >= 0.2) {
                do {
                    parteDecimal = -0.2;
                    moneda02--;
                    ContadorMoneda02++;
                } while (parteDecimal >= 0.2);
            }

            if (parteDecimal >= 0.1) {
                do {
                    parteDecimal = -0.1;
                    moneda01--;
                    ContadorMoneda01++;
                } while (parteDecimal >= 0.1);
            }

            if (parteDecimal >= 0.05) {
                do {
                    parteDecimal = -0.05;
                    moneda005--;
                    ContadorMoneda005++;
                } while (parteDecimal >= 0.05);
            }

            if (parteDecimal >= 0.02) {
                do {
                    parteDecimal = -0.02;
                    moneda002--;
                    ContadorMoneda002++;
                } while (parteDecimal >= 0.02);
            }

            if (parteDecimal >= 0.01) {
                do {
                    parteDecimal = -0.01;
                    moneda001--;
                    ContadorMoneda001++;
                } while (parteDecimal >= 0.01);
            }

            if (parteDecimal == 0) {
                
                //Comprobamos parte entera
                if (parteEntera >= 20) {
                    do {
                        parteEntera = -20;
                        Bill20--;
                        ContadorBill20++;
                    } while (parteEntera >= 20);
                }

                if (parteEntera >= 10) {
                    do {
                        parteEntera = -10;
                        Bill10--;
                        ContadorBill10++;
                    } while (parteEntera >= 10);
                }

                if (parteEntera >= 5) {
                    do {
                        parteEntera = -5;
                        Bill5--;
                        ContardorBill5++;
                    } while (parteEntera >= 5);
                }
            }else{
                devolucion=false;
            }

            

        }
    }

}
