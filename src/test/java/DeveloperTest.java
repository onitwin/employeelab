import management.Manager;
import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer= new Developer("Joseph","Jt6578",100.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Joseph",developer.getName());
    }

    @Test
    public void canGetNiNumber(){
        assertEquals("Jt6578",developer.getNi());
    }

    @Test
    public void canGetSalary(){
        assertEquals(100.00,developer.getSalary(),0.01);
    }

}
