/**
 * 
 *
 *  @author Adrián Egea Hermoso
 */
public class Tema06Ejercicio02 {
  public static void main(String[] args) {
    System.out.println("Realiza un programa que muestre al azar el nombre de una carta de la baraja francesa.");
    
    String figura = "";
    int n1 = (int)(Math.random() * 4);
    
    switch(n1) {
      case 0:
        figura = " de trebol";
        break;
      case 1:
        figura = " de corazones";
        break;
      case 2:
        figura = " de diamantes";
        break;
      case 3:
        figura = " de picas";
      default:
    }
    
    String n = "";
    int n2 = ((int)(Math.random() * 13) + 1);
    
    switch(n2){
      case 1:
      n = "AS";
      case 2:
      n = "2";
      break;
      case 3:
      n = "3";
      break;
      case 4:
      n = "4";
      break;
      case 5:
      n = "5";
      case 6:
      n = "6";
      break;
      case 7:
      n = "7";
      break;
      case 8:
      n = "8";
      break;
      case 9:
      n = "9";
      case 10:
      n = "10";
      break;
      case 11:
      n = "J";
      break;
      case 12:
      n = "Q";
      break;
      case 13:
      n = "K";
      break;
      default:
      
    }
    
    System.out.println("La carta que ha salido al azar es el " + n + figura);
    
    
    
  }
}
