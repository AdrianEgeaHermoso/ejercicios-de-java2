/**
 * 
 *
 * @author Adrián Egea Hermoso
 */
public class Ex08aeh1 {
  public static void main(String[] args) {
    
    System.out.print("Introduzca el PIN: ");
    
    int n = Integer.parseInt(System.console().readLine());
    
    
    if (n < 10){
      switch (n) {
      case 1:
        System.out.println("cero cero cero uno");
        break;
      case 2:
        System.out.println("cero cero cero dos");
        break;
      case 3:
        System.out.println("cero cero cero tres");
        break;
      case 4:
        System.out.println("cero cero cero cuatro");
        break;
      case 5:
        System.out.println("cero cero cero cinco");
        break;
      case 6:
        System.out.println("cero cero cero seis");
        break;
      case 7:
        System.out.println("cero cero cero siete");
        break;
      case 8:
        System.out.println("cero cero cero ocho");
        break;
      case 9:
        System.out.println("cero cero cero nueve");
        break;
      default:
      }
    }
      
    if ((n >= 10) && (n < 100)){
      
      int ultimaCifra = n%10;
      int penultimaCifra = ultimaCifra%10;
      switch (penultimaCifra) {
          case 1:
            System.out.println("cero cero uno " + ultimaCifra);
          break;
          case 2:
            System.out.println("cero cero dos " + ultimaCifra);
          break;
          case 3:
            System.out.println("cero cero tres " + ultimaCifra);
          break;
          case 4:
            System.out.println("cero cero cuatro " + ultimaCifra);
          break;
          case 5:
            System.out.println("cero cero cinco " + ultimaCifra);
          break;
          case 6:
            System.out.println("cero cero seis " + ultimaCifra);
          break;
          case 7:
            System.out.println("cero cero siete " + ultimaCifra);
          break;
          case 8:
            System.out.println("cero cero ocho " + ultimaCifra);
          break;
          case 9:
            System.out.println("cero cero nueve " + ultimaCifra);
          break;
        default:
      }
      
      }
      
    if ((n >= 100) && (n < 1000)){
      System.out.print("cero " + n);
      }
    
    if ((n >= 1000) && (n < 10000)){
      System.out.print(n);
      }
    
    
  }
}
