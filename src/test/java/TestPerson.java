import junit.framework.TestCase;
import org.junit.Test;

public class TestPerson extends TestCase {
    public TestPerson(String name) {
        super(name);
    }

    @Test
    public void testGetFullName() {
        Person p = new Person("Test", "DatHD");
        assertEquals("TESTDATHD", p.getFullName());
    }
    @Test
    public void testNullsInName() {
        Person p = new Person("dat", "hoang");
        assertEquals("hoang", p.getLastName());
        p = new Person("dat", null);
        //assertNotSame("dat", p.getFirstName());
        assertNotSame("Fail, not equal.", "dat", p.getFirstName());
        System.out.println("Pass");

    }
}