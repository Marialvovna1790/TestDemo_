import static org.junit.Assert.assertEquals;

public class NumbersTest {

    @org.junit.Test
    public void sum() {
        Numbers numbers = new Numbers();
        int actual = numbers.sum(5);
        int expected = 10;
        assertEquals(expected, actual);
    }


}