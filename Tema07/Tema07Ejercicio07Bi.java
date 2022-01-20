import javax.swing.text.TableView.TableRow;

/**
 * @author Adrián Egea Hermoso
 *
 * 
 */

public class Tema07Ejercicio07Bi {
  public static void main(String[] args){
    
    System.out.println("Mejora el juego “Busca el tesoro” de tal forma que si hay una mina a una casilla de distancia, el programa avise diciendo ¡Cuidado! ¡Hay una mina cerca!");
    
       
      int[][] tablero = new int[5][4];


      int vacio = 0;
      int x = 0;
      int y = 0;
      int intento = 0;
      int mina = 0;
      int tesoro = 0;
      
      
      for(x = 0; x < 4; x++) {
        
        for(y = 0; y < 3; y++) {
          
          tablero[x][y] = vacio;
          
        }
      }

      int minax = (int) (Math.random()*5);
      int minay = (int) (Math.random()*4);
      tablero[minax][minay]= mina;

      int tesorox = (int) (Math.random()*5);
      int tesoroy = (int) (Math.random()*4);
      tablero[tesorox][tesoroy] = tesoro;



      
      for(y = 0; y <= 3; y++) {
        
        System.out.print(y + "|");  
        
        for(x = 0; x < 4; x++) {
          if (tablero[x][y] == vacio) {
            System.out.print("X ");
          } else {
            System.out.print("  ");
          }
        }
        System.out.println();
      }

      System.out.println("  -------");
      System.out.println("  0 1 2 3 4");
    
      
      
    }
}
