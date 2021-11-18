/**
 * Generación de números aleatorios.
 *
 *  @author Adrián Egea Hermoso
 */
public class FiguraAleatoria {
  public static void main(String[] args) {
    
    for (int i = 1; i <= 40; i++){
    switch((int)(Math.random() * 7)){
      case 0:
      System.out.print("🌴");
      break;
      case 1:
      System.out.print("🌴");
      break;
      case 2:
      System.out.print("🐈");
      break;
      case 3:
      System.out.print("🧎");
      break;
      default:
      System.out.print("_");
      
    }
  }
    
  }
}
