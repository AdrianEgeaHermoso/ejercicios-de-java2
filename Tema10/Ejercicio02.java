import java.util.ArrayList;

public class Ejercicio02 {
    public static void main(String[] args) {

        int suma = 0;
        int minimo = 100;
        int maximo = 0;
        int longitudArrayList = (int) (Math.random() * 11 + 10);

        ArrayList<Integer> valores = new ArrayList<Integer>();

        for (int i = 0; i < longitudArrayList ; i++) {
            valores.add((int) (Math.random() * 101));
        }

        System.out.println(valores);

        for (int n : valores) {
            suma += n;
        }

        int media = suma / longitudArrayList;

        
        System.out.println("La suma de los valores es: " + suma);
        System.out.println("La media de los valores es: " + media);

        for (int n : valores) {

            if(n < minimo) {
                minimo = n;
              }

              if(n > maximo) {
                maximo = n;
              }


        }

        System.out.println("El minimo es " + minimo + " y el máximo es " + maximo);

    }

}
