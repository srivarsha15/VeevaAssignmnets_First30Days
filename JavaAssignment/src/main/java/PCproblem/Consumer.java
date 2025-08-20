package PCproblem;

public class Consumer implements Runnable{
    SharedBuffer b;
    Consumer(SharedBuffer b){
        this.b=b;
    }
    @Override
    public void run() {
        try {
            b.consumer();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

