/**
 * 
 *
 * @author Adrián Egea Hermoso
 */
public class Tema05Ejercicio06 {
  public static void main(String[] args) {
    System.out.println("Programa que muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando un bucle do while: ");
    
    int i = 320;
    
    do{
      System.out.println(i);
      i -= 20;
    }while(i >= 160);
    
  }
}
