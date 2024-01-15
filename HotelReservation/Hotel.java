package HotelReservation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import HotelReservation.Room;

class Hotel {
    private String name;
    private List<Room> rooms;

    public Hotel(String name) {
        this.name = name;
        this.rooms = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }
}