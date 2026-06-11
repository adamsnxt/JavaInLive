import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayAndList {
    public static void main(String[] args) {
        CreadoYRecorriendoUnArray.showArray();
        CreadoYRecorriendoUnaLista.showLinkedList();
        CreadoYRecorriendoUnaLista.showArrayList();
    }
}

class CreadoYRecorriendoUnArray {
    static void showArray() {
        String[] nombres = new String[3];
        String[] nombresListados = { "ana", "carlos", "juan" };

        for (int i = 0; i < nombres.length; i++) {
            nombres[i] = nombresListados[i];
        }

        for (int i = 0; i < nombres.length; i++) {
            if (nombres.length == 0) {
                System.out.println("No hay NA");
            } else {
                System.out.println(nombres[i]);
            }
        }
    }

}

class CreadoYRecorriendoUnaLista {
    static void showLinkedList() {
        List<String> nombres = new LinkedList<>();

        nombres.add("camila");
        nombres.add("tomas");
        nombres.add("nestor");

        String aVer = nombres.get(3);
        // La lista se recorre por nodos partiendo del primero
        // hasta llegar al indice solicitado
        // SIEMPRE PASA POR TODOS LOS INDICES -> *NODOS*

        // Por eso la escritura en LinkedList es cool, cambia la referencia en nodo
        // siguiente o anterior
        // y eso mejora el rendimiento de ESCRITURA pero es menos eficiente el la
        // LECTURA

        // camila -> tomas -> [[nestor]]
        System.out.println(aVer);
    }

    static void showArrayList() {
        List<String> nombres = new ArrayList<>();

        nombres.add("kisbel");
        nombres.add("belkis");
        nombres.add("joni");

        String aVer = nombres.get(3);
        // .get(i) en ArrayList Snipea/oneShotea el indice jajajjaja
        // Osea va directo al i sin tener que pasar por sus nodos
        // algo mas parecido a lo que hacemos con ARRAY nombres[i]

        // Por eso la lectura es mas delicious en ArrayList pero es minimamente
        // menos eficiente en escritura porque al meter un elemento debe reorganizar la
        // coleccion "Fisica"

        // [kisbel][belkis][[joni]]
        System.out.println(aVer);
    }

    // Regla del mundo real (Porcentaje de uso)
    // 95% ArrayList
    // 4%LinkedList

    // Si entiendes de porcentajes veras que hay un 1% perdido, este se divide en
    // otros tipos de Listas aun menos usados, los quiero.
}