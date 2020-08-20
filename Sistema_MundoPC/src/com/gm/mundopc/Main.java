package com.gm.mundopc;

import com.gm.mundopc.domain.*;

public class Main {

    public static void main(String[] args) {
	    Raton mouseGenius = new Raton("USB 2.0", "Genius");
	    Raton mouseNova = new Raton("USB 3.0","Nova");
	    Raton mouseMicrosoft = new Raton("PCI", "Microsoft");
	    Teclado tecladoGenius = new Teclado("USB", "Genius");
	    Teclado tecladoHP = new Teclado("PCI","Hewlett Packard");
        Monitor monitorLG = new Monitor("LG",29);
        Monitor monitorSamsung = new Monitor("Samsung",32);
        Computadora computadora1 = new Computadora("PC Gamer", monitorSamsung, tecladoGenius, mouseNova);
        Computadora computadora2 = new Computadora("PC Art Design", monitorLG, tecladoHP, mouseGenius);
        Orden orden1 = new Orden();

        orden1.agregarComputadora(computadora1);
        orden1.agregarComputadora(computadora2);
        orden1.mostrarOrden();
    }
}
