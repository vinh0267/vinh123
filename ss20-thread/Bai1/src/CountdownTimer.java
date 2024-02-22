public class CountdownTimer extends Thread {
    public static void main(String[] args) {
        CountdownTimer countdownTimer = new CountdownTimer();

        // Bắt đầu thread đếm thời gian
        countdownTimer.start();
        //Khi gọi phương thức start(), nó sẽ tạo một luồng mới và gọi phương thức run() trên luồng đó.

        try {
            // Chờ cho thread đếm thời gian kết thúc (chờ 10 giây)
            countdownTimer.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Khi thread kết thúc, in ra thông báo
        System.out.println("Chương trình kết thúc.");
    }

    @Override
    public void run() {
        System.out.println("Bắt đầu đếm thời gian...");

        try {
            // Đếm thời gian trong 10 giây
            for (int i = 10; i > 0; i--) {
                System.out.println("Thời gian còn lại: " + i + " giây");
                Thread.sleep(1000); // Dừng 1 giây
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Đã hết thời gian. Chương trình kết thúc.");
    }
}
