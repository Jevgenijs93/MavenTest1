import org.junit.Assert;
import org.junit.Test;

public class HelloTest {
    @Test
    public void testHello() {
        Assert.assertEquals("Hello!", Hello.Hello());
    }

    @Test
    public void testHelloAge() {
        Assert.assertEquals("Hello, 6!", Hello.HelloAge(6));
        Assert.assertEquals("Hello, 20!", Hello.HelloAge(20));
        Assert.assertEquals("Hello, 100!", Hello.HelloAge(100));
    }
}
