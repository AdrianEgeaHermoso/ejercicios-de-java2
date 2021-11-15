/**
 * 
 *
 * @author Adrián Egea Hermoso
 */
public class Tema05Ejercicio17 {
  public static void main(String[] args) {
    System.out.println("Realiza un programa que sume los 100 números siguientes a un número entero y positivo introducido por teclado. Se debe comprobar que el dato introducido es correcto (que es un número positivo).");
    
    
    int numeroIntroducido = 0;
    
    do{
      System.out.print("Introduzca un número entero: ");
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      
      if (numeroIntroducido <0){
      System.out.println("El número introducido no es positivo");
      }
    }while(numeroIntroducido < 0);
      int suma = 0;
      
    for (int i = numeroIntroducido; i < numeroIntroducido + 100; i++) {
      suma += i;
    }
    
    System.out.println("La suma de los números es " + suma);
  
  }
}
