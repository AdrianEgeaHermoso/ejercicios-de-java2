import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio03 {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            System.out.println("Introduzca un número entero: ");
            numeros.add(Integer.parseInt(System.console().readLine()));
        }

        Collections.sort(numeros);

        System.out.println(numeros);

    }
}
