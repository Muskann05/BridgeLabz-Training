class Driver {
    private int driverId;
    private String name;
    private boolean available;

    public Driver(int driverId, String name, boolean available) {
        this.driverId = driverId;
        this.name = name;
        this.available = available;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean status) {
        this.available = status;
    }

    public String getName() {
        return name;
    }
}
