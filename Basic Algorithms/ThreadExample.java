public class ThreadExample extends Thread {
    public static void main(String[] args) throws InterruptedException {
        ThreadExample t1 = new ThreadExample();
        t1.setName("A");
        t1.start();
        ThreadExample t2 = new ThreadExample();
        t2.setName("B");
        t2.start();
        ThreadExample t3 = new ThreadExample();
        t3.setName("C");
        t3.start();
        ThreadExample t4 = new ThreadExample();
        t4.setName("D");
        t4.start();
        ThreadExample t5 = new ThreadExample();
        t5.setName("E");
        t5.start();

    }

    public void run() {

        for (int i = 0; i < 2; i++) {
            String name = Thread.currentThread().getName();
            switch (name) {
                case "A": {
                    System.out.println(name + i);
                    break;
                }
                case "B": {
                    System.out.println(name + i);
                    break;
                }
                case "C": {
                    System.out.println(name + i);
                    break;
                }
                case "D": {
                    System.out.println(name + i);
                    break;
                }
                case "E": {
                    System.out.println(name + i);
                    break;
                }
            }

        }
    }
}
