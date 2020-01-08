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
        bedroom1 = new Bedroom(101, 2, "double");
        bedroom2 = new Bedroom(102, 1, "single");
        guest1 = new Guest("Sandy");
        guest2 = new Guest("Eugene");
    }

    @Test
    public void canGetRoomNumber(){
        assertEquals(101, bedroom1.getRoomNumber());
    }


}
