/**
 * 
 *
 *  @author Adrián Egea Hermoso
 */
public class Tema06Ejercicio14 {
  public static void main(String[] args) {
    System.out.println("El programa intentará adivinar el número que estás pensando - un número entre 0 y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el programa debe preguntar si el número que estás pensando es mayor o menor que el que te acaba de decir.");
    
    int n = 0;
    int intentos = 5;
    int numeros = 0;
    
    System.out.println("Introduzca un número entre 0 y 100, y el programa tendrá 5 intentos para adivinarlo: ");
    n = Integer.parseInt(System.console().readLine());
    
    
    do{
      
      numeros = (int)(Math.random() * 100) + 1;
      
      intentos --;
      
      
      if ((n == numeros) || ((intentos == 0) && (n == numeros))){
        System.out.println("Número correcto");
      }
      
      if (n > numeros){
        System.out.println("El número correcto es menor, te quedan " + intentos + " intentos");
      }
      if (n < numeros){
        System.out.println("El número correcto es mayor, te quedan " + intentos + " intentos");
      }
      
      if ((intentos == 0) && (n != numeros)){
        System.out.println("No te quedan mas intentos, otra vez será");
      }
      
    }while((n != numeros) && (intentos != 0));
    
    
  }
}
