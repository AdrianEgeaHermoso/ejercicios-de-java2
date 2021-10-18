/**
* 
*
* @author Adrián Egea Hermoso
*/
public class Tema03Ejercicio01 {
  public static void main(String[] args) {
    
    String linea;

    System.out.println("Programa para realizar una multiplicación: ");
    
    System.out.print("Por favor, introduce el primer número: ");
    linea = System.console().readLine();
    int primerNumero = Integer.parseInt(linea);
    
    System.out.print("introduce el segundo número, por favor: ");
    linea = System.console().readLine();
    int segundoNumero = Integer.parseInt(linea);
    
    int total = primerNumero * segundoNumero;

    System.out.print("El resultado de la multiplicación es: " + total);   
  } 
}
