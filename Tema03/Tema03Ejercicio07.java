/**
* 
*
* @author Adrián Egea Hermoso
*/
public class Tema03Ejercicio07 {
  public static void main(String[] args) {
    
    String linea;

    System.out.println("Programa que calcule el total de una factura a partir de la base imponible: ");
    
    System.out.print("Por favor, introduce la base imponible: ");
    linea = System.console().readLine();
    double baseImponible = Double.parseDouble(linea);
    
    double totalFactura = baseImponible * 1.21;
    
    

    System.out.printf("El total de la factura es %.2f euros: ", totalFactura);   
  } 
}
