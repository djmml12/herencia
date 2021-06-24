package carros;

import interfaces.Movimiento;
import interfaces.Transporte;

public class Camioneta extends Vehiculo implements Transporte, Movimiento{

    public Camioneta(String nombre, int galonesCombustible, int pasajeros, int velocidadMax, double aceleracionBase, boolean esDiesel) {
        super("", 14, 40, 50, 35, true);
        transportar();
        tipoGasolina();
        datos();
        moverDerecha();
        moverIzquierda();
    }

    @Override
    public void transportar() {
        System.out.println("camioneta");
        System.out.println("transporte de personas");
    }
    
    @Override
    public void tipoGasolina(){
        if (esDiesel == true) {
            System.out.println("consume diesel");
        }
    }
    
    public void datos(){
        System.out.println("combustible: " + galonesCombustible + ", pasajeros: " + pasajeros + ", velocidad: " + velocidadMax + ", aceleracion: " + aceleracionBase);
    }

    @Override
    public void moverDerecha() {
        System.out.println("giro a la derecha");
    }

    @Override
    public void moverIzquierda() {
        System.out.println("giro a la izquierda"); 
    }
}