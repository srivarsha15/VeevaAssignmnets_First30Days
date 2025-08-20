package PCproblem;

import java.util.ArrayList;
import java.util.List;

public class SharedBuffer {
    List<Integer> buffer = new ArrayList<>();

    public synchronized void producer() throws InterruptedException {
        int capacity = 2;
        int i = 0;
        while (true) {
            System.out.println("Producer added - " + i);
            buffer.add(i);
            i++;
            Thread.sleep(1000);
            if (buffer.size() == capacity) {
                System.out.println("Buffer Capacity Reached,Producer goes to waiting stage");
                notify();
                wait();
            }
        }
    }

    public synchronized void consumer() throws InterruptedException {
        while (true) {
            System.out.println("Consumer removed - " + buffer.get(0));
            buffer.remove(0);
            Thread.sleep(1000);
            if (buffer.isEmpty()) {
                System.out.println("Buffer is Empty ,Consumer goes to waiting stage");
                notify();
                wait();
            }
        }
    }
}
