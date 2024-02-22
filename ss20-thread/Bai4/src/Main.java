public class Main {
    public static void main(String[] args) {
        NumberGenerator generator1 = new NumberGenerator();
        NumberGenerator generator2 = new NumberGenerator();

        Thread thread1 = new Thread(generator1);
        Thread thread2 = new Thread(generator2);

        // Gọi start() cho cả hai thread
        thread1.start();
        thread2.start();

        // Thay đổi độ ưu tiên của thread
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);
    }
}


class NumberGenerator implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Number: " + i + " - Thread ID: " + Thread.currentThread().getId() +
                    " - HashCode: " + this.hashCode());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

