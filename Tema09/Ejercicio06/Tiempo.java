public class Tiempo {

    private int horas;
    private int minutos;
    private int segundos;


    
    public Tiempo(int horas, int minutos, int segundos) {
        this.segundos = segundos;
        this.minutos = minutos;
        this.horas = horas;
    }



    @Override
    public String toString() {
        return horas + "horas" +minutos + "minutos" + segundos + "segundos" ;
    }

    
    public Tiempo suma(Tiempo t){

        int segundosTotales = this.segundos + t.segundos;
        int minutosTotales = 0;

        if (segundosTotales >= 60){
            minutosTotales ++;
            segundosTotales -= 60;
        }
        
        minutosTotales = this.minutos + t.minutos;

        int horasTotales = 0;

        if(minutosTotales >= 60){
            horasTotales ++;
            minutosTotales -= 60;
        }

        horasTotales = this.horas + t.horas;

        return new Tiempo(horasTotales,minutosTotales,segundosTotales);

    }
}
