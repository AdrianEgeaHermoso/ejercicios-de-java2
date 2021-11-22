/**
 * 
 *
 *  @author Adrián Egea Hermoso
 */
public class Tema06Ejercicio07 {
  public static void main(String[] args) {
    System.out.println("Escribe un programa que muestre tres apuestas de la quiniela en tres columnas para los 14 partidos y el pleno al quince (15 filas).");
    
    int n = 0;
    String signo = "";
    
    for (int i = 1; i <= 15; i++) {
      n = (int)(Math.random() * 3) + 1;
      
      switch(n){
        case 1:
        signo = "1";
        break;
        case 2:
        signo = "X";
        break;
        case 3:
        signo = "2";
        default:
      }
      System.out.println(signo);
    }
    
    
  }
}
