/**
 * 
 *
 * @author Adrián Egea Hermoso
 */
public class Tema05Ejercicio01 {
  public static void main(String[] args) {
    System.out.println("Programa que muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for: ");
    
    //Opcion 1
    for (int i = 0; i <= 100; i += 5) {
      System.out.println(i);
    }
    
    //Opcion 2
    for (int i = 0; i <= 20; i++) {
      System.out.println(i * 5);
    }
    
    //Opcion 3
    for (int i = 0; i <= 100; i++) {
      if (i%5 == 0){
      System.out.println(i);
    }
    }
  }
}
