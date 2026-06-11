// Crea un pequeño sistema de personajes.

// La idea es que todos los personajes comparten datos 
// básicos, pero algunos tienen habilidades especiales.

public class SistemaDePersonaje {
    public static void main(String[] args) {
        Guerrero guerrero = new Guerrero("Thor", 100);
        Mago mago = new Mago("Merlin", 80);
        Clerigo clerigo = new Clerigo("Ana", 90);

        guerrero.mostrarInfo();
        guerrero.atacar();

        mago.mostrarInfo();
        mago.atacar();
        mago.lanzarHechizo();

        clerigo.mostrarInfo();
        clerigo.atacar();
        clerigo.curar();
        clerigo.lanzarHechizo();
    }

}

interface Curable {
    void curar();
}

interface Magico {
    void lanzarHechizo();
}

abstract class Personaje {
    String nombre;
    int vida;

    public void mostrarInfo() {
        System.out.println(this.nombre);
        System.out.println(this.vida);
    }

    abstract void atacar();
}

class Guerrero extends Personaje {

    Guerrero(String nombre,
            int vida) {
        this.nombre = nombre;
        this.vida = vida;
    }

    @Override
    void atacar() {
        System.out.println("TOMAAA (Ataca con una espada)");
    }
}

class Mago extends Personaje implements Magico {

    Mago(String nombre,
            int vida) {
        this.nombre = nombre;
        this.vida = vida;
    }

    @Override
    public void lanzarHechizo() {
        System.out.println("HACE SU ULTI (BOOM)");
    }

    @Override
    void atacar() {
        System.out.println("TOMAAA (Lanza bola de fuego)");
    }
}

class Clerigo extends Personaje implements Curable, Magico {
    Clerigo(String nombre,
            int vida) {
        this.nombre = nombre;
        this.vida = vida;
    }

    @Override
    public void lanzarHechizo() {
        System.out.println("HACE SU ULTI (BOOM)");
    }

    @Override
    public void curar() {
        System.out.println("RECUPERA LA MITAD DE LA VIDA");
    }

    @Override
    void atacar() {
        System.out.println("TOMAAA (Le lanza Poison)");
    }
}
