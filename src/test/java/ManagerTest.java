import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void before(){
        manager= new Manager("Joseph","Jt6578",100.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Joseph",manager.getName());
    }

    @Test
    public void canGetNiNumber(){
        assertEquals("Jt6578",manager.getNi());
    }

    @Test
    public void canGetSalary(){
        assertEquals(100.00,manager.getSalary(),0.01);
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Retail",manager.canGetDeptName());
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(100.00,manager.getSalary(),0.01);
        manager.raiseSalary(0.1);
        assertEquals(110.00,manager.getSalary(),0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(110.00,manager.payBonus(),0.01);
    }
}
