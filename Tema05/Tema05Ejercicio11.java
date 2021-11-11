/**
 * 
 *
 * @author Adrián Egea Hermoso
 */
public class Tema05Ejercicio11 {
  public static void main(String[] args) {
    System.out.println(" Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de los 5 primeros números enteros a partir de uno que se introduce por teclado. ");
    
    
    System.out.println("Introduzca un número para saber las potencias de los cinco numeros siguientes al introducido: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
    
    for (int i = numeroIntroducido; i < numeroIntroducido + 5; i++) {
      //System.out.print(Math.pow(i,2));
      //System.out.print(Math.pow(i,3));
      
      System.out.printf(" %d %.0f %.0f ",i,(Math.pow(i,2)),(Math.pow(i,3)));
      //System.out.printf(" %d %4d %6d   ",i,(i*i),(i*i*i));
    }
    
  
  }
}
