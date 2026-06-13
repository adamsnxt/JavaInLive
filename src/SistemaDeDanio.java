
public class SistemaDeDanio {
    public static void main(String[] args) {
        try {
            Persona adams = new Persona("Adams", 100);
            Auto auto1 = new Auto("Ferrari - Terreneitor", 60, 1000, "rojo");
            adams.mostrarInfo();
            auto1.arrollar(adams);
            adams.mostrarInfo();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}

abstract class SerVivo {
    int salud;

    SerVivo(int salud) throws Exception {
        if (salud > 0 && salud <= 100) {
            this.salud = salud;
        } else {
            throw new Exception("NO HAGAS ESO COMPADRE");
        }
    }

    void recibirDanio(int danio) {
        if (this.salud - danio < 0) {
            this.salud = 0;
        } else {
            this.salud -= danio;
        }
    };

}

class Persona extends SerVivo {
    String name;

    Persona(String name, int salud) throws Exception {
        this.name = name;
        super(salud);
    }

    void mostrarInfo() {
        System.out.println(this.name);
        System.out.println(this.salud);
    }

}

class Auto {
    String marca;
    int peso;
    int velocidad;
    String color;

    Auto(String marca,
            int velocidad,
            int peso,
            String color) {
        this.marca = marca;
        this.velocidad = velocidad;
        this.peso = peso;
        this.color = color;
    }

    void arrollar(SerVivo serVivo) {
        double danio;
        danio = peso * velocidad * 0.001;
        serVivo.recibirDanio((int) danio);
    }
}