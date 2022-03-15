

public class Disco {

    private String codigo;
    private String autor;
    private String titulo;
    private String genero;
    private int duracion;


    public Disco(String codigo, String autor, String titulo, String genero, int duracion) {
        this.codigo = codigo;
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
    }

    


    public String getCodigo() {
        return codigo;
    }




    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }




    public String getAutor() {
        return autor;
    }




    public void setAutor(String autor) {
        this.autor = autor;
    }




    public String getTitulo() {
        return titulo;
    }




    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }




    public String getGenero() {
        return genero;
    }




    public void setGenero(String genero) {
        this.genero = genero;
    }




    public int getDuracion() {
        return duracion;
    }




    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }




    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
        return result;
    }




    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Disco other = (Disco) obj;
        if (codigo == null) {
            if (other.codigo != null)
                return false;
        } else if (!codigo.equals(other.codigo))
            return false;
        return true;
    }




    @Override
    public String toString() {
        return "Codigo: " + codigo + " \nAutor: " + autor + " \nDuracion: " + duracion + " mins " + " \nGenero: " + genero
                + " \nTitulo: " + titulo + "\n";
    }



    

    

}
