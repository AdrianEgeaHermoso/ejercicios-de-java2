/**
 * 
 *
 * @author Adrián Egea Hermoso
 */
public class Tema05Ejercicio14 {
  public static void main(String[] args) {
    System.out.println(" Escribe un programa que pida una base y un exponente (entero positivo) y que calcule la potencia. ");
    
    //int resultado = 0;
    
    System.out.println("Introduzca la base: ");
    int base = Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduzca el exponente: ");
    int exponente = Integer.parseInt(System.console().readLine());
    
    double potencia = 1;
        
    
    
      for (int i = 0; i < exponente; i++) {
        potencia *= base;
      }
    

    System.out.println(base + "^" + exponente + " = " + potencia);
    
    //do {
      //resultado = (base * base);
      //i++;
    //} while (i < exponente);
    
    //for (int i = 0; i < exponente; i++) {
      //resultado = base * base;
      
    //}
    
    
    //while(i <= exponente){
      //i ++;
      //resultado = base * exponente;}
      
    //System.out.println("" + resultado);
      
    
  
  }
}
