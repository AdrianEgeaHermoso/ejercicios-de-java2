import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 * 
 * @author Adrián Egea Hermoso
 */
public class PruebaFicheros2 {
  public static void main(String[] args) {

    String nombreFichero = "precios.txt";

    try {
        
      BufferedReader br = new BufferedReader(new FileReader(nombreFichero));
      

      String linea = "";
      int numeroDeLineas = 0;
      double suma = 0;

      while (linea != null) {
        if (!linea.equals("")) {
          System.out.println(linea);
          numeroDeLineas++;

          suma += Double.parseDouble(linea);
          
        }

        linea = br.readLine();

      }

      br.close();

     
      System.out.println("La suma total es: " + suma);
      System.out.println("El precio medio es: " + suma / numeroDeLineas);

    } catch (FileNotFoundException e) {
      System.out.println("No se encuentra el fichero \"" + nombreFichero + "\"");
    } catch (IOException ioe) {
      System.out.println("Error al leer el fichero \"" + nombreFichero + "\"");
    }

  }
}
