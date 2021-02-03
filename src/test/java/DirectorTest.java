import management.Director;
import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director= new Director("Joseph","Jt6578",100.00,"Boss",200.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Joseph",director.getName());
    }

    @Test
    public void canGetNiNumber(){
        assertEquals("Jt6578",director.getNi());
    }

    @Test
    public void canGetSalary(){
        assertEquals(100.00,director.getSalary(),0.01);
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Boss",director.getDept());
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(100.00,director.getSalary(),0.01);
        director.raiseSalary(0.1);
        assertEquals(110.00,director.getSalary(),0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(20.00,director.payBonus(),0.01);
    }

    @Test
    public void canGetBudget(){
        assertEquals(200.00,director.getBudget(), 0.01);
    }


}
