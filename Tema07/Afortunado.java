/**
 * Ejemplo de uso de arrays
 * 
 * @author Luis José Sánchez
 */
public class Afortunado {
  public static void main(String[] args) throws InterruptedException{
        
    //int[] n; // se define n como un array de enteros
    //n = new int[4]; // se reserva espacio para 4 enteros
    
    ////int[] n = new int[4];
    
            
    //n[0] = 26;
    //n[1] = -30;
    //n[2] = 0;
    //n[3] = 100;
    
    //for (int i = 0; i < n.length; i++) {
      //System.out.println(n[i]);
    //}
    
    String[] alumnos = {
    
      "Aguilera Martín, Diego",

      "Andrés Domínguez, Javier",

      "Antúnez Pérez, David",

      "Benítez Ruíz, Jose Antonio",

      "Castillo Muñoz, Natalia",

      "Cueto Jiménez, Alejandro",

      "Dominguez Gomez, Sergio",

      "Egea Hermoso, Adrián",

      "García Campoy, Daniel",

      "González Pons, Verónica",

      "Linero Fernández, Álvaro",

      "Morales García, Sergio",

      "Moreno González, Alberto",

      "Moreno Rodríguez, Javier",

      "Parra Toval, Alberto",

      "Rodríguez Barcos, Diego",

      "Servia Morales, David",

      "San Juan Thomnmpson, Joseph Luca",

      "Sicilia Pérez, Francisco Javier",
    };
    
    
    System.out.print("El afortunado/a es: ");
    
    for (int i = 0; i < 6; i++) {
      Thread.sleep(1000);
      System.out.print(".");
      
    }
    
    
    
    String[] colores = {"\033[33m","\033[32m","\033[31m","\033[34m","\033[35m","\033[36m",};
    
    String color = colores[(int)(Math.random() * colores.length)];
    
    System.out.print(" " + color + alumnos[(int)(Math.random() * alumnos.length)]);
    
    
  }
}
