/**
 * 
 *
 * @author Adrián Egea Hermoso
 */
public class Tema04Ejercicio07 {
  public static void main(String[] args) {  
     
    System.out.println("Programa que calcula la media de tres notas: ");   
    System.out.print("Por favor, introduzca la primera nota: ");
    
    double primeraNota = Double.parseDouble(System.console().readLine());
    
    System.out.print("Por favor, introduzca la segunda nota: ");
    
    double segundaNota = Double.parseDouble(System.console().readLine());
    
    System.out.print("Por favor, introduzca la tercera nota: ");
    
    double terceraNota = Double.parseDouble(System.console().readLine());
    
    double notaMedia = (primeraNota + segundaNota + terceraNota) / 3;
    
    System.out.printf("La nota media de sus tres examenes es %.2f", notaMedia);

  }
}
