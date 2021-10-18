/**
* 
*
* @author Adrián Egea Hermoso
*/
public class Tema03Ejercicio05 {
  public static void main(String[] args) {
    
    String linea;

    System.out.println("Programa que calcule el área de un rectángulo: ");
    
    System.out.print("Por favor, introduce la base del rectángulo: ");
    linea = System.console().readLine();
    double base = Double.parseDouble(linea);
    
    System.out.print("introduce la altura del rectángulo, por favor: ");
    linea = System.console().readLine();
    double altura = Double.parseDouble(linea);
    
    double total = base * altura;

    System.out.print("El área del rectángulo es: " + total);   
  } 
}
