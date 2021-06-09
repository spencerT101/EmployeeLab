import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    private Manager manager;

    @Before
    public void before() {
        manager = new Manager("Spencer", "JH657DHR", 112000, "R&D");
    }

    @Test
    public void hasName() {
        assertEquals("Spencer", manager.getName());
    }

    @Test
    public void canChangeName() {
        manager.setName("Martha");
        assertEquals("Martha", manager.getName());
    }

    @Test
    public void cantChangeNameWithNullValue() {
        manager.setName(null);
        assertEquals("Spencer", manager.getName());
    }

    @Test
    public void hasSalary(){
        assertEquals(112000, manager.getSalary(), 0.00);
    }

    @Test
    public void hasDepartment(){
        assertEquals("R&D", manager.getDepartmentName());
    }

    @Test
    public void hasNiNumber(){
        assertEquals("JH657DHR", manager.getNiNumber());
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(10000);
        assertEquals(122000, manager.getSalary(), 0.00);
    }

    @Test
    public void raiseSalaryMustBePositiveNumber() {
        manager.raiseSalary(-100);
        assertEquals(112000, manager.getSalary(), 0.00);
    }

    @Test
    public void canPayBonus(){
        assertEquals(1120, manager.payBonus(), 0.00);
    }
}
