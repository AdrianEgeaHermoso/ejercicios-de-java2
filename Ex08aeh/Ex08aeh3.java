public class Ex08aeh3 {
    public static void main(String[] args) {

        Trizum alan = new Trizum("666 12 34 56");
        Trizum eva = new Trizum("777 11 22 33");
        Trizum peluqueria = new Trizum("555 44 55 66");
        alan.envia(eva, 20, "Clase de piano");
        alan.envia(peluqueria, 8, "Corte de pelo");
        eva.envia(peluqueria, 25.30, "Cortar y teñir");
        eva.envia(alan, 6.55, "Compra conjunta oficina");
        System.out.println(alan);
        System.out.println(eva);
        System.out.println(peluqueria);

        

    }
}
