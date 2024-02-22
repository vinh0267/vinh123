public class Main {
    public static void main(String[] args) {
        SharedVariable sharedVariable = new SharedVariable();

        IncreaseThread increaseThread = new IncreaseThread(sharedVariable);
        DecreaseThread decreaseThread = new DecreaseThread(sharedVariable);

        increaseThread.start();
        decreaseThread.start();
    }
}

class SharedVariable {
    private int value = 0;

    public synchronized void increase() {
        value++;
    }

    public synchronized void decrease() {
        value--;
    }

    public synchronized int getValue() {
        return value;
    }
}

class IncreaseThread extends Thread {
    private SharedVariable sharedVariable;

    public IncreaseThread(SharedVariable sharedVariable) {
        this.sharedVariable = sharedVariable;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            sharedVariable.increase();
            System.out.println("Increased: " + sharedVariable.getValue());
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class DecreaseThread extends Thread {
    private SharedVariable sharedVariable;

    public DecreaseThread(SharedVariable sharedVariable) {
        this.sharedVariable = sharedVariable;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            sharedVariable.decrease();
            System.out.println("Decreased: " + sharedVariable.getValue());
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


