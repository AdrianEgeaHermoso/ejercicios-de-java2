/**
 * 
 *
 * @author Adrián Egea Hermoso
 */
public class Tema05Ejercicio15 {
  public static void main(String[] args) {
    System.out.println(" Escribe un programa que dados dos números, uno real (base) y un entero positivo (exponente), saque por pantalla todas las potencias con base el numero dado y exponentes entre uno y el exponente introducido. ");
    
    System.out.print("Introduzca la base: ");
    int base = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca un múmero entero como exponente: ");
    int exponenteFinal = Integer.parseInt(System.console().readLine());

    double potencia;
    int exponente;
        
    for (int i = 1; i <= exponenteFinal; i++) {
        
      potencia = 1;
      exponente = i;
      
      for (int j = 0; j < exponente; j++) {
        potencia *= base;
      }
      
      System.out.println(base + "^" + i + " = " + potencia);
    }
      
    
  
  }
}
