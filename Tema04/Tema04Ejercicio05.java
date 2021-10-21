/**
 * 
 *
 * @author Adrián Egea Hermoso
 */
public class Tema04Ejercicio05 {
  public static void main(String[] args) {  
     
    System.out.println("Programa para resolver una ecuación de primer grado tipo ax + b = 0: ");   
    System.out.print("Por favor, introduzca el valor de a: ");
    
    double a = Double.parseDouble(System.console().readLine());
    
    System.out.print("Por favor, introduzca el valor de b: ");
    
    double b = Double.parseDouble(System.console().readLine());
    
    if (a == 0) {
      System.out.println("Esta ecuación no tiene solución");
    } else {
      double resultado = (-b/a);
      System.out.printf("x = %.2f",resultado);// resultado con dos decimales
      //System.out.println("x = " + (-b/a)); resultado con muchos decimales
    }

  }
}
