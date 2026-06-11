// Sistema de biblioteca

// Crea un programa que modele una biblioteca simple.

// Debes crear al menos estas clases:

// Libro
// Usuario
// Biblioteca
// Requisitos

// Libro

// Atributos:
// titulo
// autor
// anio
// disponible
// Métodos:
// constructor
// getters y setters
// prestar()
// devolver()
// mostrarInfo()

// Usuario

// Atributos:
// nombre
// dni
// lista de libros prestados
// Métodos:
// constructor
// tomarPrestado(Libro libro)
// devolverLibro(Libro libro)
// mostrarLibrosPrestados()
// Biblioteca

// Atributos:
// lista de libros
// Métodos:
// agregarLibro(Libro libro)
// buscarLibroPorTitulo(String titulo)
// mostrarLibrosDisponibles()
// Reglas

// Un libro solo puede prestarse si está disponible.
// Cuando un usuario toma prestado un libro, el libro debe marcarse como no disponible.
// Cuando lo devuelve, debe volver a estar disponible.
// Un usuario no puede devolver un libro que no tiene.
// Extra opcional

// Agrega un límite de 3 libros prestados por usuario.

// Cuando lo termines, puedo revisártelo o darte una versión guía para comparar.

class POO {
    public static void main(String[] args) {

    }
}

class Libro {
    private String title_;
    private String autor_;
    private int year_;
    private boolean disponible_ = false;

    Libro(String title,
            String autor,
            int year,
            boolean disponible) {
        this.title_ = title;
        this.autor_ = autor;
        this.year_ = year;
        this.disponible_ = disponible;
    }

    // GETTERS

    public String getTitle_() {
        return title_;
    }

    public String getAutor_() {
        return autor_;
    }

    public int getYear_() {
        return year_;
    }

    public boolean isDisponible_() {
        return disponible_;
    }

    // SETTERS

    public void setAutor_(String autor_) {
        this.autor_ = autor_;
    }

    public void setDisponible_(boolean disponible_) {
        this.disponible_ = disponible_;
    }

    public void setTitle_(String title_) {
        this.title_ = title_;
    }

    public void setYear_(int year_) {
        this.year_ = year_;
    }

    // METODOS

    void prestar() {
        System.out.println((disponible_) ? "Toma tu libro" : "No puedo, tengo fulbo");
    }

    void devolver() {
        System.out.println("Gracias Compadre");
    }

    void mostrarInfo() {
        System.out.println("""
                Nombre: """ + title_ + """
                Autor: """ + autor_ + """
                año: """ + year_ + """
                Disponible: """ + disponible_);

    }
}

class Usuario {
    String nombre_;
    String dni_;
    String[] bookList_;

    Usuario(String nombre,
            String dni,
            String[] bookList) {
        bookList_ = bookList;
        nombre_ = nombre;
        dni_ = dni;
    }

    void tomarPrestado(Libro libro){
        
    }
}

class Biblioteca {

}

class Requisitos {

}
