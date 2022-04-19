import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 * 
 * @author Adrián Egea Hermoso
 */
public class PruebaFicheros5 {
    public static void main(String[] args) {

        final String DIAS[] = {"","lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo" };

        String ficheroOrigen = "numeros.txt";
        String ficheroDestino = "dias.txt";

        BufferedReader br;
        BufferedWriter bw;

        try {

            br = new BufferedReader(new FileReader(ficheroOrigen));
            bw = new BufferedWriter(new FileWriter(ficheroDestino));

            String linea = "";

            while (linea != null) {

                if(!linea.equals("")){
                    Integer numeroDia = Integer.parseInt(linea);
                    if((numeroDia >= 1) && (numeroDia <= 7)){
                        bw.write(DIAS[numeroDia] + "\n");
                    }else{
                        bw.write("Ese dia no existe" + "\n");
                    }
                    
                }
                
                

                // switch (linea) {

                //     case "1":
                //         System.out.println("Lunes");
                //         break;

                //     case "2":
                //         System.out.println("Martes");
                //         break;

                //     case "3":
                //         System.out.println("Lunes");
                //         break;

                //     case "4":
                //         System.out.println("Lunes");
                //         break;

                //     case "5":
                //         System.out.println("Lunes");
                //         break;

                //     case "6":
                //         System.out.println("Lunes");
                //         break;

                //     case "7":
                //         System.out.println("Lunes");
                //         break;

                // }

                linea = br.readLine();

            }

            br.close();
            bw.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
