// comer() baja el hambre y sube un poco la felicidad.
// jugar() sube la felicidad, pero baja la energía y sube el hambre.
// dormir() sube la energía, pero puede subir un poco el hambre.
// Ningún valor debe pasar de 100 ni bajar de 0.
// qué tal si haces un juego de ajedrez en consola, pero usa clases, herencia y organización de archivo

public class SistemaEntrenador {
    static void main(String[] arg) {

        Mascota venus = new Mascota("Venus", 100, 0, 100);
        Entrenador maxii = new Entrenador("Maxii", 100, 0, 100, venus);

        maxii.mostrarEstado();
        maxii.mostrarMascota();
        maxii.dormir(maxii.hambre, maxii.energia);
        System.out.println("Despues de dormir ahora quiero comer");
        maxii.comer(Comidas.ASADO);
    }
}

enum Comidas {
    PAN,
    ASADO,
    CROQUETAS,
    POLLO,
    MEDIALUNA,
    FLAN,
}

abstract class SerVivoInterface {
    void dormir(int energia, int hambre) {
        energia = 100;
        if (hambre == 100) {
            System.out.println("Debo comer primero");
            return;
        } else {
            hambre += 5;
        }
    }

    void comer(Comidas comida) {

    };

    void mostrarEstado() {

    };

}

abstract class SerVivo extends SerVivoInterface {
    // ATRIBUTOS
    String nombre;
    int energia;
    int hambre;
    int felicidad;
}

class Mascota extends SerVivo {

    // CONSTRUTOR
    Mascota(String nombre,
            int energia,
            int hambre,
            int felicidad) {
        this.nombre = nombre;
        this.energia = energia;
        this.hambre = hambre;
        this.felicidad = felicidad;
    }

    // METODOS
    @Override
    void comer(Comidas comida) {
        if (hambre == 0) {
            System.out.println("Estoy bien gracias");
        } else if (comida == Comidas.CROQUETAS) {
            this.hambre -= 5;
        } else {
            System.out.println("LA MASCOTA NO PUEDE COMER ESO");
        }
    }

    void jugar() {
        if (this.felicidad == 100) {
            System.out.println("ESTOY BIEN YA NO QUIERO JUGA");
            return;
        } else {
            this.felicidad += 5;
        }

        if (this.energia == 0) {
            System.out.println("Yo deberia estar durmiendo");
            return;

        } else {
            this.energia -= 5;
        }

        if (this.hambre == 100) {
            System.out.println("Yo deberia estar comiendo");
            return;

        } else {
            this.hambre += 5;
        }
    }

    @Override
    void mostrarEstado() {
        System.out.println("La energia de tu mascota es: " + this.energia);
        System.out.println("La felicidad de tu mascota es: " + this.felicidad);
        System.out.println("El hambre de tu mascota es: " + this.hambre);
        System.out.println(" Y el nombre ya te lo sabes ");
    }
}

class Entrenador extends SerVivo {
    Mascota mascota;

    // CONSTRUCTOR
    Entrenador(String nombre,
            int energia,
            int hambre,
            int felicidad,
            Mascota mascota) {
        this.nombre = nombre;
        this.energia = energia;
        this.hambre = hambre;
        this.felicidad = felicidad;
        this.mascota = mascota;
    }

    // METODOS

    void alimentarMascota() {
        mascota.comer(Comidas.CROQUETAS);
    }

    void jugarConMascota() {
        mascota.jugar();
    }

    void mandarADormir() {
        mascota.dormir(energia, hambre);
    }

    void tomaMedicina() {
        mascota.felicidad -= 5;
    }

    void mostrarMascota() {
        mascota.mostrarEstado();
    }

    @Override
    void comer(Comidas comida) {
        if (hambre == 0) {
            System.out.println("Estoy bien gracias");
        } else if (comida != Comidas.CROQUETAS) {
            System.out.println("Gracias por la comida");
            this.hambre -= 5;
        } else {
            System.out.println("MANO ME VAS A DA` COMIDA DE PERRO??");
        }
    }

    @Override
    void mostrarEstado() {
        System.out.println(this.nombre + " tu energia es: " + this.energia);
        System.out.println(this.nombre + " tu felicidad es: " + this.felicidad);
        System.out.println(this.nombre + " tu hambre es: " + this.hambre);
    }

}

// Mascota mascota = new Mascota("Toby", 50, 40, 60);
// Entrenador entrenador = new Entrenador("Lucas", mascota);
