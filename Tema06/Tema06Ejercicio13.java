/**
 * 
 *
 *  @author Adrián Egea Hermoso
 */
public class Tema06Ejercicio13 {
  public static void main(String[] args) {
    System.out.println("Escribe un programa que simule la tirada de dos dados. El programa deberá continuar tirando los dados una y otra vez hasta que en alguna tirada los dos dados tengan el mismo valor.");
    
    int dado1 = 0;
    int dado2 = 0;
    
    do {
      
      String dado1n = "";
      
      dado1 = (int)(Math.random() * 6);
      
      switch(dado1) {
      case 0:
        dado1n = " ⚀";
        break;
      case 1:
        dado1n = " ⚁";
        break;
      case 2:
        dado1n = " ⚂";
        break;
      case 3:
        dado1n = " ⚃";
        break;
      case 4:
        dado1n = " ⚄";
        break;
      case 5:
        dado1n = " ⚅";
        break;
      default:
    }
      
      dado2 = (int)(Math.random() * 6);
      
      String dado2n = "";
      
      switch(dado2) {
      case 0:
        dado2n = " ⚀";
        break;
      case 1:
        dado2n = " ⚁";
        break;
      case 2:
        dado2n = " ⚂";
        break;
      case 3:
        dado2n = " ⚃";
        break;
      case 4:
        dado2n = " ⚄";
        break;
      case 5:
        dado2n = " ⚅";
        break;
      default:
    }
      
      
      System.out.println(dado1n + dado2n);
      System.out.println(" ");
      
      //System.out.println("⚀ " + dado1);
      //System.out.println("⚄ " + dado2);
      //System.out.println(" ");
      
      
    } while (dado1 != dado2);
    
    
  }
}
