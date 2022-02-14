public class Fraccion {

    private int numerador;
    private int denominador;

    

    public Fraccion() {
    }



    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }



    public int getNumerador() {
        return numerador;
    }



    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }



    public int getDenominador() {
        return denominador;
    }



    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }


    public Fraccion invierte(){
        //int auxNum = this.numerador;
        //this.numerador = this.denominador;
        //this.denominador = auxNum;

        return new Fraccion(this.denominador,this.numerador);

    }



    @Override
    public String toString() {
        return denominador + "/" + numerador;
    }

    

    




    
}
