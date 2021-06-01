package hw.day11;

import junit.framework.TestCase;
import org.junit.*;

import java.util.Scanner;


public class TestPerson extends TestCase {
    public TestPerson(String name) {
        super(name);
    }

    @BeforeClass
    public static  void beforeClassTest(){
        System.out.println("Test case cần chạy được thì phải gọi chỗ này ^^");

    }
     @Before
     public void beforeTest(){
         System.out.println("Test case cần chạy được thì phải gọi chỗ này nữa^^");

     }
    @Test
    public void testGetFullName() {
        Person p = new Person("TEST", "DATHD");
        System.out.println("Test 1111");
        assertEquals("TEST DATHD", p.getFullName());
    }
    @Test
    public void testNullsInName() {
        Person p = new Person("dat", "hoang");
        assertEquals("hoang", p.getLastName());
        p = new Person("dat", null);
        assertNotSame("dat", p.getFirstName());
        assertNotSame("Fail, not equal.", "dat", p.getFirstName());
        System.out.println("Pass");

    }

    @Test
    public void testBoolean(){
        int a = 10;
        int b = 100;
        assertFalse(a==b);
      //  assertTrue(a==b);


    }
    @After
     public void afterTest(){
        System.out.println("After");
    }
    @AfterClass
    public static void afterAllTest(){
        System.out.println("After all");
    }
}