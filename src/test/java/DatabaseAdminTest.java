import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    private DatabaseAdmin dbAdmin;

    @Before
    public void before(){
        dbAdmin = new DatabaseAdmin("Bartha", "BR43790", 250000);
    }

    @Test
    public void hasName() {
        assertEquals("Bartha", dbAdmin.getName());
    }

    @Test
    public void hasSalary(){
        assertEquals(250000, dbAdmin.getSalary(), 0.00);
    }

    @Test
    public void hasNiNumber(){
        assertEquals("BR43790", dbAdmin.getNiNumber());
    }

    @Test
    public void canRaiseSalary() {
        dbAdmin.raiseSalary(10000);
        assertEquals(260000, dbAdmin.getSalary(), 0.00);
    }

    @Test
    public void raiseSalaryMustBePositiveNumber() {
        dbAdmin.raiseSalary(-100);
        assertEquals(250000, dbAdmin.getSalary(), 0.00);
    }

    @Test
    public void canPayBonus(){
        assertEquals(2500, dbAdmin.payBonus(), 0.00);
    }
}
