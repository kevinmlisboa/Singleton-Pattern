public class HelpDeskStation {
    private String stationName;
    private QueueSystem queueSystem;

    public HelpDeskStation(String stationName) {
        this.stationName = stationName;
        this.queueSystem = QueueSystem.getInstance();
    }

    public void serveNextCustomer() {
        int nextCustomer = queueSystem.callNext();
        if (nextCustomer != -1) {
            System.out.println("Serving customer number " + nextCustomer + " at " + stationName);
        } else {
            System.out.println(stationName + ": No customers in queue.");
        }
    }

    public void checkQueueStatus() {
        System.out.println("Checking queue status at " + stationName + ":");
        queueSystem.displayQueueStatus();
    }

    public void resetQueue(int startingNumber) {
        System.out.println(stationName + ": Resetting queue to start from " + startingNumber);
        queueSystem.resetQueue(startingNumber);
    }
}
