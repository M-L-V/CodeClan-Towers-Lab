import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    private Booking booking;
    private Bedroom bedroom1;
    private Bedroom bedroom2;

    @Before
    public void before(){

        bedroom1 = new Bedroom(101, 2, "double", 30);
        bedroom2 = new Bedroom(102, 1, "single", 40);

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

    @Test
    public void checkBookingHasTotalCost(){
        assertEquals(60, booking.calculateTotalCost());
    }
}
