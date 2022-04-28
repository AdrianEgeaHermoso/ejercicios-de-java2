/**
 * 
 * 
 * @author Adrián Egea Hermoso
 */
public class Ex08aeh2 {
  public static void main(String[] args) {

    System.out.println(linea(5, '*', ' '));
    System.out.println(linea(5, '*', '*'));
    System.out.println(linea(6, 'X', '-'));
    System.out.println(linea(3, '&', '$'));
    System.out.println(linea(2, '&', '$'));
    System.out.println(linea(1, '&', '$'));
    System.out.println(linea(0, '&', '$'));
    System.out.println(linea(-3, '&', '$'));

    System.out.print("Por favor, introduzca la altura de la pirámide: ");
    int altura = Integer.parseInt(System.console().readLine());

    int espacios = altura - 1;
    int anchura = 1;

    for (int i = 1; i < altura; i++) {
      System.out.println(linea(espacios--, ' ', ' ') + linea(anchura, '*', ' '));
      anchura += 2;
    }

    System.out.println(linea(anchura, '*', '*'));
  }

  public static String linea(int longitud, char extremo, char relleno) {
    String resultado = "";

    for (int i = 1; i <= longitud; i++) {
      resultado += (i == 1) || (i == longitud) ? extremo : relleno;
    }

    return resultado;

  }
}
