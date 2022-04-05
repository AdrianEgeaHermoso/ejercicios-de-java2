import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 * 
 * @author Adrián Egea Hermoso
 */
public class PruebaFicheros {
  public static void main(String[] args) {

    try {
      BufferedReader br = new BufferedReader(new FileReader("malaga.txt"));
      System.out.println("");
      System.out.println("Contenido del fichero: \"malaga.txt\"");
      System.out.println("------------------------------------");

      String linea = "";
      int numeroDeLineas = 1;

      while (linea != null) {
        if (!linea.equals("")) {
          System.out.println(numeroDeLineas + ": " + linea);
          numeroDeLineas++;
        }

        linea = br.readLine();

      }

      br.close();

      System.out.println("El fichero contiene " + (numeroDeLineas - 1) + " lineas");

    } catch (FileNotFoundException e) {
      System.out.println("No se encuentra el fichero \"malaga.txt\"");
    } catch (IOException ioe) {
      System.out.println("Error al leer el fichero \"malaga.txt\"");
    }

  }
}
