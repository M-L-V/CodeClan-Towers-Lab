import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;



public class GuestTest {

    private Guest guest1;
    private Guest guest2;


    @Before
    public void before(){
        guest1 = new Guest("Sandy");
        guest2 = new Guest("Eugene");
    }

    @Test
    public void canGetGuestName(){
        assertEquals("Sandy", guest1.getName());
    }
}
