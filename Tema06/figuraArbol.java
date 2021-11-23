/**
 * 
 *
 *  @author Adrián Egea Hermoso
 */
public class figuraArbol {
  public static void main(String[] args) {
    
    System.out.print("Este ejercicio pinta un arbol de navidad. ");
    
    System.out.print("Introduzca la altura de la piramide: ");
    int altura = Integer.parseInt(System.console().readLine());
    
    //System.out.print("Introduzca el caracter con el que quiere pintar la piramide: ");
    //String c = System.console().readLine();
    
    
    
    // pintar la estrella
    
    for (int k = 0; k < altura; k++){
      System.out.print(" ");
      }
    System.out.println("⭐");
    
    
    
    // pintar espacios a la izquierda
    int espacios = altura;
    int espaciosInteriores = 1;
    
    
    for (int i = 1; i <= altura - 3; i++) {
      
      
      for (int j = 1; j <= espacios; j++) {
      
      System.out.print(" ");
      
      }
      
      System.out.println("/");
      
      //for(int j = 0; j < espaciosInteriores ; j++){
        //System.out.print(" ");
      //}
      
      espacios --;
    
    }
    
    // pintar el tronco del arbol
    
    for (int t = 0; t < altura; t++){
      System.out.print(" ");
      }
    System.out.println("#");
    for (int t = 0; t < altura; t++){
      System.out.print(" ");
      }
    System.out.println("#");
    
    
    // Pintar lo que pide el programa
    // pintar la peticion de altura
    // hacer tronco
    // pintar espacios
  }
}
