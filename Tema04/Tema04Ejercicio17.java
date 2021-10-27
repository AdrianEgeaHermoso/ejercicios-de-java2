/**
 * 
 *
 * @author Adrián Egea Hermoso
 */
public class Tema04Ejercicio17 {
  public static void main(String[] args) {  
     
    System.out.println("Programa que te dice cual es la ultima cifra de un número entero introducido por teclado: ");   
    System.out.print("Por favor, introduzca un número entero: ");
    
    int n = Integer.parseInt(System.console().readLine());
    
    
    int ultimaCifra = n%10;
    
    
    System.out.print("La última cifra del número introducido es: " + ultimaCifra);
    
    
  }
}
