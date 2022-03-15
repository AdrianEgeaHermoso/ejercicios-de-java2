public class Pecera {

        String nombre;
        private int litros;
        private Pez[] peces;
        private int numeroDePeces = 0;
      
        public Pecera(String nombre, int litros) {
          this.nombre = nombre;
          this.litros = litros;
          this.peces = new Pez[this.litros * 4];
        }
      
        public void mete(Pez nuevoPez) {
          if (this.numeroDePeces < peces.length) {
            peces[this.numeroDePeces++] = new Pez(nuevoPez.getNombre(), nuevoPez.getColor(),nuevoPez.getRaza());
          } else {
            System.out.println("Pecera llena, no se pueden meter más peces.");
          }
        }
        
        @Override
        public String toString() {
          String resultado = this.nombre + " de " + this.litros + " litros ";
          resultado += "contiene " + this.numeroDePeces + " peces:\n";
          
          for (int i = 0; i < this.numeroDePeces; i++) {
            resultado += peces[i].toString() + "\n";
          }
          
          return resultado;
        }
    
}
