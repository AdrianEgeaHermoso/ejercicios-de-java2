/**
 * 
 *
 * @author Adrián Egea Hermoso
 */
public class Tema04Ejercicio13 {
  public static void main(String[] args) {  
     
    System.out.println("Programa que ordena tres números introducidos por teclado : ");   
    System.out.print("Por favor, introduzca el valor del primer número: ");
    
    int a = Integer.parseInt(System.console().readLine());
    
    System.out.print("Por favor, introduzca el valor del segundo número: ");
    
    int b = Integer.parseInt(System.console().readLine());
    
    System.out.print("Por favor, introduzca el valor del tercer número: ");
    
    int c = Integer.parseInt(System.console().readLine());
    
    
    
    if ((a > b) && (a > c) && (b > c)) {
      System.out.println("El orden correcto es " + a +"," + b + "," + c);
    }else if ((a > b) && (a > c) && (c > b)) {
      System.out.println("El orden correcto es " + a +"," + c + "," + b);
    }else if ((a < b) && (a > c) && (b > c)) {
      System.out.println("El orden correcto es " + b +"," + a + "," + c);
    }else if ((b > c) && (b > a) && (c > a)) {
      System.out.println("El orden correcto es " + b +"," + c + "," + a);
    }else if ((c > b) && (c > a) && (a > b)) {
      System.out.println("El orden correcto es " + c +"," + a + "," + b);
    }else if ((c > b) && (c > a) && (b > a)) {
      System.out.println("El orden correcto es " + c +"," + b + "," + a);
    }

  }
}
