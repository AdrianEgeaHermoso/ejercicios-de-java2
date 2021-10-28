/**
 * 
 *
 * @author Adrián Egea Hermoso
 */
public class Tema04Ejercicio19 {
  public static void main(String[] args) {  
     
    System.out.println("Programa que nos diga cuántos dígitos tiene un número entero que puede ser positivo o negativo. Se permiten números de hasta 5 dígitos. ");   
    System.out.print("Por favor, introduzca un número entero de cinco dígitos como máximo: ");
    
    int n = Integer.parseInt(System.console().readLine());
    
    
    int numeroDigitos = 0;
    
    
    if ((n < 10) && (n > -10)){
      numeroDigitos = 1;
      System.out.print("Los dígitos introducidos son : " + numeroDigitos);
      }
      
    if (((n >= 10) && (n < 100)) || ((n <= -10) && (n > -100))){
      numeroDigitos = 2;
      System.out.print("Los dígitos introducidos son : " + numeroDigitos);
      }
      
    if (((n >= 100) && (n < 1000)) || ((n <= -100) && (n > -1000))){
      numeroDigitos = 3;
      System.out.print("Los dígitos introducidos son : " + numeroDigitos);
      }
    
    if (((n >= 1000) && (n < 10000)) || ((n <= -1000) && (n > -10000))){
      numeroDigitos = 4;
      System.out.print("Los dígitos introducidos son : " + numeroDigitos);
      }
      
    if (((n >= 10000) && (n < 100000)) || ((n <= -10000) && (n > -100000))){
      numeroDigitos = 5;
      System.out.print("Los dígitos introducidos son : " + numeroDigitos);
      }
    
  }
}
