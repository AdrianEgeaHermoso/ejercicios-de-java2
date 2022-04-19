import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 * 
 * @author Adrián Egea Hermoso
 */
public class PruebaFicheros3 {
  public static void main(String[] args) {

    String nombreFichero = "colores.txt";
        
      BufferedWriter bw;
    try {
        bw = new BufferedWriter(new FileWriter(nombreFichero));

        System.out.println("Escribiendo datos en el fichero: ");

        bw.write("rojo\n");
        bw.write("azul\n");
        bw.write("negro\n");
        bw.write("verde\n");
        bw.write("amarillo\n");

        bw.close();

    } catch (IOException e) {
        System.out.println("Se ha producido un error al intentar escribir el fichero: " + nombreFichero);
        e.printStackTrace();
    }
      

    
  }
}
