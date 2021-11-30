/**
 * 
 * 
 * @author Adrián Egea Hermoso
 */
public class Tema07Ejercicio04 {
  public static void main(String[] args) {
        
    
    int[] numero = new int[20];
    int[] cuadrado = new int[20];
    int[] cubo = new int[20];
    
    for (int i = 0; i < numero.length; i++) {
      numero[i] = ((int)(Math.random ()* 100));
      cuadrado[i] = numero[i] * numero[i];
      cubo[i] = cuadrado[i] * numero[i];
    }
    
 
    
    
    //for (int i = 0; i < numero.length; i++) {
      //System.out.println(numero[i]);
    //}
    //for (int i = 0; i < cuadrado.length; i++) {
      //System.out.println(cuadrado[i]);
    //}
    //for (int i = 0; i < cubo.length; i++) {
      //System.out.println(cubo[i]);
    //}
    
    
    for (int i = 0; i < 20; i++) {
      System.out.printf("%6d%6d%8d\n", numero[i], cuadrado[i], cubo[i]);
    }
    
    
 
    
    
    
  }
}
