/**
* 
*
* @author Adrián Egea Hermoso
*/
public class Tema03Ejercicio02 {
  public static void main(String[] args) {
    
    String linea;

    System.out.println("Programa para convertir euros a pesetas: ");
    
    System.out.print("Por favor, introduce la cantidad en euros: ");
    linea = System.console().readLine();
    double euros = Double.parseDouble(linea);
    
    double pesetas = 166.3860;
    
    int conversion = (int)(euros * pesetas);

    System.out.print("Estas son las pesetas que tienes: " + conversion + " pesetas");   
  } 
}
