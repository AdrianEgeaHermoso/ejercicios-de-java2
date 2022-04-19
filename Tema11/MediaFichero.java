import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

class MediaFichero {
    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new FileReader(args[0]));

            String linea = "0";
            int i = 0;
            double suma = 0;

            while (linea != null) {
                suma += Double.parseDouble(linea);
                i++;
                linea = br.readLine();
            }

            br.close();

            System.out.println("La Media es: " + suma / i);

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
