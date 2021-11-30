/**
 * Ejemplo de uso de arrays
 * 
 * @author Luis José Sánchez
 */
public class Array01 {
  public static void main(String[] args) {
        
    int[] n; // se define n como un array de enteros
    n = new int[4]; // se reserva espacio para 4 enteros
    
    //int[] n = new int[4];
    
            
    n[0] = 26;
    n[1] = -30;
    n[2] = 0;
    n[3] = 100;
    
    for (int i = 0; i < n.length; i++) {
      System.out.println(n[i]);
    }
    
    
    System.out.print("Los valores del array n son los siguientes: ");
    System.out.print(n[0] + ", " + n[1] + ", " + n[2] + ", " + n[3]);
    
    int suma = n[0] + n[3];
    System.out.println("\nEl primer elemento del array más el último suman " + suma);
    
    ///////////////////////////////////////////////////////////////////////////////////////////////////
    
    //String[] frutas = {"chirimoya", "mandarina" , "mango", "manzana", "pera", "platano"};
    
    //for (int i = 0; i < frutas.length; i++) {
      //System.out.println(i + ":" + frutas[i]);
    //}
    
    
    String[] frutas = new String[6];
    
    //for (int i = 0; i < frutas.length; i++) {
      //System.out.println(i + ":" + frutas[i]);
    //}
    
    
    
    System.out.println("Introduzca 6 nombres de fruta y de INTRO");
    for (int i = 0; i < frutas.length; i++) {
      frutas[i] = System.console().readLine();
    }
    
    
    
    
    
    for (int i = 0; i < frutas.length; i++) {
      System.out.println(i + ":" + frutas[i]);
    }
    
    
    
    
    
    
    
    
    
  }
}
