/**
 * 
 *
 * @author Adrián Egea Hermoso
 */
public class Tema04Ejercicio14 {
  public static void main(String[] args) {  
     
    System.out.println("Programa que te dice si un número es par y/o divisble entre 5 : ");   
    System.out.print("Por favor, introduzca un número entero: ");
    
    int n = Integer.parseInt(System.console().readLine());
    
    
    if (n % 2 == 0) {
      System.out.print(n + " es un numero par");
    }else{
      System.out.print(n + " es un numero impar");}
      
      
    if (n % 5 == 0) {
      System.out.print(" y es divisible entre 5");
    }else{
      System.out.print(" y no es divisible entre 5");}
  }
}
