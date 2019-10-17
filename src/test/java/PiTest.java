import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PiTest {

    @Test
    public void calculate() {
        Assert.assertEquals(3.14, Pi.calculate((int) 10e7),0.009);
    }
}