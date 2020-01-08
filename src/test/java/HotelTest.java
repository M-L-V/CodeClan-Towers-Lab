import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

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
        bedroom1 = new Bedroom(101, 2, "double", 30);
        bedroom2 = new Bedroom(102, 1, "single", 40);
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

    @Test
    public void canGetHotelName(){
        assertEquals("CodeClan Towers", hotel.getHotelName());
    }

    @Test
    public void canCountBedrooms(){
        assertEquals(2, hotel.countBedrooms());
    }

    @Test
    public void canCountConferenceRooms(){
        assertEquals(2, hotel.countConferenceRooms());
    }

    @Test
    public void canCheckIntoRoom(){
        hotel.checkInGuest(guest1, bedroom1);
        assertEquals(1, bedroom1.guestCount());
    }

    @Test
    public void canCheckOutOfRoom(){
        hotel.checkInGuest(guest1, bedroom1);
        hotel.checkInGuest(guest2, bedroom1);
        hotel.checkOutGuest(guest1, bedroom1);
        assertEquals(1, bedroom1.guestCount());
    }

    @Test
    public void canBookBedroom(){
        Booking newBooking = hotel.bookRoom(bedroom1, 2);
        assertEquals(60, newBooking.calculateTotalCost());
    }


}
