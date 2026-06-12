// Mostrar todos los libros.
// Mostrar solo los libros disponibles, 
// es decir, los que no están prestados.
// Buscar libros por autor.
// Prestar un libro por título.
// Devolver un libro por título.
// Contar cuántos libros están prestados.
// Mostrar el libro más antiguo.

import java.util.ArrayList;
import java.util.List;

public class EjercicioList {
    public static void main(String[] args) {
        Biblioteca.prestarLibro("Monda");
        System.out.println("------------------------");
        Biblioteca.mostrarDisponibles();
        System.out.println("------------------------");
        Biblioteca.prestarLibro("Otro1");
        System.out.println("------------------------");
        Biblioteca.devolverLibro("Monda");
        System.out.println("------------------------");
        Biblioteca.buscarPorAutor("Jose");
    }
}

class Libro {
    String titulo;
    String autor;
    int anio;
    boolean prestado;

    public Libro(String titulo,
            String autor,
            int anio,
            boolean prestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.prestado = prestado;
    }

    @Override
    public String toString() {
        return "Libro: " + this.titulo + " Autor: " + this.autor + " Anio: " + this.anio
                + (this.prestado ? " Este libro no esta disponible" : " Libro disponible");
    }
}

class Biblioteca {
    static List<Libro> libros = new ArrayList<>();

    static {
        libros.add(new Libro("Monda", "Jose", 2026, false));
        libros.add(new Libro("Otro1", "Jose", 2026, false));
        libros.add(new Libro("Otro2", "jona", 2026, false));
    }

    static void prestarLibro(String name) {

        for (Libro e : libros) {
            if (e.titulo == name && !e.prestado) {
                System.out.println(e);
                e.prestado = true;
                break;
            }
        }
    };

    static void mostrarDisponibles() {
        for (Libro e : libros) {
            if (!e.prestado) {
                System.out.println(e);
            }
        }
    };

    static void devolverLibro(String name) {
        for (Libro e : libros) {
            if (e.titulo == name && e.prestado) {
                System.out.println(e);
                e.prestado = false;
                break;
            }
        }
    }

    static void buscarPorAutor(String autorName) {
        for (Libro e : libros) {
            if (e.autor.equals(autorName)) {
                System.out.println(e);
            }
        }
    }
}

// prestarLibro("El principito");
// mostrarDisponibles();
// devolverLibro("El principito");
// buscarPorAutor("Borges");
