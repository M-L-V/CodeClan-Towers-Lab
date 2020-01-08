import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom1;
    private Bedroom bedroom2;
    private Guest guest1;
    private Guest guest2;

    @Before
    public void before(){
        bedroom1 = new Bedroom(101, 2, "double", 30);
        bedroom2 = new Bedroom(102, 1, "single", 40);
        guest1 = new Guest("Sandy");
        guest2 = new Guest("Eugene");
    }

    @Test
    public void canGetRoomNumber(){
        assertEquals(101, bedroom1.getRoomNumber());
    }

    @Test
    public void canGetRoomCapacity(){
        assertEquals(2, bedroom1.getCapacity());
    }

    @Test
    public void canGetRoomType(){
        assertEquals("double", bedroom1.getType());
    }

    @Test
    public void checksRoomStartsOutEmpty(){
        assertEquals(0, bedroom1.guestCount());
    }

    @Test
    public void canAddGuestToRoom(){
        bedroom1.addGuest(guest1);
        assertEquals(1, bedroom1.guestCount());
    }

    @Test
    public void canRemoveGuestFromRoom(){
        bedroom1.addGuest(guest1);
        bedroom1.removeGuest(guest1);
        assertEquals(0, bedroom1.guestCount());
    }

    @Test
    public void canRemoveAllGuestsFromRoom(){
        bedroom1.addGuest(guest1);
        bedroom1.addGuest(guest2);
        bedroom1.clearGuests();
        assertEquals(0,bedroom1.guestCount());
    }

    @Test
    public void roomHasRate(){
        assertEquals(30, bedroom1.rateOfRoom());
    }

    @Test
    public void isBookedStartsFalse() {
        assertEquals(false, bedroom1.checkIfBooked());
    }

    @Test
    public void canSetBookedToTrue() {
        bedroom1.bookSelf();
        assertEquals(true, bedroom1.checkIfBooked());
    }
}
