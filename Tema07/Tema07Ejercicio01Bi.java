/**
 * @author Adrián Egea Hermoso
 *
 * 
 */

public class Tema07Ejercicio01Bi {
  public static void main(String[] args){
       
      int[][] n = new int[3][6];

      n[0][0] = 0;
      n[0][1] = 30;
      n[0][2] = 2;
      n[0][5] = 5;
      n[1][0] = 75;
      n[1][4] = 0;
      n[2][2] = -2;
      n[2][3] = 9;
      n[2][5] = 11;

      int fila;
      int columna;
      
      System.out.println("         Col 1   Col 2   Col 3   Col 4   Col 5   Col 6 ");
      
      for(fila = 0; fila < 3; fila++) {

        System.out.print("Fila: " + fila);
    
        for(columna = 0; columna < 6; columna++) {
          System.out.printf("%7d ", n[fila][columna]);
        }
        System.out.println();    
      }
    }
}
