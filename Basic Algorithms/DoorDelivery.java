import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Vendor extends Thread {
    private TransportLorry transportLorry;

    public Vendor(TransportLorry transportLorry) {
        this.transportLorry = transportLorry;
    }

    public void run() {
        List<String> fruits = Arrays.asList("1", "2", "3", "4", "5", "6", "7",
                "8", "9", "10");
        for (String fruit : fruits) {
            System.out.println("Loading :" + fruit);
            transportLorry.load(fruit);

        }
    }
}

class User extends Thread {
    private TransportLorry transportLorry;

    public User(TransportLorry transportLorry) {
        this.transportLorry = transportLorry;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Unloaded :" + transportLorry.unload());
        }
    }
}

class TransportLorry {
    private List<String> goods = new ArrayList<>();
    private boolean empty = true;

    public synchronized void load(String goods) {
        while (!empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.goods.add(goods);
        empty = false;
        notify();
    }

    public synchronized String unload() {
        while (empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        String unloadedGoods = goods.remove(0);
        empty = goods.isEmpty();
        notify();
        return unloadedGoods;
    }
}

public class DoorDelivery {

    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        TransportLorry transportLorry = new TransportLorry();
        Vendor vendor = new Vendor(transportLorry);
        User user = new User(transportLorry);

        vendor.start();
        user.start();
        vendor.join();
        user.join();
        long end = System.currentTimeMillis();
        System.out.println("\nExec time: " + (end - start) + " ms");
    }
}