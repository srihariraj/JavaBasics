class College extends Thread {
    public synchronized void run() {
        for (int i = 1; i <= 8; i++) {
            System.out.println(i + "st period in college going on");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException IE) {
            }

            if (i == 4) {
                try {
                    synchronized (this) {
                        wait();
                    }
                } catch (InterruptedException E) {
                }
            }

        }
    }
}

class Culturals extends Thread {
    private College college;

    public Culturals(College college) {
        this.college = college;
    }

    public synchronized void run() {
        for (int x = 1; x <= 10; x++) {
            System.out.println(x + "th cultural event going on");
            try {
                Thread.sleep(500);
            } catch (InterruptedException E) {
            }
        }
        synchronized (college) {
            college.notifyAll();
        }
    }
}

public class ThreadExamples {
    public static void main(String[] args) throws InterruptedException {
        long msS = System.currentTimeMillis();
        College classroom = new College();
        classroom.start();
        Culturals cultural = new Culturals(classroom);
        cultural.start();

        classroom.join();
        cultural.join();
        long msE = System.currentTimeMillis();
        System.out.println((msE - msS) + "ms taken for execution");
    }
}
