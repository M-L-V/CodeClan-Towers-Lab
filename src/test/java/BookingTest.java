import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    private Booking booking;
    private Bedroom bedroom1;
    private Bedroom bedroom2;

    @Before
    public void before(){

        bedroom1 = new Bedroom(101, 2, "double");
        bedroom2 = new Bedroom(102, 1, "single");

        booking = new Booking(bedroom1,2);
    }

    @Test
    public void bookingHasBedroom(){
        assertEquals(bedroom1, booking.checkBedroom());
    }

    @Test
    public void bookingHasNights(){
        assertEquals(2, booking.checkNights());
    }
}
