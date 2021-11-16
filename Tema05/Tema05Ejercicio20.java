/**
 * 
 *
 * @author Adrián Egea Hermoso
 */
public class Tema05Ejercicio20 {
  public static void main(String[] args) {
    System.out.println("Realiza un programa que pinte una pirámide hueca por pantalla. La altura se debe pedir por teclado. El carácter con el que se pinta la pirámide también se debe pedir por teclado.");
    
    
    System.out.print("Introduzca la altura de la piramide: ");
    int altura = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca el caracter con el que quiere pintar la piramide: ");
    String c = System.console().readLine();
    
    //int base = 1;
    //int longitudDeLinea = 1;
    //int espacios = altura - 1;
    
    //while (base <= altura) {
      
      
      //// pinta la línea
      //for (int i = 1; i <= longitudDeLinea; i++) {
        //System.out.print(c);
      //}
      
      //// inserta espacios
      //for (int i = 1; i <= espacios; i++) {
        //System.out.print(" ");
      //}


      //System.out.println();

      //base++;
      //espacios--;
      //longitudDeLinea += 2;
    //}
  
  }
}
