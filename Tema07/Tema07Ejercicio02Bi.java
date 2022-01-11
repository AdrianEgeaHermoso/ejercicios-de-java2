/**
 * @author Adrián Egea Hermoso
 *
 * 
 */

public class Tema07Ejercicio02Bi {
  public static void main(String[] args){
    
    System.out.println("Escribe un programa que pida 20 números enteros. Estos números se deben introducir en un array de 4 filas por 5 columnas. El programa mostrará las sumas parciales de filas y columnas igual que si de una hoja de cálculo se tratara. La suma total debe aparecer en la esquina inferior derecha.");
    
       
      int[][] n = new int[3][4];

      int fila;
      int columna;
      int sumaFila;
      int sumaColumna;
      int sumaTotal;
      
      
      System.out.println("Por favor, introduzca los números del array");
      
      for(fila = 0; fila < 3; fila++) {
        
        for(columna = 0; columna < 4; columna++) {
          
          System.out.print("fila " + fila + " columna " + columna + " ");
          n[fila][columna] = Integer.parseInt(System.console().readLine());
          
        }
      }
      
      
      for(fila = 0; fila < 3; fila++) {
        
        sumaFila = 0;
        
        for(columna = 0; columna < 4; columna++) {
          
          System.out.printf("%5d   ", n[fila][columna]);
          sumaFila += n[fila][columna];
        }
        
        System.out.printf("SUMA FILA%5d\n", sumaFila);
      }
      
      
      System.out.println("SUMA DE LAS COLUMNAS");

      sumaTotal = 0;
      
      for(columna = 0; columna < 4; columna++) {
        
        sumaColumna = 0;
        
        for(fila = 0; fila < 3; fila++) {
          
          sumaColumna += n[fila][columna];
        }

        sumaTotal += sumaColumna;
        System.out.printf("%5d   ", sumaColumna);
      }
      
      System.out.printf("SUMA TOTAL%5d   ", sumaTotal);
    
      
      
    }
}
