/**
 * 
 *
 * @author Adrián Egea Hermoso
 */
public class Tema05Ejercicio10 {
  public static void main(String[] args) {
    System.out.println(" Escribe un programa que calcule la media de un conjunto de números positivos introducidos por teclado. A priori, el programa no sabe cuántos números se introducirán. El usuario indicará que ha terminado de introducir los datos cuando meta un número negativo.: ");
    
    double numeroIntroducido = 0;
    double numeros = 0;
    double suma = 0;
    
    System.out.println("Introduzca varios números positivos para saber su media, e introduzca un número negativo para dejar de introducir números: ");
    
    while(numeroIntroducido >=0){
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      suma += numeroIntroducido;
      numeros ++;
    }
    
    System.out.println("La media de los números introducidos es " + ((suma - numeroIntroducido) / numeros));
    
  
  }
}
