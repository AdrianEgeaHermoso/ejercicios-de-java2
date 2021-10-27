/**
 * 
 *
 * @author Adrián Egea Hermoso
 */
public class Tema04Ejercicio18 {
  public static void main(String[] args) {  
     
    System.out.println("Programa que te dice cual es la primera cifra de un número entero introducido por teclado (máximo 5 dígitos): ");   
    System.out.print("Por favor, introduzca un número entero de cinco dígitos como máximo: ");
    
    int n = Integer.parseInt(System.console().readLine());
    
    
    int primeraCifra = 0;
    
    
    if (n < 10){
      primeraCifra = n;
      System.out.print("La primera cifra del número introducido es: " + primeraCifra);
      }
      
    if ((n >= 10) && (n < 100)){
      primeraCifra = n / 10;
      System.out.print("La primera cifra del número introducido es: " + primeraCifra);
      }
      
    if ((n >= 100) && (n < 1000)){
      primeraCifra = n / 100;
      System.out.print("La primera cifra del número introducido es: " + primeraCifra);
      }
    
    if ((n >= 1000) && (n < 10000)){
      primeraCifra = n / 1000;
      System.out.print("La primera cifra del número introducido es: " + primeraCifra);
      }
      
    if ((n >= 10000) && (n < 100000)){
      primeraCifra = n / 10000;
      System.out.print("La primera cifra del número introducido es: " + primeraCifra);
      }
    
  }
}
