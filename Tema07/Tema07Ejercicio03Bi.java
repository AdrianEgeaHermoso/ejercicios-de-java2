/**
 * @author Adrián Egea Hermoso
 *
 * 
 */

public class Tema07Ejercicio03Bi {
  public static void main(String[] args){
    
    System.out.println("Modifica el programa anterior de tal forma que los números que se introducen en el array se generen de forma aleatoria (valores entre 100 y 999).");
    
       
      int[][] n = new int[2][3];

      int fila;
      int columna;
      int sumaFila;
      int sumaColumna;
      int sumaTotal;
      
      
      
      
      for(fila = 0; fila < 2; fila++) {
        
        for(columna = 0; columna < 3; columna++) {
          n[fila][columna] = (int)(Math.random() * 900) + 100;
          
        }
      }
      
      
      for(fila = 0; fila < 2; fila++) {
        
        sumaFila = 0;
        
        for(columna = 0; columna < 3; columna++) {
          
          System.out.printf("%5d   ", n[fila][columna]);
          sumaFila += n[fila][columna];
        }
        
        System.out.printf("SUMA FILA%5d\n", sumaFila);
      }
      
      
      System.out.println("SUMA DE LAS COLUMNAS");

      sumaTotal = 0;
      
      for(columna = 0; columna < 3; columna++) {
        
        sumaColumna = 0;
        
        for(fila = 0; fila < 2; fila++) {
          
          sumaColumna += n[fila][columna];
        }

        sumaTotal += sumaColumna;
        System.out.printf("%5d   ", sumaColumna);
      }
      
      System.out.printf("SUMA TOTAL%5d   ", sumaTotal);
    
      
      
    }
}
