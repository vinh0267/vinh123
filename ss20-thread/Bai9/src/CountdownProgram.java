class CountdownThread extends Thread {
    @Override
    public void run() {
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000); // Đợi 1 giây (1000 milliseconds)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class CountdownProgram {
    public static void main(String[] args) {
        CountdownThread countdownThread = new CountdownThread();
        countdownThread.start();
    }
}
