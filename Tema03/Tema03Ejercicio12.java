/**
* 
*
* @author Adrián Egea Hermoso
*/
public class Tema03Ejercicio12 {
  public static void main(String[] args) {
    
    String linea;

    System.out.println("Programa que calcule la nota que hace falta sacar en el segundo examen para obtener la media deseada: ");
    System.out.println("Ten en cuenta que la nota del primer examen cuenta un 40% y la del segundo un 60%: ");
    
    System.out.print("Por favor, introduce la nota del primer examen: ");
    linea = System.console().readLine();
    double primeraNota = Double.parseDouble(linea);
    
    System.out.print("Que nota quieres sacar en el trimestre: ");
    linea = System.console().readLine();
    double notaFinal = Double.parseDouble(linea);
    
    double segundaNota = ((notaFinal * 100) - (primeraNota * 40)) / 60;
    
    System.out.printf("Para sacar un %.2f en el trimestre, necesitas sacar un %.2f en el segundo examen  ", notaFinal,segundaNota);   
  } 
}
