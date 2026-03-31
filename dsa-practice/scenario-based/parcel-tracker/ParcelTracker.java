public class ParcelTracker {
    private StageNode head;
    // Add stage at end
    public void addStage(String stage) {
        StageNode newNode = new StageNode(stage);
        if (head == null) {
            head = newNode;
        } else {
            StageNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        System.out.println("Stage added: " + stage);
    }
    // Insert stage after a given stage
    public void addCheckpoint(String afterStage, String newStage) {
        StageNode temp = head;
        while (temp != null && !temp.stage.equalsIgnoreCase(afterStage)) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Checkpoint not found: " + afterStage);
        } else {
            StageNode newNode = new StageNode(newStage);
            newNode.next = temp.next;
            temp.next = newNode;
            System.out.println("Checkpoint added: " + newStage);
        }
    }
    // Forward tracking
    public void trackParcel() {
        if (head == null) {
            System.out.println("No tracking stages available.");
            return;
        }
        StageNode temp = head;
        System.out.println("Parcel Tracking Status:");
        while (temp != null) {
            System.out.println("-> " + temp.stage);
            temp = temp.next;
        }
    }
    // Handle lost/missing parcel (null pointer safety)
    public void checkForLoss() {
        if (head == null) {
            System.out.println("Parcel is lost. No tracking information found.");
        } else {
            System.out.println("Parcel is being tracked successfully.");
        }
    }
}
