public class PagIbigApp {
    public static void main(String[] args) {
        QueueSystem queueSystem = QueueSystem.getInstance();
        
        HelpDeskStation desk1 = new HelpDeskStation("Desk 1");
        HelpDeskStation desk2 = new HelpDeskStation("Desk 2");
        HelpDeskStation desk3 = new HelpDeskStation("Desk 3");

        OnlineMonitoringSystem onlineMonitor = new OnlineMonitoringSystem();
        
        queueSystem.issueTicket();
        queueSystem.issueTicket();
        queueSystem.issueTicket();
        
        desk1.serveNextCustomer();
        desk2.serveNextCustomer();
        
        onlineMonitor.displayQueueStatus();
        
        desk3.resetQueue(5);
        
        onlineMonitor.displayQueueStatus();

        queueSystem.issueTicket();
        queueSystem.issueTicket();
        
        desk1.serveNextCustomer();
        desk2.serveNextCustomer();
        
        onlineMonitor.displayQueueStatus();
    }
}
