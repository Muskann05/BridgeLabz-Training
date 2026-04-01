public class ParcelApp {
    public static void main(String[] args) {
        ParcelTracker tracker = new ParcelTracker();
        // add stage
        tracker.addStage("Packed");
        tracker.addStage("Shipped");
        tracker.addStage("In Transit");
        tracker.addStage("Delivered");
        // track parcel 
        tracker.trackParcel();
        // add check point
        tracker.addCheckpoint("Shipped", "At Warehouse");
        tracker.trackParcel();
        // check loss
        tracker.checkForLoss();
    }
}
