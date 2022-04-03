package tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
public class BaseTest {

    @BeforeAll
    public static void setup() {
        System.out.println("INFO: Before all setup");
    }

    @AfterAll
    public static void after() {
        System.out.println("INFO: after all");
    }
}
