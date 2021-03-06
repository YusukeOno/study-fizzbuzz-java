/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package study_fizzbuzz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    @Test void 引数に1を与えたら1を返す()
    {
        App appTest = new App();
        assertEquals("1", appTest.convertFizzBuzz(1));
    }

    @Test void 引数に3を与えたらFizzを返す()
    {
        App appTest = new App();
        assertEquals("Fizz", appTest.convertFizzBuzz(3));
    }

    @Test void 引数に5を与えたらBuzzを返す()
    {
        App appTest = new App();
        assertEquals("Buzz", appTest.convertFizzBuzz(5));
    }

    @Test void 引数に15を与えたらFizzBuzzを返す()
    {
        App appTest = new App();
        assertEquals("FizzBuzz", appTest.convertFizzBuzz(15));
    }
}
