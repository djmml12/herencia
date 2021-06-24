package carros;


public class ArregloCarro {
    private Carro vehiculos[];
    
   
    public ArregloCarro(){
        vehiculos = new Carro[20];
        veh(vehiculos);
    }
    
    
    public void veh(Carro carros[]){
        for (int i = 0; i < vehiculos.length; i++) {
            int x;
            x = (int)(Math.random() * (1 + 3));
            
            if (x == 1) {
                Camioneta c2 = new Camioneta("", 0, 0, 0, 0, true);
                System.out.println(c2);
            }
            
            else if (x == 2) {
                Deportivo d2 = new Deportivo("", 0, 0, 0, 0, true);
                System.out.println(d2);
            }
            
            else if (x == 3) {
                Camion cm2 = new Camion("", 0, 0, 0, 0, true);
                System.out.println(cm2);
            }

            System.out.print("\n");

        }
   
    }

    
}
