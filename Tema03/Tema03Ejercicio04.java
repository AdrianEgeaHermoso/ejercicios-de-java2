/**
* 
*
* @author Adrián Egea Hermoso
*/
public class Tema03Ejercicio04 {
  public static void main(String[] args) {
    
    String linea;

    System.out.println("Programa para realizar una multiplicación, división, suma y resta de dos numeros introducidos: ");
    
    System.out.print("Por favor, introduce el primer número: ");
    linea = System.console().readLine();
    int primerNumero = Integer.parseInt(linea);
    
    System.out.print("introduce el segundo número, por favor: ");
    linea = System.console().readLine();
    int segundoNumero = Integer.parseInt(linea);
    
    int multiplicacion = primerNumero * segundoNumero;
    int division = primerNumero / segundoNumero;
    int suma = primerNumero + segundoNumero;
    int resta = primerNumero - segundoNumero;

    System.out.println("El resultado de la multiplicación es: " + multiplicacion);
    System.out.println("El resultado de la división es: " + division);
    System.out.println("El resultado de la suma es: " + suma);
    System.out.println("El resultado de la resta es: " + resta);
  } 
}
