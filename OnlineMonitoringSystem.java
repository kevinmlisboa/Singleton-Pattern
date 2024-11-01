public class OnlineMonitoringSystem {
    private QueueSystem queueSystem;

    public OnlineMonitoringSystem() {
        this.queueSystem = QueueSystem.getInstance();
    }

    public void displayQueueStatus() {
        System.out.println("---- Online Monitoring System ----");
        queueSystem.displayQueueStatus();
        System.out.println("----------------------------------");
    }

    public void displayNextInQueue() {
        int currentNumber = queueSystem.getCurrentNumber();
        System.out.println("Next customer to be served: " + (currentNumber + 1));
    }
}
