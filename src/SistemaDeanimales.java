// Ejercicio: Sistema De Animales
// Creá una clase abstracta llamada Animal.
// Tiene que tener:
public class SistemaDeanimales {
    public static void main(String[] args) {
        Animal[] animales = {
                new Perro("Firulais", 4),
                new Gato("Michi", 2),
                new Vaca("Lola", 6)
        };

        for (Animal animal : animales) {
            animal.mostrarInfo();
            animal.hacerSonido();
        }
    }
}

abstract class Animal {
    // Atributos
    String nombre;
    int edad;

    // Contructor
    Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Metodos
    void mostrarInfo() {
        System.out.println(this.nombre);
        System.out.println(this.edad);
    }

    abstract void hacerSonido();
}

class Perro extends Animal {
    Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    void hacerSonido() {
        System.out.println("LADRA (guau)");
    }
}

class Gato extends Animal {
    Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    void hacerSonido() {
        System.out.println("mauya (miau)");
    }
}

class Vaca extends Animal {
    Vaca(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    void hacerSonido() {
        System.out.println("muje (muuu)");
    }
}
