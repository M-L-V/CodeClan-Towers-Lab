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
}
