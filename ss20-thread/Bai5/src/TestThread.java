public class TestThread {
    public static void main(String[] args) {
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();

        // Start thread Odd
        oddThread.start();

        try {
            // Sử dụng join để đảm bảo rằng thread Odd kết thúc trước khi thread Even bắt đầu
            oddThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Start thread Even
        evenThread.start();
    }
}


class OddThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i += 2) {
            System.out.println("Odd: " + i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class EvenThread extends Thread {
    public void run() {
        for (int i = 2; i <= 10; i += 2) {
            System.out.println("Even: " + i);
            try {
                Thread.sleep(15);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

