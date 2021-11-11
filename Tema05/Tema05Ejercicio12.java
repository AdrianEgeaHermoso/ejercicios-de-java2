/**
 * 
 *
 * @author Adrián Egea Hermoso
 */
public class Tema05Ejercicio12 {
  public static void main(String[] args) {
    System.out.println(" Escribe un programa que muestre los n primeros términos de la serie de Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1 y el resto se calcula sumando los dos anteriores ");
    
    
    System.out.println("Introduzca cuantos numeros quiere mostrar de la serie Fibonacci: ");
    int n = Integer.parseInt(System.console().readLine());
    
    switch (n) {
      case 1:
        System.out.print("0");
        break;
      case 2:
        System.out.print("0 1");
        break;
      default:
        System.out.print("0 1");
        int n1 = 0;
        int n2 = 1;
        int aux;
        while(n > 2) {
            aux = n1;
            n1 = n2;
            n2 = aux + n1;
            System.out.print(" " + n2);
            n--;
        }
    }
    
 }
}
