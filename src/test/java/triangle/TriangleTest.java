package triangle;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TriangleTest {


    @Test(dataProvider = "getMessage", dataProviderClass = DataProviderClass.class)
    public void testGetMessage(String message, Triangle t) {
        t.checkTriangle();
        Assert.assertEquals(t.getMessage(), message);
    }

    @Test(dataProvider = "checkTriangle", dataProviderClass = DataProviderClass.class)
    public void testCheckTriangle(Triangle t, boolean result) {
        Assert.assertEquals(t.checkTriangle(), result);
    }

    @Test
    public void testDetectTriangle() {
        
    }

    @Test
    public void testGetSquare() {
    }
}