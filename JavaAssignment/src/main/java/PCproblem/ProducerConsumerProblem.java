package PCproblem;

public class ProducerConsumerProblem {
    public static void main(String[] args) throws InterruptedException {
        SharedBuffer buffer=new SharedBuffer();
        Producer p=new Producer(buffer);
        Consumer c=new Consumer(buffer);
        Thread t1=new Thread(p);
        Thread t2=new Thread(c);
        t1.start();
        t2.start();
        t1.join();
        t2.join();

    }
}
