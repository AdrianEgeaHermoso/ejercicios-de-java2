/**
 * 
 *
 *  @author Adrián Egea Hermoso
 */
public class Tema06Ejercicio12 {
  public static void main(String[] args) {
    System.out.println("Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix) con el código ascii entre el 32 y el 126. Puedes hacer casting con (char) para convertir un entero en un carácter.");
    
    
    int i = 1;
    
    do {
      
      int n1 = (int)(Math.random() * 32) + 94;
      System.out.print("\033[32m" + (char)n1);
      
    } while (i > 0);
    
    
  }
}
