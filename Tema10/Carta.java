

public class Carta {

    private String figura;
    private String palo;


    private String [] f = {"as","dos","tres","cuatro","cinco","seis","siete","sota","caballo","rey"};
    private String [] p = {"espadas","oros","copas","bastos"};


    public Carta(String figura, String palo) {
        this.figura = f[(int)(Math.random()*10)];
        this.palo = p[(int)(Math.random()*4)];
    }

    @Override
    public String toString() {
        return figura + " de " + palo;
    }

    
    

    

}
