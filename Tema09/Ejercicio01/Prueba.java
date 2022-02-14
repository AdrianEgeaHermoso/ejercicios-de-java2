public class Prueba {
    public static void main(String[] args) {

        Caballo caballo1 = new Caballo();
        Caballo caballo2 = new Caballo("Potosi", "arabe", 170, 120,65);


        System.out.println(caballo2.getNombre());

        caballo1.cabalga();
        caballo2.rapidez();



        
    }
}
