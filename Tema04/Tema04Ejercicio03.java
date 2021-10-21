/**
 * 
 *
 * @author Adrián Egea Hermoso
 */
public class Tema04Ejercicio03 {
  public static void main(String[] args) {
    
    System.out.println("Programa que dando un número entre 1 y 7 nos muestra su nombre del día de la semana: ");   
       
    System.out.print("Por favor, introduzca un numero entre 1 y 7: ");
    int numeroDia = Integer.parseInt(System.console().readLine());
    
    switch (numeroDia) {
      case 1:
        System.out.println("Lunes");
        break;
      case 2:
        System.out.println("Martes");
        break;
      case 3:
        System.out.println("Miércoles");
        break;
      case 4:
        System.out.println("Jueves");
        break;
      case 5:
        System.out.println("Viernes");
        break;
      case 6:
        System.out.println("Sábado");
        break;
      case 7:
        System.out.println("Domingo");
        break;
      default:
        System.out.println("Dato introducido incorrecto, escriba un número entre 1 y 7, gracias");;
    }
  }
}
