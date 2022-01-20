package misfunciones;
/**
 * 
 * funciones de realizacion de figuras
 * @author Adrián Egea Hermoso
 */

public class Figuras {

  /**
   * Crea una linea con asteriscos de una longitud determinada
   * @param longitud valor para la longitud de la linea
   * @return una linea de asteriscos
   */
  public static String linea(int longitud) {

    String resultado="";

    for (int i = 0; i < longitud; i++) {

      resultado += "*";
      
    }

    return resultado;
    
  }

  /**
   * 
   * @param longitud
   * @param extremo
   * @param relleno
   * @return
   */
  public static String linea(int longitud,char extremo,char relleno) {

    String resultado="";
    

    for (int i = 1; i <= longitud; i++) {
      resultado += (i == 1) || (i == longitud) ? extremo : relleno;
    }

    return resultado;
  }

  /**
   * Pinta espacios en la funcion linea
   * @param longitud
   * @return
   */
  public static String espacios(int longitud){
    return linea(longitud,' ',' ');
  }


}
