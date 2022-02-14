public class Prueba {
    public static void main(String[] args) {

        Fraccion fraccion1 = new Fraccion(1,2);
        Fraccion fraccion2 = new Fraccion(2,4);


        Fraccion invertida = fraccion1.invierte();

        System.out.println(fraccion1.getNumerador() + "/" + fraccion1.getDenominador());
        System.out.println(invertida.getNumerador() + "/" + invertida.getDenominador());

        System.out.println(fraccion1);
        System.out.println(invertida);

        



        
    }
}
