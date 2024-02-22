class PrimeFinderThread extends Thread {
    private int start;
    private int end;

    public PrimeFinderThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    private boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

public class PrimeFinderProgram {
    public static void main(String[] args) {
        int rangeStart = 1;
        int rangeEnd = 10000;

        int numThreads = 4;

        // Tính khoảng giá trị cho mỗi thread
        int step = (rangeEnd - rangeStart + 1) / numThreads;

        // Mảng lưu trữ các đối tượng PrimeFinderThread
        PrimeFinderThread[] threads = new PrimeFinderThread[numThreads];

        // Tạo và bắt đầu các thread
        for (int i = 0; i < numThreads; i++) {
            int threadStart = rangeStart + i * step;
            int threadEnd = (i == numThreads - 1) ? rangeEnd : threadStart + step - 1;
            threads[i] = new PrimeFinderThread(threadStart, threadEnd);
            threads[i].start();
        }

        // Đợi cho tất cả các thread hoàn thành trước khi kết thúc chương trình
        for (PrimeFinderThread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
