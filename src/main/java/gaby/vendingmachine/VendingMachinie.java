package gaby.vendingmachine;

import java.util.UUID;

public class VendingMachinie {

    private UUID identificador;
    private int numBandejas;
    private PantallaTactil pantallaTactil;
    private Contenedor contenedor;
    private SistemaDinero sistemaDinero;

    public VendingMachinie(Bandejas bandejas, PantallaTactil pantallaTactil, Contenedor contenedor, SistemaDinero sistemaDinero) {
        this.identificador = identificador;
        this.bandejas = bandejas;
        this.pantallaTactil = pantallaTactil;
        this.contenedor = contenedor;
        this.sistemaDinero = sistemaDinero;
    }

}
