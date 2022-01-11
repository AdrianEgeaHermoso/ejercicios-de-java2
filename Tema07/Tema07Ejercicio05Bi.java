/**
 * @author Adrián Egea Hermoso
 *
 * 
 */

public class Tema07Ejercicio05Bi {
  public static void main(String[] args)throws InterruptedException{
    
    System.out.println("Realiza un programa que rellene un array de 6 filas por 10 columnas con números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos). A continuación, el programa deberá dar la posición tanto del máximo como del mínimo.");
    
       
      int[][] n = new int[2][3];

      int fila;
      int columna;
      
      int minimo = Integer.MAX_VALUE;
      int filaMinimo = 0;
      int columnaMinimo = 0;
      
      int maximo = Integer.MIN_VALUE;
      int filaMaximo = 0;
      int columnaMaximo = 0;
      
      
      
    System.out.println(" Columna:   Col 1   Col 2   Col 3");
    for(fila = 0; fila < 2; fila++) {
      
      System.out.print(" Fila: " + fila + " │");
      
      for(columna = 0; columna < 3; columna++) {
        
        n[fila][columna] = (int)(Math.random() * 1001);
        System.out.printf("%7d ", n[fila][columna]);
        Thread.sleep(100);
        
  
        if (n[fila][columna] < minimo) {
          minimo = n[fila][columna];
          filaMinimo = fila;
          columnaMinimo = columna;
        }
        

        if (n[fila][columna] > maximo) {
          maximo = n[fila][columna];
          filaMaximo = fila;
          columnaMaximo = columna;
        }
      }
      System.out.println(" ");
    }

    System.out.println("Maximo " + maximo + " y está en la fila " + filaMaximo + " y en la columna " + columnaMaximo);
    System.out.println("Minimo " + minimo + " y está en la fila " + filaMinimo + " y en la columna " + columnaMinimo);
      
     
      
      
    }
}
