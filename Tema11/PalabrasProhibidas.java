
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * ejercicio de palabras prohibidas.Tendremos un fichero original con palabras
 * prohibidas (las que queramos) y la vamos a cambiar por "x"
 */
public class PalabrasProhibidas {

    public static void main(String[] args) {

        try {

            BufferedReader bf = new BufferedReader(new FileReader("texto-normal.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("texto-censurado.txt"));

            String linea = "";

            while (linea != null) {

                linea = bf.readLine();

                if (linea != null) {

                    linea = linea.replace("puton", "xxxxx");
                    linea = linea.replace("hijode","xxxxxx");
                    linea = linea.replace("cabron","xxxxxx");
                    //bw.write(linea + "\n");
                    System.out.println(linea + "\n");

                }
            }
            bf.close();
            bw.close();

        } catch (Exception e) {

            // TODO: handle exception

            System.out.print("Ha ocurrido un error");
        }
    }

}
