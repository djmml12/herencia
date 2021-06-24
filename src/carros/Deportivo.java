package carros;

import interfaces.Carrera;
import interfaces.movimiento;

public class Deportivo extends Vehiculo implements Movimiento, Carrera{
    Vehiculo v1 = new Vehiculo(nombre, galonesCombustible, pasajeros, velocidadMax, aceleracionBase, esDiesel);

    public Deportivo(String nombre, int galonesCombustible, int pasajeros, int velocidadMax, double aceleracionBase, boolean esDiesel) {
        super("", 8, 2, 160, 50, esDiesel);
        tipoGasolina();
        datos();
        moverDerecha();
        moverIzquierda();
        turbo();
        tripleVelocidad();
    }
    
    public void datos(){
        System.out.println("deportivo");
        System.out.println("combustible: " + galonesCombustible + ", pasajeros: " + pasajeros + ", velocidad: " + velocidadMax + ", aceleracion: " + aceleracionBase);
    }

    @Override
    public void tipoGasolina(){
        if (esDiesel) {
            System.out.println(" consume gasolina ");
        }
    }
    
    @Override
    public void moverDerecha() {
        System.out.println(" giro a la derecha ");
    }

    @Override
    public void moverIzquierda() {
        System.out.println(" giro a la izquierda ");
    }

    @Override
    public void turbo() {
        System.out.println(" activa el turbo ");
    }

    @Override
    public void tripleVelocidad() {
        v1.setVelocidadMax(velocidadMax*3);
        System.out.println(" triplica la velocidad " + v1);
    }

}
