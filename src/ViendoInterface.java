public class ViendoInterface {
    static void main(String[] arg) {
        InnerViendoInterface_1 objeto1 = new InnerViendoInterface_1("Uno", "Dos");

        objeto1.metodoUno();
        objeto1.metodoDos();
    }
}

interface Prueba {
    void metodoUno();

    void metodoDos();
}

interface Prueba2 {
    void metodoTres();
}

abstract class InnerViendoInterface implements Prueba {
    private String uno;
    private String dos;

    InnerViendoInterface(String uno,
            String dos) {
        this.uno = uno;
        this.dos = dos;
    }

    public void setUno(String uno) {
        if (!uno.isEmpty()) {
            this.uno = uno;
        } else {
            System.err.println("DIME COMO LO CONSIGO, AWO");
        }
    }

    public void setDos(String dos) {
        this.dos = dos;
    }

    public String getUno() {
        return uno;
    }

    public String getDos() {
        return dos;
    }

}

class InnerViendoInterface_1 extends InnerViendoInterface implements Prueba2 {

    InnerViendoInterface_1(String uno,
            String dos) {
        super(uno, dos);
    }

    @Override
    public void metodoUno() {
        System.out.println("HOLA BB");
    }

    @Override
    public void metodoDos() {
        setUno("");
        System.out.println(getUno());
    }

    @Override
    public void metodoTres() {

    }
}