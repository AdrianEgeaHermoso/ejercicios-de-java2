import java.util.Scanner;

/**
 * 
 * 
 * @author Adrián Egea Hermoso
 */


public class Media {
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    // nota1 = s.nextInt(); de esta manera pide los datos en la misma linea separados por un espacio
    //s.nextDouble();
    //s.next();

    System.out.print("Introduzca la nota del primer examen ");  
    double nota1 = Double.parseDouble(s.nextLine());

    System.out.print("Introduzca la nota del primer examen ");  
    double nota2 = Double.parseDouble(s.nextLine());

    

    System.out.println("La nota media del trimestre es " + mediaTrimestre(nota1, nota2)); 

    
  }

  // Funciones ///////////////

  public static double mediaTrimestre(double notaControl1,double notaControl2){

    
    double resultado = notaControl1 * 0.4 + notaControl2 * 0.6;
    return resultado;

  }
}
