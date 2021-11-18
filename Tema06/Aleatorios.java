/**
 * Generación de números aleatorios.
 *
 *  @author Adrián Egea Hermoso
 */
public class Aleatorios {
  public static void main(String[] args) {
    System.out.println("Diez números aleatorios:\n");

    //for (int i = 1; i <= 21; i++) {
      //System.out.print("El alumno " + i + " ha sacado un ");
      ////System.out.println((int)(Math.random() * 11));
      ////System.out.println((int)(Math.random() * 10) + 1);
      //System.out.println((int)(Math.random() * 6) + 25); // de 0 a 6 + 25, entonces el minimo seria 25 y el maximo 30
    //}
    
    int figura = (int)(Math.random()*3);
    
    switch(figura){
      case 0:
      System.out.print("piedra");
      break;
      case 1:
      System.out.print("papel");
      break;
      case 2:
      System.out.print("tijera");
      break;
      default:
      
    }
    
  }
}
