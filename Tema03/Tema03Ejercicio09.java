/**
* 
*
* @author Adrián Egea Hermoso
*/
public class Tema03Ejercicio09 {
  public static void main(String[] args) {
    
    String linea;

    System.out.println("Programa que calcule el volumen de un cono: ");
    
    System.out.print("Por favor, introduce las altura en cms: ");
    linea = System.console().readLine();
    double altura = Double.parseDouble(linea);
    
    System.out.print("Por favor, introduce el radio en cms: ");
    linea = System.console().readLine();
    double radio = Double.parseDouble(linea);
    
    
    double volumen = (1.0/3.0) * 3.1416 * radio * radio * altura;
    
    

    System.out.printf("El volumen del cono es %.2f cms: ", volumen);   
  } 
}
