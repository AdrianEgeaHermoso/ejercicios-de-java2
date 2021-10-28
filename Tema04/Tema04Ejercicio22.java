/**
 * 
 *
 * @author Adrián Egea Hermoso
 */
public class Tema04Ejercicio22 {
  public static void main(String[] args) {  
     
    System.out.println("Programa para introducir un día de la semana y una hora y minutos, y te dice los minutos que faltan hasta el fin de semana: ");   
    System.out.print("Por favor, introduzca el dia de la semana: ");
    
    String diaSemana = System.console().readLine().toLowerCase();// con el lowercase pasa a minuscula el dato
    
    //diaSemana = diaSemana.toLowerCase();
    
    System.out.print("Por favor, introduzca la hora: ");
    int hora = Integer.parseInt(System.console().readLine());
    
    System.out.print("Por favor, introduzca los minutos: ");
    int minutos = Integer.parseInt(System.console().readLine());
    
    int resultado;
    
    
    switch (diaSemana) {
      case "lunes":
        resultado = 6660 - ((hora * 60) + minutos);
        System.out.print("Faltan " + resultado + " minutos para el fin de semana");
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
