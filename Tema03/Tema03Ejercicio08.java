/**
* 
*
* @author Adrián Egea Hermoso
*/
public class Tema03Ejercicio08 {
  public static void main(String[] args) {
    
    String linea;

    System.out.println("Programa que calcule el salario semanal de un empleado en base a horas trabajadas (12 euros hora): ");
    
    System.out.print("Por favor, introduce las horas trabajadas esta semana: ");
    linea = System.console().readLine();
    int horasTrabajadas = Integer.parseInt(linea);
    
    int sueldoSemanal = horasTrabajadas * 12;
    
    

    System.out.printf("Tu salario semanal es de  :" + sueldoSemanal + " Euros");   
  } 
}
