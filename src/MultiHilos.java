public class MultiHilos {

    public static void main(String[] args) {
        MultiHilos_1 clase1 = new MultiHilos_1();
        MultiHilos_2 clase2 = new MultiHilos_2();

        clase2.start();
        clase1.run();

    }
}

class MultiHilos_1 {

    void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                if (i == 4) {
                    Thread.sleep(300);
                    continue;
                }

                System.out.println(i);
                Thread.sleep(300);
            }
        } catch (Exception e) {
            System.out.println("no se pudo");
        }

    }
}

class MultiHilos_2 extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(900);
            System.out.println(4 + " <- Segundo hilo mete el 4");
        } catch (Exception e) {
            System.out.println("no se pudo");
        }
    }
}
