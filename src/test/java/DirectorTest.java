import org.junit.Before;
import org.junit.Test;
import staff.management.Director;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    private Director director;

    @Before
    public void before(){
        director = new Director("Melinda", "R5H7659", 78000, "Executive Office",150000);
    }

    @Test
    public void hasName(){
        assertEquals("Melinda", director.getName());
    }

    @Test
    public void hasDepartment(){
        assertEquals("Executive Office", director.getDepartmentName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals("R5H7659", director.getNiNumber());
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(10000);
        assertEquals(88000, director.getSalary(), 0.00);
    }

    @Test
    public void canPayBonus(){
        assertEquals(780, director.payBonus(), 0.00);
    }

    @Test
    public void hasBudget() {
        assertEquals(150000, director.getBudget(), 0.00);
    }
}

