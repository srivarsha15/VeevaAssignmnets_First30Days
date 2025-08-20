package PCproblem;

public class Producer implements Runnable{
    SharedBuffer b;
    Producer(SharedBuffer b){
        this.b=b;
    }
    @Override
    public void run() {
        try {
            b.producer();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    }

