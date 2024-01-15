package HotelReservation;

public class ClassReservation {
	
	    private String guestName;
	    private Room bookedRoom;
	    private String checkInDate;
	    private String checkOutDate;

	    public ClassReservation(String guestName, Room bookedRoom, String checkInDate, String checkOutDate) {
	        this.guestName = guestName;
	        this.bookedRoom = bookedRoom;
	        this.checkInDate = checkInDate;
	        this.checkOutDate = checkOutDate;
	    }

	    public String getGuestName() {
	        return guestName;
	    }

	    public Room getBookedRoom() {
	        return bookedRoom;
	    }

	    public String getCheckInDate() {
	        return checkInDate;
	    }

	    public String getCheckOutDate() {
	        return checkOutDate;
	    }
	}
