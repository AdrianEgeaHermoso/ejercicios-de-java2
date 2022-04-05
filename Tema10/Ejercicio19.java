import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Ejercicio19 {
    public static void main(String[] args) {
        
        HashMap<String,String> d = new HashMap<String,String>();

        d.put("caliente","hot");
        d.put("rojo","red");
        d.put("ardiente","hot");
        d.put("verde","green");
        d.put("agujetas","stiff");
        d.put("abrasador","hot");
        d.put("hierro","iron");
        d.put("grande","big");
        d.put("candente","hot");
        d.put("colorao","red");

        String palabraIntroducida = "";


       do{
           System.out.println("Introduzca una palabra para saber sus sinónimos");
           System.out.print("O escriba salir si desea salir: ");
           palabraIntroducida = System.console().readLine();

           if(!d.containsKey(palabraIntroducida)){
            System.out.println("Esa palabra no existe en el diccionario");
           }else{
            String significado = d.get(palabraIntroducida);
            System.out.print("Sinónimos de " + palabraIntroducida + ": ");

            
          ArrayList<String> sinonimos = new ArrayList<>();

          for (Map.Entry entrada : d.entrySet()) {
            if (!entrada.getKey().equals(palabraIntroducida)
                    && entrada.getValue().equals(significado)) {
              sinonimos.add((String) entrada.getKey());
            }
          }

          muestraLista(sinonimos);
          System.out.println("");

           }
       }while(!palabraIntroducida.equals ("salir"));


    }

    private static void muestraLista(ArrayList<String> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i));
            if (i < lista.size() - 1) {
              System.out.print(", ");
            }
          }
    }

}
