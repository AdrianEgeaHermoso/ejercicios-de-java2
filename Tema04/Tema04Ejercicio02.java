/**
 * 
 *
 * @author Adrián Egea Hermoso
 */
public class Tema04Ejercicio02 {
  public static void main(String[] args) {  
     
    System.out.println("Programa para introducir una hora del día y te saluda según la hora introducida: ");   
    System.out.print("Por favor, introduzca una hora del día con un numero entero: ");
    
    int horaDia = Integer.parseInt(System.console().readLine());
    
    if ((horaDia >= 6) && (horaDia <= 12)) {
      System.out.println("Buenos días");
    }else if ((horaDia >= 13) && (horaDia <= 20)){
      System.out.println("Buenas tardes");
    }else if ((horaDia >= 21) && (horaDia <= 24) || ((horaDia >= 0 ) && (horaDia <= 5))) {
      System.out.println("Buenas noches");
    }else {
      System.out.println("Lo siento, la respuesta es incorrecta.");
    }

  }
}
