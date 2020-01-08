import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private int capacity;
    private String type;
    private int rate;
    private boolean isBooked;
    private ArrayList<Guest> guests;

    public Bedroom(int roomNumber, int capacity, String type, int rate){
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.type = type;
        this.rate = rate;
        this.isBooked = false;
        this.guests = new ArrayList<Guest>();
    }

    public int getRoomNumber() {
        return this.roomNumber;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public String getType() {
        return this.type;
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

    public void clearGuests() {
        guests.clear();
    }

    public int rateOfRoom() {
        return this.rate;
    }

    public boolean checkIfBooked() {
        return this.isBooked;
    }

    public void bookSelf() {
        this.isBooked = true;
    }
}
