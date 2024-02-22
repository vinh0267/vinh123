public class SumCalculator implements Runnable {
    private int sum;

    public static void main(String[] args) {
        // Tạo một đối tượng SumCalculator
        SumCalculator sumCalculator = new SumCalculator();

        // Tạo một đối tượng Thread và chuyển SumCalculator vào nó
        Thread thread = new Thread(sumCalculator);

        // Bắt đầu thực thi luồng
        thread.start();

        try {
            // Chờ cho luồng kết thúc
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Tổng các số từ 1 đến 1000 là: " + sumCalculator.getSum());
    }

    @Override
    public void run() {
        sum = 0;
        for (int i = 1; i <= 1000; i++) {
            sum += i;
        }
    }
    public int getSum() {
        return sum;
    }
}