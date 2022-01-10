/**
 * @author Luis José Sánchez
 *
 * Ejemplo de uso de arrays bidimensionales
 */

public class Tema07Ejercicio02Bi {
  public static void main(String[] args){
       
      int[][] n = new int[2][3];

      int fila;
      int columna;
      int sumaFila;
      int sumaColumna;
      int sumaTotal;
      
      
      System.out.println("Por favor, introduzca los números del array");
      
      for(fila = 0; fila < 2; fila++) {
        
        for(columna = 0; columna < 3; columna++) {
          
          System.out.print("fila " + fila + " columna " + columna + " ");
          n[fila][columna] = Integer.parseInt(System.console().readLine());
          
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
