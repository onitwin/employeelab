import management.Manager;
import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin= new DatabaseAdmin("Joseph","Jt6578",100.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Joseph",databaseAdmin.getName());
    }

    @Test
    public void canGetNiNumber(){
        assertEquals("Jt6578",databaseAdmin.getNi());
    }

    @Test
    public void canGetSalary(){
        assertEquals(100.00,databaseAdmin.getSalary(),0.01);
    }

}
