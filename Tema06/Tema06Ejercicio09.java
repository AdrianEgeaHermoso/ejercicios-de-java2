/**
 * 
 *
 *  @author Adrián Egea Hermoso
 */
public class Tema06Ejercicio09 {
  public static void main(String[] args) {
    System.out.println("Realiza un programa que vaya generando números aleatorios pares entre 0 y 100 y que no termine de generar números hasta que no saque el 24. El programa deberá decir al final cuántos números se han generado.");
    
    
    int n = 0;
    int contador = 0;
    
    while (n != 24){
      n = (int)(Math.random() * 100) + 1;
      
      if ((n % 2) == 0){
      System.out.println(n);
      contador ++;
      }
    }
    
    System.out.println("Se han generado " + contador + " números");
    
    
  }
}
