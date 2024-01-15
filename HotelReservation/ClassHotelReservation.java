package HotelReservation;

import java.util.Scanner;

public class ClassHotelReservation {
	    public static void main(String[] args) {
	        Hotel hotel = new Hotel("Sample Hotel");

	        // Add sample rooms to the hotel
	        hotel.addRoom(new Room(101, "Standard"));
	        hotel.addRoom(new Room(102, "Deluxe"));
	        hotel.addRoom(new Room(201, "Suite"));

	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("\nWelcome to " + hotel.getName() + " Reservation System");
	            System.out.println("1. Search for available rooms");
	            System.out.println("2. Make a reservation");
	            System.out.println("3. View booking details");
	            System.out.println("4. Exit");

	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    searchAvailableRooms(hotel);
	                    break;
	                case 2:
	                    makeReservation(hotel, scanner);
	                    break;
	                case 3:
	                    viewBookingDetails(hotel);
	                    break;
	                case 4:
	                    System.out.println("Thank you for using the reservation system. Goodbye!");
	                    scanner.close();
	                    System.exit(0);
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }
	    }

	    private static void searchAvailableRooms(Hotel hotel) {
	        System.out.println("\nAvailable Rooms:");

	        for (Room room : hotel.getRooms()) {
	            if (room.isAvailable()) {
	                System.out.println("Room " + room.getNumber() + " - " + room.getCategory());
	            }
	        }
	    }

	    private static void makeReservation(Hotel hotel, Scanner scanner) {
	        System.out.println("\nMake a Reservation:");

	        System.out.print("Enter your name: ");
	        String guestName = scanner.next();

	        System.out.print("Enter the room number: ");
	        int roomNumber = scanner.nextInt();

	        Room selectedRoom = findRoomByNumber(hotel, roomNumber);

	        if (selectedRoom != null && selectedRoom.isAvailable()) {
	            selectedRoom.bookRoom();

	            System.out.print("Enter check-in date: ");
	            String checkInDate = scanner.next();

	            System.out.print("Enter check-out date: ");
	            String checkOutDate = scanner.next();

	            ClassReservation reservation = new ClassReservation(guestName, selectedRoom, checkInDate, checkOutDate);
	            System.out.println("Reservation successful!");
	            System.out.println("Booking details:");
	            System.out.println("Guest: " + reservation.getGuestName());
	            System.out.println("Room: " + reservation.getBookedRoom().getNumber() + " - " +
	                    reservation.getBookedRoom().getCategory());
	            System.out.println("Check-in date: " + reservation.getCheckInDate());
	            System.out.println("Check-out date: " + reservation.getCheckOutDate());
	        } else {
	            System.out.println("Room not available or does not exist.");
	        }
	    }

	    private static void viewBookingDetails(Hotel hotel) {
	        System.out.println("\nBooking Details:");

	        for (Room room : hotel.getRooms()) {
	            if (!room.isAvailable()) {
	                System.out.println("Room " + room.getNumber() + " - " + room.getCategory());
	                System.out.println("Guest: Sample Guest");  // In a real system, fetch guest details from a database
	                System.out.println("Check-in date: Sample Check-in Date");
	                System.out.println("Check-out date: Sample Check-out Date");
	                System.out.println();
	            }
	        }
	    }

	    private static Room findRoomByNumber(Hotel hotel, int roomNumber) {
	        for (Room room : hotel.getRooms()) {
	            if (room.getNumber() == roomNumber) {
	                return room;
	            }
	        }
	        return null;
	    }
	}
