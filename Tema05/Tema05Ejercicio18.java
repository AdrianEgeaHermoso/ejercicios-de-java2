/**
 * 
 *
 * @author Adrián Egea Hermoso
 */
public class Tema05Ejercicio18 {
  public static void main(String[] args) {
    System.out.println("Escribe un programa que obtenga los números enteros comprendidos entre dos números introducidos por teclado y validados como distintos, el programa debe empezar por el menor de los enteros introducidos e ir incrementando de 7 en 7.");
    
    int n1 = 0;
    int n2 = 0;
    
    do{
      System.out.print("Introduzca el primer número entero: ");
      n1 = Integer.parseInt(System.console().readLine());
    
      System.out.print("Introduzca el segundo número entero: ");
      n2 = Integer.parseInt(System.console().readLine());
      
      
      if (n1 == n2){
        System.out.println("Los números introducidos son iguales, deben ser dos numeros distintos ");
      }
      }while(n1 == n2);
      
      if (n1 < n2){
        for( int i = n1; i < n2; i+=7) {
        System.out.println(i);
        }
      }
        
      if (n2 < n1){
        for( int i = n2; i < n1; i+=7) {
        System.out.println(i);
        }
        
      }
  
  }
}
