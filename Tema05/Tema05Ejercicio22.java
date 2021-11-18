/**
 * 
 *
 * @author Adrián Egea Hermoso
 */
public class Tema05Ejercicio22 {
  public static void main(String[] args) {
    System.out.println(" Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos. ");
    

    
    for (int i = 2; i <= 100; i++) {
      
      boolean esPrimo = true;
      
      for (int n = 2; n < i; n++) {
        if (i % n == 0) {
          esPrimo = false;
        }
      }
      if (esPrimo){
        System.out.println(i);
      }
    }
    System.out.println();
  
  }
}
