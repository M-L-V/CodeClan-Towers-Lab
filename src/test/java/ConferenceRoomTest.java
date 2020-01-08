import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    private ConferenceRoom conferenceRoom1;
    private ConferenceRoom conferenceRoom2;
    private Guest guest1;
    private Guest guest2;

    @Before
    public void before(){
        conferenceRoom1 = new ConferenceRoom( 50, "Mike Ritchie");
        conferenceRoom2 = new ConferenceRoom(60, "Grace Hopper");
        guest1 = new Guest("Sandy");
        guest2 = new Guest("Eugene");
    }


    @Test
    public void canGetRoomCapacity(){
        assertEquals(50, conferenceRoom1.getCapacity());
    }

    @Test
    public void canGetRoomName(){
        assertEquals("Mike Ritchie", conferenceRoom1.getRoomName());
    }

    @Test
    public void checksRoomStartsOutEmpty(){
        assertEquals(0, conferenceRoom1.guestCount());
    }

    @Test
    public void canAddGuestToRoom(){
        conferenceRoom1.addGuest(guest1);
        assertEquals(1, conferenceRoom1.guestCount());
    }

    @Test
    public void canRemoveGuestFromRoom(){
        conferenceRoom1.addGuest(guest1);
        conferenceRoom1.removeGuest(guest1);
        assertEquals(0, conferenceRoom1.guestCount());
    }

    @Test
    public void canRemoveAllGuestsFromRoom(){
        conferenceRoom1.addGuest(guest1);
        conferenceRoom1.addGuest(guest2);
        conferenceRoom1.clearGuests();
        assertEquals(0,conferenceRoom1.guestCount());
    }

}
