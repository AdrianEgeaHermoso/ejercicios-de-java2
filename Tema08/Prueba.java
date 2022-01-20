import misfunciones.Figuras;
import misfunciones.Matematicas;
import java.util.Scanner;
/**
 * 
 * 
 * @author Adrián Egea Hermoso
 */
public class Prueba {
  public static void main(String[] args) {

    //System.out.println(Matematicas.aleatorio(10, 20));
    //System.out.println(Figuras.linea(7));
    //System.out.println(Figuras.linea(-2,'&','$'));


    int x1 = 4;
    int x2 = 7;
    double x3 = 15.88;

    System.out.println(Matematicas.media(x1, x2, x3));



		
		
  
    Scanner s = new Scanner(System.in);
    System.out.print("Por favor, introduzca la altura de la pirámide: ");
    int altura = Integer.parseInt(s.nextLine());
    
    int espacios = altura - 1;
    int anchura = 1;
    
    for (int i = 1; i < altura; i++) {
      System.out.println(Figuras.linea(espacios--, ' ', ' ') + Figuras.linea(anchura, '&', ' '));
      anchura += 2;
    }
    
    System.out.println(Figuras.linea(anchura, '&', '$'));
  
    
    
    
    
    
    
  }
}
