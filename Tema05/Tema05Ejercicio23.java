/**
 * 
 *
 * @author Adrián Egea Hermoso
 */
public class Tema05Ejercicio23 {
  public static void main(String[] args) {
    System.out.println("Escribe un programa que permita ir introduciendo una serie indeterminada de números mientras su suma no supere el valor 10000. Cuando esto último ocurra, se debe mostrar el total acumulado, el contador de los números introducidos y la media.");
    
    System.out.println("Introduzca números hasta que la suma de dichos números: ");
    int total = 0;
    int contador = 0;
    int media = 0;
    do {
      int n = Integer.parseInt(System.console().readLine());
      total += n;
      contador ++;
    } while (total <= 10000);
    
    media = total / contador;
    
    System.out.println("La suma de los numeros introducidos es " + total);
    System.out.println("La cantidad de números introducidos es " + contador);
    System.out.println("La media de los números introducidos es " + media);
  
  }
}
