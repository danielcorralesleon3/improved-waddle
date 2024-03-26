import java.util.ArrayList;
import java.util.List;

public class App {
    private List<Usuario> usuarios;
    private List<Libro> listaLibros;

    public App() {
        this.usuarios = new ArrayList<>();
        this.listaLibros = new ArrayList<>();
    }

    public void registrarUsuario(int id, String nombre, String correo) {
        Usuario usuario = new Usuario(id, nombre, correo);
        usuarios.add(usuario);
    }

    public void añadirLibro(int id, String titulo, String autor) {
        Libro libro = new Libro(id, titulo, autor);
        listaLibros.add(libro);
    }

    public List<Usuario> getUsuario() {
        return usuarios;
    }

    public List<Libro> getListaLibros() {
        return listaLibros;
    }

    public void eliminarUsuario(int id){
        for (int i = 0; i < usuarios.size(); i++) {
            if (id==usuarios.get(i).getId()) {
            usuarios.remove(i);
            }
        }
    }
}
