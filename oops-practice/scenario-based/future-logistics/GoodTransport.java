
public abstract class GoodTransport {
	protected String transportId;
	protected String transportDate;
	protected int transportRating;
	
	// Constructor
	public GoodTransport(String transportId, String transportDate, int transportRating) {
		this.transportId = transportId;
		this.transportDate = transportDate;
		this.transportRating = transportRating;
	}

    // getter setter methods to get attributes	
	public String getId() {
		return transportId;
	}
	public void setTransportId(String transportId) {
        this.transportId = transportId;
    }
	
	public String getDate() {
		return transportDate;
	}
	public void setTransportDate(String transportDate) {
        this.transportDate = transportDate;
    }
	
	public int getRating() {
		return transportRating;
	}
	public void setTransportRating(int transportRating) {
        this.transportRating = transportRating;
    }
	
	// abstract methods
	public abstract String vehicleSelection();
	
	public abstract float calculateTotalCharge();	
	
}

