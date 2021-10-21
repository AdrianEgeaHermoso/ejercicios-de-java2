/**
 * 
 *
 * @author Adrián Egea Hermoso
 */
public class Tema04Ejercicio04 {
  public static void main(String[] args) {  
     
    System.out.println("Programa para calcular el salario semanal de un trabajador que tiene en cuenta las horas ordinarias y extraordinarias: ");   
    System.out.print("Por favor, introduzca el número de horas trabajadas durante la semana: ");
    
    int horasTrabajadas = Integer.parseInt(System.console().readLine());
    
    if ((horasTrabajadas >= 1) && (horasTrabajadas <= 40)) {
      int sueldo = horasTrabajadas * 12;
      System.out.println("Su sueldo semanal es de: " + sueldo + " euros");
    }else if (horasTrabajadas > 40){
      int sueldo = ((horasTrabajadas - 40) * 16) + (40 * 12);
      System.out.println("Su sueldo semanal es de: " + sueldo + " euros");
    }else {
      System.out.println("Dato introducido incorrecto, introduzca un número entero.");
    }

  }
}
