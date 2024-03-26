package ent.ejercicio;

public class Libro {
    private int id;

 
    private String titulo;
    private String autor;

    public Libro(int id,String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }
    public int getId() {
        return this.id;
    }
 
}
