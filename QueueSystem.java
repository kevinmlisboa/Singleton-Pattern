import java.util.LinkedList;
import java.util.Queue;

public class QueueSystem {
    private static QueueSystem instance;
    private int currentNumber;
    private int nextNumber;
    private Queue<Integer> queue;

    private QueueSystem() {
        this.currentNumber = 0;
        this.nextNumber = 1;
        this.queue = new LinkedList<>();
    }

    public static synchronized QueueSystem getInstance() {
        if (instance == null) {
            instance = new QueueSystem();
        }
        return instance;
    }

    public int issueTicket() {
        queue.add(nextNumber);
        return nextNumber++;
    }

    public int getCurrentNumber() {
        return currentNumber;
    }

    public int callNext() {
        if (!queue.isEmpty()) {
            currentNumber = queue.poll();
            return currentNumber;
        } else {
            System.out.println("Queue is empty.");
            return -1;
        }
    }

    public void resetQueue(int number) {
        this.currentNumber = 0;
        this.nextNumber = number;
        this.queue.clear();
        System.out.println("Queue has been reset to start from " + number);
    }

    public void displayQueueStatus() {
        System.out.println("Current Number: " + currentNumber);
        System.out.println("Next Number to be issued: " + nextNumber);
        System.out.println("People in queue: " + queue);
    }
}
