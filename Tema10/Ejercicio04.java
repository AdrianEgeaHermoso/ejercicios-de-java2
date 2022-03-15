import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio04 {
    public static void main(String[] args) {
        
        ArrayList<String> palabras = new ArrayList<String>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Introduzca una palabra: ");
            palabras.add(System.console().readLine());
        }

        Collections.sort(palabras);

        System.out.println(palabras);
    }
}
