/**
 * 
 *
 * @author Adrián Egea Hermoso
 */
public class Tema04Ejercicio15 {
  public static void main(String[] args) {
    
    System.out.println(" Programa que pinta una piramide con el caracter que introduzcas por teclado, pudiendo elegir en el menu, la dirección del vertice: ");
    
    
    System.out.println(" CARACTER DE RELLENO DE LA PIRAMIDE");
    System.out.println(" ----------------");
    System.out.print(" Elija que caracter desea utilizar: ");
    String c = System.console().readLine();
    System.out.println(" INLCINACIÓN DE LA PIRAMIDE");
    System.out.println(" ----------------");
    System.out.println(" 1. Vertice Arriba");
    System.out.println(" 2. Vertice Abajo");
    System.out.println(" 3. Vertice Izquierda");
    System.out.println(" 4. Vertice Derecha");
    System.out.print(" Elija una opción (1-4): ");
    
    
  
    int opcion = Integer.parseInt(System.console().readLine());
    
    switch (opcion) {
      case 1:
        System.out.println("  " + c);
        System.out.println(" " + c + c + c );
        System.out.print("" + c + c + c + c + c);
        break;
    
      case 2:
        System.out.println("" + c + c + c + c + c);
        System.out.println(" " + c + c + c );
        System.out.print("  " + c);
        break;
    
      case 3:
        System.out.println("   " + c);
        System.out.println("  " + c + c);
        System.out.println(" " + c + c + c);
        System.out.println("  " + c + c);
        System.out.print("   " + c);
        break;
        
      case 4:
        System.out.println(c + "   " );
        System.out.println(c + c + "  ");
        System.out.println(c + c + c + " ");
        System.out.println(c + c + "  ");
        System.out.print(c + "   ");
        break;
        
      default:
        System.out.print("\nLo siento, la opción elegida no es correcta.");
    }
  }
}
