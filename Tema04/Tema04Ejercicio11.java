/**
 * 
 *
 * @author Adrián Egea Hermoso
 */
public class Tema04Ejercicio11 {
  public static void main(String[] args) {  
     
    System.out.println("Programa que calcula los segundos que faltan hasta medianoche tras introducir horas y minutos: ");   
    System.out.print("Por favor, introduzca la hora: ");
    
    int hora = Integer.parseInt(System.console().readLine());
    
    System.out.print("Por favor, introduzca los minutos: ");
    
    int minutos = Integer.parseInt(System.console().readLine());
    
    
    int segundos = 86400 - ((hora * 60 *60) + (minutos * 60));
    
    System.out.printf("Faltan " + segundos + " segundos para llegar a medianoche");

  }
}
