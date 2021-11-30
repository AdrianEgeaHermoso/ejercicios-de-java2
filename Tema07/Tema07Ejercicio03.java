/**
 * 
 * 
 * @author Adrián Egea Hermoso
 */
public class Tema07Ejercicio03 {
  public static void main(String[] args) {
    
    System.out.println("Escribe un programa que lea 10 números por teclado y que luego los muestre en orden inverso, es decir, el primero que se introduce es el último en mostrarse y viceversa.");
    
    int[] num = new int[10];
    
    System.out.println("Introduzca 10 números y teclee INTRO tras escribir cada número");
    for (int i = 0; i < num.length; i++) {
      num[i] = Integer.parseInt(System.console().readLine());
    }
    
    for (int i = 9; i >= 0; i--) {
      System.out.println(num[i]);
    }
    
    
  }
}
