public class MetodosCadenas {

    public static void main(String[] args) {
        
        String frase= "Hola, aquí estamos en clase estamos Programación. Ahora estamos viendo indexOf.";

        //System.out.println("Resultado del charAt(): '" + frase.charAt(5)+ "'");

        /*for (int i = 0; i < frase.length(); i++) {
            
            System.out.print(frase.charAt(i));
            
        }*/
        //System.out.println(frase.indexOf("Hola"));
        System.out.println(miIndexOf(frase, "est", 5, 15));

        // Incluye el primer valor pero no el último.
        frase = frase.substring(0, 50);
        System.out.println(frase);
        /**
         * Devuelve la posicion de una palabra dentro de una cadena
         * dando el intervalo.
         * 
         */

        
    }
    public static int miIndexOf(String frase, String palabra, int menor, int mayor){

        int indice = frase.indexOf(palabra, menor);

        if((indice <= mayor) && (indice != -1)){

            return indice;

        } else{
            
            return -1;

        }
    }

}