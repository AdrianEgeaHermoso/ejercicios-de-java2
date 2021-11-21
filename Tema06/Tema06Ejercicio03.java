/**
 * 
 *
 *  @author Adrián Egea Hermoso
 */
public class Tema06Ejercicio03 {
  public static void main(String[] args) {
    System.out.println("Igual que el ejercicio anterior pero con la baraja española.");
    
    String figura = "";
    int n1 = (int)(Math.random() * 4);
    
    switch(n1) {
      case 0:
        figura = " de espadas";
        break;
      case 1:
        figura = " de copas";
        break;
      case 2:
        figura = " de bastos";
        break;
      case 3:
        figura = " de oros";
      default:
    }
    
    String n = "";
    int n2 = ((int)(Math.random() * 10) + 1);
    
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
      n = "Sota";
      break;
      case 9:
      n = "Caballo";
      case 10:
      n = "Rey";
      break;
      default:
      
    }
    
    System.out.println("La carta que ha salido al azar es el " + n + figura);
    
    
    
  }
}
