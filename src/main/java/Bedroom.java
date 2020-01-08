import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private int capacity;
    private String type;
    private ArrayList<Guest> guests;

    public Bedroom(int roomNumber, int capacity, String type){
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.type = type;
        this.guests = new ArrayList<Guest>();
    }

    public int getRoomNumber() {
        return this.roomNumber;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public String getType() {
        return new String(this.type);
    }

    public int guestCount(){
        return guests.size();
    }

    public void addGuest(Guest guest) {
        guests.add(guest);
    }

    public void removeGuest(Guest guest) {
        guests.remove(guests.indexOf(guest));
    }
}
