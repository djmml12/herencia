package carros;

import interfaces.Movimiento;
import interfaces.Transporte;

public class Camion extends Vehiculo implements Transporte, Novimiento{

    public Camion(String nombre, int galonesCombustible, int pasajeros, int velocidadMax, double aceleracionBase, boolean esDiesel) {
        super("", 15, 2, 60, 35, esDiesel);
        datos();
        tipoGasolina();
        transportar();
        moverDerecha();
        moverIzquierda();
    }
    
    public void datos(){
        System.out.println("camión");
        System.out.println(" combustible: " + galonesCombustible + ", pasajeros: " + pasajeros + ", velocidad: " + velocidadMax + ", aceleracion: " + aceleracionBase);
    }

    @Override
    public void tipoGasolina(){
        if (esDiesel) {
            System.out.println("consume gasolina");
        }
    }
    
    @Override
    public void transportar() {
        System.out.println(" transporte de material ");
    }

    @Override
    public void moverDerecha() {
        System.out.println(" gira a la derecha ");
    }

    @Override
    public void moverIzquierda() {
        System.out.println(" gira a la izquierda ");
    }
    
}
