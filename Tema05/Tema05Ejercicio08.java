/**
 * Bucle for
 *
 * @author Adrián Egea Hermoso
 */
public class Tema05Ejercicio08 {
  public static void main(String[] args) {
    
    System.out.println("Programa que te muestre la tabla de multiplicar de un número introducido por teclado: ");   
    System.out.print("Por favor, introduzca un número entero: ");
    
    int n = Integer.parseInt(System.console().readLine());
    
    System.out.println("Tabla de multiplicar del " + n);
    System.out.println("-------------------------");
    
    for (int i = 0; i <= 10; i++) {
      System.out.println(n +  " x " + i + " = " + n * i);
    }
  }
}
