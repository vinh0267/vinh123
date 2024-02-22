import java.util.Scanner;

class SleepThread extends Thread {
    private int sleepTime;

    public SleepThread(int sleepTime) {
        this.sleepTime = sleepTime;
    }

    @Override
    public void run() {
        System.out.println("Thread is going to sleep for " + sleepTime + " seconds.");
        try {
            Thread.sleep(sleepTime * 1000); // Ngủ trong số giây được nhập và chuyển đổi thành milliseconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread woke up after sleeping for " + sleepTime + " seconds.");
    }
}

public class SleepThreadProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số giây để thread ngủ: ");
        int sleepTime = scanner.nextInt();

        SleepThread sleepThread = new SleepThread(sleepTime);
        sleepThread.start();
        scanner.close();
    }
}
