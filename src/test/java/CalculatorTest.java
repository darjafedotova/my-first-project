import classroom.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
        @Test

    public void testSum() {
            Calculator casio = new Calculator();
            Assert.assertEquals(casio.sum(10,50), 60);
            Assert.assertEquals(casio.sub(13,6), 7);
            Assert.assertEquals(casio.div(120,3), 40);
            Assert.assertEquals(casio.mult(3,6), 18);
        }

        @Test
    public void testSub() {
        Calculator casio = new Calculator();
        Assert.assertEquals(casio.sub(13,6), 7);
    }

    @Test
    public void testDiv() {
        Calculator casio = new Calculator();
        Assert.assertEquals(casio.div(120,3), 40);
    }

    @Test
    public void testMult() {
        Calculator casio = new Calculator();
        Assert.assertEquals(casio.mult(3,6), 18);
    }
}
