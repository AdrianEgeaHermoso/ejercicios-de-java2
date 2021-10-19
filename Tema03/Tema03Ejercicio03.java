/**
* 
*
* @author Adrián Egea Hermoso
*/
public class Tema03Ejercicio03 {
  public static void main(String[] args) {
    
    String linea;

    System.out.println("Programa para convertir pesetas a euros: ");
    
    System.out.print("Por favor, introduce la cantidad en pesetas: ");
    linea = System.console().readLine();
    int pesetas = Integer.parseInt(linea);
    
    double euros = 166.3860;
    
    double conversion = pesetas / euros;

    System.out.printf("%d pesetas son %.2f euros", pesetas, conversion);   
  } 
}
