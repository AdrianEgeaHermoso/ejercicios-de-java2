/**
 * 
 *
 * @author Adrián Egea Hermoso
 */
public class Tema05Ejercicio21 {
  public static void main(String[] args) {
    System.out.println(" Realiza un programa que vaya pidiendo números hasta que se introduzca un numero negativo y nos diga cuantos números se han introducido, la media de los impares y el mayor de los pares. El número negativo sólo se utiliza para indicar el final de la introducción de datos pero no se incluye en el cómputo. ");
    
    int numeroIntroducido = 0;
    int numeros = 0;
    int suma = 0;
    int pares = 0;
    int impares = 0;
    int numerosImpares = 0;
    int maxPar = 0;
    
    System.out.println("Introduzca varios números positivos para saber su media, e introduzca un número negativo para dejar de introducir números: ");
    
    while(numeroIntroducido >=0){
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      numeros ++;
      
      if ((numeroIntroducido % 2) != 0 ){
        suma += numeroIntroducido;
        numerosImpares ++;
      }else{
      if (numeroIntroducido > maxPar){
        maxPar = numeroIntroducido;
        
      }
      }
    }
    System.out.println("Se han introducido " + (int)(numeros - 1) + " números");
    System.out.println("La media de los números impares es " + (suma / numerosImpares));
    System.out.println("De los pares, el mayor introducido es " + maxPar);
    
  
  }
}
