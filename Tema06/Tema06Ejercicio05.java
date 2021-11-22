/**
 * 
 *
 *  @author Adrián Egea Hermoso
 */
public class Tema06Ejercicio05 {
  public static void main(String[] args) {
    System.out.println("Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos) separados por espacios. Muestra también el máximo, el mínimo y la media de esos números.");
    
    int n = 0;
    int suma = 0;
    int maximo = 100;
    int minimo = 199;

    for (int i = 1; i <= 50; i++) {
      n = (int)(Math.random() * 100) + 100;
      System.out.print(n + "  ");
      suma += n;
      
      if (n < minimo){
        minimo = n;
      }
      
      if (n > maximo){
        maximo = n;
      }
    }
    
    System.out.println("\nLa media de los números es " + suma / 50);
    System.out.println("El número máximo es " + maximo);
    System.out.println("El número mínimo es " + minimo);
    
    
  }
}
