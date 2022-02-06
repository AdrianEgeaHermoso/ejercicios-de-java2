package misfunciones;

/**
 * 
 * Funciones Matematicas
 * 
 * @author Adrián Egea Hermoso
 */
public class Matematicas {

  /**
   * Genera un valor entero aleatorio entre <code>inicio</code> y <code>fin</code>
   * 
   * @param inicio valor minimo a devolver
   * @param fin    valor maximo a devolver
   * @return un numero aleatorio entre <code>inicio</code> y <code>fin</code>
   */
  public static int aleatorio(int inicio, int fin) {

    return (int) (Math.random() * (fin - inicio + 1)) + inicio;

  }

  /**
   * Nos dice si un numero entero es primo o no
   * 
   * @param numero entero que se introduce para ver si es primo o no
   * @return <code>true</code> si es primo, <code>false</code> si no es primo
   */
  public static boolean esPrimo(int numero) {

    boolean esPrimo = true;

    for (int i = 2; i < numero; i++) {
      if ((numero % i) == 0) {
        esPrimo = false;
      }
    }

    return esPrimo;
  }

  /**
   * Calcula la media de tres números.
   * 
   * @param n1
   * @param n2
   * @param n3
   * @return el resultado de la media de tres números.
   */
  public static double media(double n1, double n2, double n3) {

    return (n1 + n2 + n3) / 3;
  }

  /**
   * Indica el número de dígitos introducidos por teclado.
   * 
   * @param numero número introducido para comprobar los dígitos que tiene.
   * @return número de dígitos introducidos.
   */
  public static int digitos(int numero) {

    int resultado = 0;

    while (numero > 0) {

      numero = numero / 10;

      resultado++;
    }

    return resultado;

  }

  /**
   * Se introduce una base y un exponente para saber el resultado de la potencia
   * de ese número.
   * 
   * @param numero
   * @return el resultado de la potencia del número introducido.
   */
  public static int potencia(int base, int exponente) {

    int resultado = 1;
    for (int i = 0; i < Math.abs(exponente); i++) {

      resultado = resultado * base;
    }

    return resultado;
  }

  /**
   * Le da la vuelta a un número entero introducido.
   * 
   * @param numero
   * @return El resultado volteado del número introducido.
   */
  public static int voltea(int numero) {

    int volteado = 0;

    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero = numero / 10;
    }

    return volteado;

  }

  /**
   * Nos dice si el número introducido es capicua o no.
   * @param numero
   * @return Devuelve verdadero o falso si es capicua o no el número introducido.
   */
  public static boolean esCapicua(int numero) {
    return numero == voltea(numero);
  }


  

}
