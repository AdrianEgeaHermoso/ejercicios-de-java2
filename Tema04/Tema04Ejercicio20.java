/**
 * 
 *
 * @author Adrián Egea Hermoso
 */
public class Tema04Ejercicio20 {
  public static void main(String[] args) {  
     
    System.out.println("Programa que diga si un número entero positivo introducido por teclado es capicúa. Se permiten números de hasta 5 cifras. ");   
    System.out.print("Por favor, introduzca un número entero de cinco dígitos como máximo: ");
    
    int n = Integer.parseInt(System.console().readLine());
    
    boolean capicua = false;
    
    
    if (n < 10) {
      capicua = true;
      }
      
    if ((n >= 10) && (n < 100)) {
      if ((n / 10) == (n % 10)){
        capicua = true;
        }
      }
      
    if ((n >= 100) && (n < 1000)) {
      if ((n / 100) == (n % 10)){
        capicua = true;
        }
      }
    
    if ((n >= 1000) && (n < 10000)) {
      if (((n / 1000) == (n % 10)) && ((( n / 100 ) % 10)== (( n / 10) % 10))){
        capicua = true;
        }
      }
      
    if ((n >= 10000) && (n < 100000)) {
      if (((n / 10000) == (n % 10) ) && ((((n / 1000) % 10)) == ((n / 10) % 10))){
        capicua = true;
        }
      }
      
    if (capicua) {
      System.out.println("El " + n + " es capicúa.");
    } else {
      System.out.println("El " + n + " no es capicúa.");
    }
    
  }
}
