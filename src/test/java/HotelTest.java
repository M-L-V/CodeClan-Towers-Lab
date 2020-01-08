import org.junit.Before;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class HotelTest {

    private Hotel hotel;
    private Bedroom bedroom1;
    private Bedroom bedroom2;
    private ConferenceRoom conferenceRoom1;
    private ConferenceRoom conferenceRoom2;
    private Guest guest1;
    private Guest guest2;

    @Before
        public void before(){
        bedroom1 = new Bedroom(101, 2, "double");
        bedroom2 = new Bedroom(102, 1, "single");
        conferenceRoom1 = new ConferenceRoom( 50, "Mike Ritchie");
        conferenceRoom2 = new ConferenceRoom(60, "Grace Hopper");
        guest1 = new Guest("Sandy");
        guest2 = new Guest("Eugene");

        ArrayList<Bedroom> bedroomsList = new ArrayList<Bedroom>();
        bedroomsList.add(bedroom1);
        bedroomsList.add(bedroom2);

        ArrayList<ConferenceRoom> conferenceRoomsList = new ArrayList<ConferenceRoom>();
        conferenceRoomsList.add(conferenceRoom1);
        conferenceRoomsList.add(conferenceRoom2);

        hotel = new Hotel ("CodeClan Towers", bedroomsList, conferenceRoomsList);
    }

}
