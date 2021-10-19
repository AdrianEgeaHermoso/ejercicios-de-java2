/**
* 
*
* @author Adrián Egea Hermoso
*/
public class Tema03Ejercicio10 {
  public static void main(String[] args) {
    
    String linea;

    System.out.println("Programa que convierte Mb a Kb: ");
    
    System.out.print("Por favor, introduce los Mb que desea convertir: ");
    linea = System.console().readLine();
    double mb = Double.parseDouble(linea);
    
    double kb = mb * 1024;
    
    System.out.printf("Tienes %.2f Kb: ", kb);   
  } 
}
