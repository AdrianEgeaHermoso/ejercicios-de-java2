import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 * 
 * @author Adrián Egea Hermoso
 */
public class PruebaFicheros4 {
  public static void main(String[] args) {

    String nombreFichero = "aleatorios.txt";
        
      BufferedWriter bw;
    try {
        bw = new BufferedWriter(new FileWriter(nombreFichero));

        System.out.println("Mostrando numeros aleatorios: ");

        for (int i = 1; i < 11; i++) {
            bw.write((int)(Math.random() * 100) + "\n");
            }

       

        bw.close();

    } catch (IOException e) {
        System.out.println("Se ha producido un error al intentar escribir el fichero: " + nombreFichero);
        e.printStackTrace();
    }
      

    
  }
}
