package HotelReservation;

public class Room {
	    private int number;
	    private String category;
	    private boolean isAvailable;
	
	    public Room(int number, String category) {
	        this.number = number;
	        this.category = category;
	        this.isAvailable = true;
	    }
	
	    public int getNumber() {
	        return number;
	    }
	
	    public String getCategory() {
	        return category;
	    }
	
	    public boolean isAvailable() {
	        return isAvailable;
	    }
	
	    public void bookRoom() {
	        isAvailable = false;
	    }
	
	    public void releaseRoom() {
	        isAvailable = true;
	    }
	}
