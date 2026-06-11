public class SistemaCafeteria {
    static void main(String[] arg) {
        Cliente kevin = new Cliente("Kevin", 10);
        Bebida cafeConLeche = new Bebida("Cafe con leche", 5, true);
        Bebida americano = new Bebida("Americano", 3, true);
        Bebida expresso = new Bebida("Expresso", 5.2, true);

        kevin.mostrarDinero();
        System.out.println("-------------------------------------------");
        cafeConLeche.mostrarInfo();
        System.out.println("-------------------------------------------");
        kevin.comprarBebida(cafeConLeche);
        System.out.println("-------------------------------------------");
        cafeConLeche.mostrarInfo();
        System.out.println("-------------------------------------------");
        kevin.mostrarDinero();
    }
}

class Bebida {
    String nombre;
    double precio;
    boolean disponible;

    // CONSTRUCTOR

    Bebida(String nombre,
            double precio,
            boolean disponible) {
        this.nombre = nombre;
        this.precio = precio;
        this.disponible = disponible;
    }

    // METODOS

    void vender() {
        if (this.disponible) {
            disponible = false;
        } else {
            System.out.println("La bebida no esta disponible");
        }
    }

    void reponer() {
        if (!this.disponible) {
            disponible = true;
            System.out.println(this.nombre + " se repuso");
        } else {
            System.out.println("Ya tenemos esa");
        }
    }

    void mostrarInfo() {
        System.out.println("Bebida: " + this.nombre);
        System.out.println("Precio: " + "$" + this.precio);
        System.out.println("Estado: " + ((disponible) ? "Está lista para vender" : "Esta bebida no esta disponible"));
    }
}

class Cliente {
    String nombre;
    double dinero;

    Cliente(String nombre,
            double dinero) {
        this.nombre = nombre;
        this.dinero = dinero;
    }

    void comprarBebida(Bebida bebida) {
        if (dinero >= bebida.precio) {
            bebida.vender();
            this.dinero -= bebida.precio;
            System.out.println(this.nombre + " compro un " + bebida.nombre);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    void mostrarDinero() {
        System.out.println((this.dinero <= 10) ? "ALERTA. ESTAS PELANDO BOLA TE QUEDAN " + this.dinero
                : (this.dinero >= 50) ? "Tienes " + this.dinero + " estas billetuo. por ahora..."
                        : "EPA te quedan " + this.dinero + " pendiente");
    }

    // EXTRA
    void recargarDinero(double cantidad) {

    }
}

class Cafeteria {
    String nombre;
    Bebida bebida1;
    Bebida bebida2;

    void mostrarBebidas() {

    }
}
