public class NewMultiHilos {
    public static void main(String[] args) {
        InnerNewMultiHilos clase1 = new InnerNewMultiHilos();
        InnerNewMultiHilos2 clase2 = new InnerNewMultiHilos2();

        clase2.start();
        clase1.run();
    }
}

class InnerNewMultiHilos {
    void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
                Thread.sleep(100);
            }
        } catch (Exception e) {
            System.out.println("SE ROMPIO");
        }
    }
}

class InnerNewMultiHilos2 extends Thread {
    @Override
    public void run() {
        System.out.println("hola souy run metodo de una clase random parte 2");
    }
}
