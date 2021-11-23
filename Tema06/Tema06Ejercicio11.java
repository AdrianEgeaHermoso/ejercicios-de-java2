/**
 * 
 *
 *  @author Adrián Egea Hermoso
 */
public class Tema06Ejercicio11 {
  public static void main(String[] args) {
    System.out.println("Escribe un programa que muestre 20 notas generadas al azar. Las notas deben aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al final aparecerá el número de suspensos, el número de suficientes, el número de bienes, etc.");
    
    int suspensos = 0;
    int suficientes = 0;
    int bienes = 0;
    int notables = 0;
    int sobresalientes = 0;
    
    for (int i = 1; i <= 20; i++) {
    String nota = "";
    
    int n1 = (int)(Math.random() * 5);
    
    switch(n1) {
      case 0:
        nota = " SUSPENSO";
        suspensos ++;
        break;
      case 1:
        nota = " SUFICIENTE";
        suficientes ++;
        break;
      case 2:
        nota = " BIEN";
        bienes ++;
        break;
      case 3:
        nota = " NOTABLE";
        notables ++;
      case 4:
        nota = " SOBRESALIENTE";
        sobresalientes ++;
        break;
      default:
    }
      
      System.out.println(nota);
    
    }
    
    System.out.println(suspensos + " suspensos");
    System.out.println(suficientes + " suficientes");
    System.out.println(bienes + " bienes");
    System.out.println(notables + " notables");
    System.out.println(sobresalientes + " sobresalientes");
    
  }
}
