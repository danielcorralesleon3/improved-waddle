package ent.ejercicio;

public class Usuario {
    private int id;
    private String nombre;
    private String correo;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return this.correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

public Usuario(int id,String nombre,String correo){
    this.id=id;
    this.correo=correo;
    this.nombre=nombre;
}
}
