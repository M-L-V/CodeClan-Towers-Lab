import java.util.ArrayList;

public class ConferenceRoom {


    private int capacity;
    private String roomName;
    private ArrayList<Guest> guests;


    public ConferenceRoom(int capacity, String roomName) {
        this.capacity = capacity;
        this.roomName = roomName;
        this.guests = new ArrayList<Guest>();

    }

    public int getCapacity() {
        return this.capacity;
    }

    public String getRoomName() {
        return this.roomName;
    }

    public int guestCount() {
        return guests.size();
    }

    public void addGuest(Guest guest) {
        guests.add(guest);
    }

    public void removeGuest(Guest guest) {
        guests.remove(guests.indexOf(guest));
    }

    public void clearGuests() {
        guests.clear();
    }


}
