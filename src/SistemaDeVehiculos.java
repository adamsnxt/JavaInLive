// Creá un programa donde distintos vehículos puedan moverse, 
// cargar energía/combustible y mostrar información.

// Tenés que usar:

// Una clase abstracta.
// Dos interfaces.
// Al menos dos clases hijas.
// Una clase que implemente las dos interfaces.
// Polimorfismo.

public class SistemaDeVehiculos {
    public static void main(String[] args) {
        Vehiculo[] vehiculos = {
                new AutoElectrico("Tesla", 250),
                new Bicicleta("Aurora", 40),
                new Drone("DJI", 80)
        };
        for (Vehiculo v : vehiculos) {
            v.mostrarInfo();
            v.moverse();
            if (v instanceof AutoElectrico va) {
                va.recargar();
                va.conducir();
            } else if (v instanceof Drone vd) {
                vd.recargar();
            } else if (v instanceof Bicicleta vb) {
                vb.conducir();
            }
            System.out.println("-------------------\n");
        }
    }
}

interface Recargable {
    void recargar();
}

interface Conducible {
    void conducir();
}

abstract class Vehiculo {
    String marca;
    int velocidadMaxima;

    Vehiculo(String marca, int velocidadMaxima) {
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }

    abstract void moverse();

    void mostrarInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Velocidad maxima: " + velocidadMaxima);
    }
}

class AutoElectrico extends Vehiculo implements Recargable, Conducible {

    AutoElectrico(String marca, int velocidadMaxima) {
        super(marca, velocidadMaxima);
    }

    @Override
    void moverse() {
        System.out.println("El auto electrico se mueve por la carretera");
    }

    @Override
    public void recargar() {
        System.out.println("Recargando bateria del auto electrico");
    }

    @Override
    public void conducir() {
        System.out.println("Conduciendo auto electrico");
    }
}

class Bicicleta extends Vehiculo implements Conducible {
    Bicicleta(String marca, int velocidadMaxima) {
        super(marca, velocidadMaxima);
    }

    @Override
    void moverse() {
        System.out.println("La bicicleta avanza pedaleando");
    }

    @Override
    public void conducir() {
        System.out.println("Conduciendo bicicleta");
    }
}

class Drone extends Vehiculo implements Recargable {
    Drone(String marca, int velocidadMaxima) {
        super(marca, velocidadMaxima);
    }

    @Override
    void moverse() {
        System.out.println("El drone vuela por el aire");
    }

    @Override
    public void recargar() {
        System.out.println("Recargando bateria del drone");
    }
}
