/**
 * 
 * Programa de prueba con varias funciones
 * @author Adrián Egea Hermoso
 */


public class PruebaPrimo {
  public static void main(String[] args) {

    int [] numeros = new int [50];

    for (int i = 0; i < numeros.length; i++) {
        numeros[i] = aleatorio(1,100);
    }

    for (int n : numeros) {

        System.out.print(n + " ");
        
    }

    System.out.println("\nPrimos");

    for (int n : numeros) {

        if(esPrimo(n))

        System.out.print(n + " ");
        
    }

    
  }

  // Funciones ///////////////


  /**
   * Genera un valor entero aleatorio entre <code>inicio</code> y <code>fin</code>
   * 
   * @param inicio valor minimo a devolver
   * @param fin valor maximo a devolver
   * @return un numero aleatorio entre <code>inicio</code> y <code>fin</code>
   */
  public static int aleatorio(int inicio,int fin){

    return (int)(Math.random() * (fin - inicio + 1)) + inicio;

  }

  /**
   * Nos dice si un numero entero es primo o no
   * @param numero entero que se introduce para ver si es primo o no
   * @return <code>true</code> si es primo, <code>false</code> si no es primo
   */
  public static boolean esPrimo(int numero){


    boolean esPrimo = true;
    
    for (int i = 2; i < numero; i++) {
      if ((numero % i) == 0) {
        esPrimo = false;
      }
    }
        
    return esPrimo;
  }




}
