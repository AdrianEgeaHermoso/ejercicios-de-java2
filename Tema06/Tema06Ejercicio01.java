/**
 * Generación de números aleatorios.
 *
 *  @author Adrián Egea Hermoso
 */
public class Tema06Ejercicio01 {
  public static void main(String[] args) {
    System.out.println("Escribe un programa que muestre la tirada de tres dados. Se debe mostrar también la suma total (los puntos que suman entre los tres dados).");
    
    int suma = 0;
    int dados = 0;

    for (int i = 1; i <= 3; i++) {
      dados = (int)(Math.random() * 7) + 1;
      System.out.println(dados);
      suma += dados;
    }
    
    System.out.println("La suma de los tres números de los dados es " + suma);
    
    
  }
}
