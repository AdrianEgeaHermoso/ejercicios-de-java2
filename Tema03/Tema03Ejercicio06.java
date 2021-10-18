/**
* 
*
* @author Adrián Egea Hermoso
*/
public class Tema03Ejercicio06 {
  public static void main(String[] args) {
    
    String linea;

    System.out.println("Programa que calcule el área de un triángulo: ");
    
    System.out.print("Por favor, introduce la base del triángulo: ");
    linea = System.console().readLine();
    double base = Double.parseDouble(linea);
    
    System.out.print("introduce la altura del triángulo, por favor: ");
    linea = System.console().readLine();
    double altura = Double.parseDouble(linea);
    
    double total = (base * altura) / 2;

    System.out.print("El área del triángulo es: " + total);   
  } 
}
