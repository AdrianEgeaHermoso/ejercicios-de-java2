import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Ex08aeh1 {
  public static void main(String[] args) {
    if (args.length != 3) {
      System.out.println("Uso del programa: Ejercicio01 FICHERO1 MEZCLA FICHERO 2");
      System.exit(-1); // sale del programa
    }
    try {
      BufferedReader bf1 = new BufferedReader(new FileReader(args[0]));
      BufferedWriter bw = new BufferedWriter(new FileWriter(args[1]));
      BufferedReader bf2 = new BufferedReader(new FileReader(args[2]));
      
    
      String linea1 = "";
      String linea2 = "";
      
      while (linea1 != null) {
        linea1 = bf1.readLine();
        linea2 = bf2.readLine();
        
        if (linea1 != null) {
            linea1 = linea1.replace("caca", "xxxx");
            linea1 = linea1.replace("pedo","xxxx");
            linea1 = linea1.replace("culete","xxxxxx");
            linea1 = linea1.replace("pis","xxx");
            linea1 = linea1.replace("tonto","xxxxx");
            linea1 = linea1.replace("feo","xxx");
            bw.write(linea1 + "\n");
            //System.out.println(linea1 + "\n");
        }
      } 
    
      bf1.close();
      bf2.close();
      bw.close();
    
    } catch (IOException ioe) {
      System.out.println("Se ha producido un error de lectura/escritura");
      System.err.println(ioe.getMessage());
    }
  }
}