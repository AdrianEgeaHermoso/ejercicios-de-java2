/**
 * 
 *
 * @author Adrián Egea Hermoso
 */
public class Tema05Ejercicio09 {
  public static void main(String[] args) {
    System.out.println("Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado. ");
    
    
    System.out.println("Introduzca un numero entero de varios dígitos por teclado");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
    
    int cuentaDigitos = 0;
    
    
    
    
    while(numeroIntroducido > 0){
      numeroIntroducido /= 10;
      cuentaDigitos ++;
    }
    
    
    
    //do{
      //numeroIntroducido = Integer.parseInt(System.console().readLine());
      //numeroIntroducido /= 10;
      //cuentaDigitos ++;
    //}while(numeroIntroducido > 10);
      
    System.out.println(cuentaDigitos);
    
  }
}
