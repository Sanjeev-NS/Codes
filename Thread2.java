
class csi extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i * 5);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {

            }
        }
    }
}

class nec extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("NEC");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {

            }
        }
    }
}

class Thread2 {
    public static void main(String args[]) throws InterruptedException {
        csi c = new csi();
        nec n = new nec();
        c.start();
        n.start();

        c.join();
        n.join();
        System.out.println("END!!!");
    }
}