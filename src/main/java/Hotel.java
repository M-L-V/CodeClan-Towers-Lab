import java.util.ArrayList;

public class Hotel {

    private String hotelName;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel (String hotelName, ArrayList<Bedroom> bedrooms, ArrayList<ConferenceRoom> conferenceRooms){
        this.hotelName = hotelName;
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
    }
}
