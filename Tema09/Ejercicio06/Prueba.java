public class Prueba {

    public static void main(String[] args) {
    
   
        Tiempo t2 = new Tiempo(1,40,35);
        Tiempo t3 = new Tiempo(1,15,35);

        System.out.println(t2);

        Tiempo totalSuma = t2.suma(t3);
        System.out.println(totalSuma);

    }
}
