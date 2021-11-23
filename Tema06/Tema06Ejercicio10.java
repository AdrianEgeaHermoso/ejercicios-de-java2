/**
 * 
 *
 *  @author Adrián Egea Hermoso
 */
public class Tema06Ejercicio10 {
  public static void main(String[] args) {
    System.out.println("Realiza un programa que pinte por pantalla diez líneas formadas por caracteres. El carácter con el que se pinta cada línea se elige de forma aleatoria entre uno de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud aleatoria entre 1 y 40 caracteres.");
    
    
    
    for (int i = 1; i <= 10; i++) {
     
    int longitud = (int)(Math.random() * 40) + 1;
      
    String figura = "";
    
    int n1 = (int)(Math.random() * 6);
    
    switch(n1) {
      case 0:
        figura = " *";
        break;
      case 1:
        figura = " -";
        break;
      case 2:
        figura = " =";
        break;
      case 3:
        figura = " |";
      case 4:
        figura = " @";
        break;
      case 5:
        figura = " .";
      default:
    }
      for (int j = 1; j <= longitud; j++) {
      System.out.print(figura);
      }
      
      System.out.println("");
    
    }
    
    
  }
}
