package annotations;

public class SampleTest {

    @BeforeTest
    public void setUp() {
        System.out.println("Setting up before the test...");
    }

    @Test
    public void testMethod1() {
        System.out.println("Executing test method 1...");
    }

    @AfterTest
    public void tearDown() {
        System.out.println("Cleaning up after the test...");
    }
}

