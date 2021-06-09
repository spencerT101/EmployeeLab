import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    private Developer developer;

    @Before
    public void before() {
        developer = new Developer("Craig", "JH465FD", 26000);
    }

    @Test
    public void hasName() {
        assertEquals("Craig", developer.getName());
    }

    @Test
    public void hasSalary(){
        assertEquals(26000, developer.getSalary(), 0.00);
    }

    @Test
    public void hasNiNumber(){
        assertEquals("JH465FD", developer.getNiNumber());
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(10000);
        assertEquals(36000, developer.getSalary(), 0.00);
    }

    @Test
    public void canPayBonus(){
        assertEquals(260, developer.payBonus(), 0.00);
    }
}
