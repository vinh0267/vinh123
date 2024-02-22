import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Tạo và khởi chạy thread
        RandomNumberThread randomNumberThread = new RandomNumberThread();
        randomNumberThread.start();
    }
}


class RandomNumberThread extends Thread {
    public void run() {
        // Phương thức run sẽ chứa mã để tạo số ngẫu nhiên và in ra màn hình
        Random random = new Random();
        int randomNumber = random.nextInt(100); // Số ngẫu nhiên từ 0 đến 99
        System.out.println("Random Number: " + randomNumber);
    }
}

