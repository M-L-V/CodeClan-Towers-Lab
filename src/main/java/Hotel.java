import java.util.ArrayList;

public class Hotel {

    private String hotelName;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel (String hotelName, ArrayList<Bedroom> bedrooms, ArrayList<ConferenceRoom> conferenceRooms){
        this.hotelName = hotelName;
        this.bedrooms = bedrooms;
        this.conferenceRooms = conferenceRooms;
    }

    public String getHotelName() {
        return this.hotelName;
    }

    public int countBedrooms() {
        return this.bedrooms.size();
    }

    public int countConferenceRooms() {
        return this.conferenceRooms.size();
    }

    public void checkInGuest(Guest guest, Bedroom bedroom) {

        bedroom.addGuest(guest);
    }

    public void checkOutGuest(Guest guest, Bedroom bedroom) {
        bedroom.removeGuest(guest);
    }

    public Booking bookRoom(Bedroom bedroom, int numOfNights) {
        return new Booking(bedroom, numOfNights);
    }

    public ArrayList<Bedroom> getAvailableRooms() {
        ArrayList<Bedroom> availableRooms = new ArrayList<Bedroom>();
        for (Bedroom room : this.bedrooms) {
            if (!room.checkIfBooked()) {
                availableRooms.add(room);
            }
        }
        return availableRooms;
     }
}
