import java.util.ArrayList;

public class Ejercicio08 {
    public static void main(String[] args) {
        
        ArrayList<Carta> cartas = new ArrayList<Carta>();

       for (int i = 0; i < 10; i++) {

        cartas.add(new Carta("",""));
           
       }

       System.out.println(cartas);



    }
}
