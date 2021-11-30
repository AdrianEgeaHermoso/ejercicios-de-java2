/**
 * 
 * 
 * @author Adrián Egea Hermoso
 */
public class Tema07Ejercicio05 {
  public static void main(String[] args) {
    
    System.out.println("Escribe un programa que pida 10 números por teclado y que luego muestre los números introducidos junto con las palabras “máximo” y “mínimo” al lado del máximo y del mínimo respectivamente.");
    
    int[] num = new int[10];
    int maximo = Integer.MIN_VALUE;
    int minimo = Integer.MAX_VALUE;
    
    System.out.println("Introduzca 10 números y teclee INTRO tras escribir cada número");
    
    for (int i = 0; i < num.length; i++) {
      num[i] = Integer.parseInt(System.console().readLine());
      
      if (num[i] > maximo){
        num[i] = maximo;
      }
      
      if (num[i] < minimo){
        num[i] = minimo;
      }
    }
    
    for (int i = 0; i < num.length; i++) {
      System.out.println(num[i]);
      
      if (num[i] == maximo){
        System.out.println("maximo");
      }
      
      if (num[i] == minimo){
        System.out.println("minimo");
      }
      System.out.println();
    }
    
    
  }
}
