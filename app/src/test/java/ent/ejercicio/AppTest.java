package ent.ejercicio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

class AppTest {
    @Test
    void agregarUsuario(){
        App classUnderTest=new App();
        List<Usuario> Usuarios= classUnderTest.getUsuario();
        List<Usuario> Usuarios2= classUnderTest.getUsuario();
        Usuarios.add(new Usuario(1,"Dani","dani@gmail.com"));
        Usuarios2.add(new Usuario(1,"Dani","dani@gmail.com"));
        assertArrayEquals(Usuarios.toArray(), Usuarios2.toArray());
      
    }
    @Test
    void eliminarUsuario(){
        App classUnderTest=new App();
        classUnderTest.registrarUsuario(1, "Dani", "dani@gmail.com");
        List<Usuario> Usuarios = classUnderTest.getUsuario();
        Usuarios.add(new Usuario(1,"Dani","dani@gmail.com"));
        classUnderTest.eliminarUsuario(1);
        assertFalse(Usuarios.contains(new Usuario(1, "Dani", "dani@gmail.com")));
        }
    @Test
    void añadirLibro() {
        App classUnderTest = new App();
        classUnderTest.añadirLibro(1, "Principito", "Antoine de Saint-Exupéry"); 
        List<Libro> libros = classUnderTest.getListaLibros();
        assertFalse(libros.isEmpty());
        assertTrue(libros.contains(new Libro(1, "Principito", "Antoine de Saint-Exupéry")));

    }
    @Test
    void eliminarLibro() {
        App classUnderTest = new App();
        classUnderTest.añadirLibro(1, "Principito", "Antoine de Saint-Exupéry"); 
        List<Libro> libros = classUnderTest.getListaLibros();
        classUnderTest.eliminarLibro(1);
        assertFalse(libros.contains(new Libro(1, "Principito", "Antoine de Saint-Exupéry")));
    }
    @Test
    void listarLibros() {
        App classUnderTest = new App();
        classUnderTest.añadirLibro(1, "Principito", "Antoine de Saint-Exupéry"); 
        List<Libro> libros = classUnderTest.getListaLibros();
        classUnderTest.getListaLibros();
        assertFalse(libros.isEmpty());
        assertTrue(libros.contains(new Libro(1, "Principito", "Antoine de Saint-Exupéry")));
    }
    @Test
    void marcarComoLeido(){
        App classUnderTest = new App();
        classUnderTest.registrarUsuario(1, "Dani", "dani@gmail.com");
        classUnderTest.marcarComoLeido("Dani", 1, "Principito", "Antoine de Saint-Exupéry");
        List<Libro> librosLeidos = classUnderTest.getListaLibros();
        List<Usuario> Usuarios = classUnderTest.getUsuario();
        assertTrue(librosLeidos.contains(new Libro(1, "Principito", "Antoine de Saint-Exupéry")));
    }
    @Test
    void visualizarLibrosLeidos(){
        App classUnderTest = new App();
        classUnderTest.registrarUsuario(1, "Dani", "dani@gmail.com");
        classUnderTest.marcarComoLeido("Dani", 1, "Principito", "Antoine de Saint-Exupéry");
        List<Libro> librosLeidos = classUnderTest.getListaLibros();
        List<Usuario> Usuarios = classUnderTest.getUsuario();
        classUnderTest.getListaLibros();
        assertFalse(librosLeidos.isEmpty());
        assertTrue(librosLeidos.contains(new Libro(1, "Principito", "Antoine de Saint-Exupéry")));
    }
}

