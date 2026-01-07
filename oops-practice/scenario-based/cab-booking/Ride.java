class Ride {
    int rideId;
    User user;
    Driver driver;
    double distance;
    double fare;

    public Ride(int rideId, User user, Driver driver, double distance, double fare) {
        this.rideId = rideId;
        this.user = user;
        this.driver = driver;
        this.distance = distance;
        this.fare = fare;
    }

    @Override
    public String toString() {
        return "RideID: " + rideId +
                ", User: " + user.getName() +
                ", Driver: " + driver.getName() +
                ", Distance: " + distance +
                ", Fare: ₹" + fare;
    }
}
