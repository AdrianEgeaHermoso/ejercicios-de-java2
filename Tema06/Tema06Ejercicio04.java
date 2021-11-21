/**
 * 
 *
 *  @author Adrián Egea Hermoso
 */
public class Tema06Ejercicio04 {
  public static void main(String[] args) {
    System.out.println("Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados por espacios.");
    
    int n = 0;

    for (int i = 1; i <= 20; i++) {
      n = (int)(Math.random() * 11);
      System.out.print(n + "  ");
    }
    
  }
}
