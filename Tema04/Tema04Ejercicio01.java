/**
 * 
 *
 * @author Adrián Egea Hermoso
 */
public class Tema04Ejercicio01 {
  public static void main(String[] args) {  
     
    System.out.println("Programa para introducir un día de la semana y te dice que asignatura hay a primera hora: ");   
    System.out.print("Por favor, introduzca el dia de la semana: ");
    
    String diaSemana = System.console().readLine().toLowerCase();// con el lowercase pasa a minuscula el dato
    
    //diaSemana = diaSemana.toLowerCase();
    
    
    switch (diaSemana) {
      case "lunes":
        System.out.print("Programación");
        break;
      case "martes":
        System.out.print("Programación");
        break;
      case "miercoles":
        System.out.print("Sistemas Informáticos");
        break;
      case "jueves":
        System.out.print("Programación");
        break;
      case "viernes":
        System.out.print("Formación y Orientación Laboral");
        break;
      case "sabado":
        System.out.print("Descanso");
        break;
      case "domingo":
        System.out.print("Descanso");
        break;
      default:
        System.out.print("no es correcto, escribe un dia de la semana de lunes a domingo en minúscula");
    }

  }
}
