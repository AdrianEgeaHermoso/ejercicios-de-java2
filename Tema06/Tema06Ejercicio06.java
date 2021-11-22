/**
 * 
 *
 *  @author Adrián Egea Hermoso
 */
public class Tema06Ejercicio06 {
  public static void main(String[] args) {
    System.out.println("Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe adivinarlo y tiene para ello 5 oportunidades. Después de cada intento fallido, el programa dirá cuántas oportunidades quedan y si el número introducido es menor o mayor que el número secreto.");
    
    int n = 0;
    int intentos = 5;
    int numeros = 0;
    
    numeros = (int)(Math.random() * 100) + 1;
    
    do{
      System.out.println("Introduzca el número: ");
      n = Integer.parseInt(System.console().readLine());
      
      intentos --;
      
      
      if (n == numeros){
        System.out.println("Número correcto");
      }
      
      if (n != numeros){
        System.out.println("Número incorrecto, te quedan " + intentos + " intentos");
      }
      
      if (intentos == 0){
        System.out.println("No te quedan mas intentos, otra vez será");
      }
      
    }while((n != numeros) && (intentos != 0));
    
    
  }
}
