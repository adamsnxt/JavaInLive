import java.util.ArrayList;
import java.util.Scanner;

class Persona {
    private String nombre;
    private int edad;

    Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Get
    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    // set
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}

public class Main {

    static Persona[] obtenerPersonasMayores(ArrayList<Persona> lista) {
        Persona[] arr = new Persona[lista.size()];
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getEdad() >= 18) {
                arr[i] = lista.get(i);
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Persona> lista = new ArrayList<>();
        System.out.println("Cuantas personas son ?");
        int cantidad = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Dame nombre: ");
            String nombre = sc.nextLine();
            System.out.println("Dame edad: ");
            int edad = sc.nextInt();
            sc.nextLine();
            lista.add(new Persona(nombre, edad));
        }

        for (Persona p : lista) {
            System.out.println(p.getNombre());
        }

        Persona[] mayores = obtenerPersonasMayores(lista);

        for (int i = 0; i < mayores.length; i++) {
            if (!(mayores[i] == null)) {
                System.out.println("Nombre: " + mayores[i].getNombre());
                System.out.println("Edad: " + mayores[i].getEdad());
            }
        }
        sc.close();
    }
}