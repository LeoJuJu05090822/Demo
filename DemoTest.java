import static org.junit.Assert.assertEquals;

import org.junit.Test;

import org.junit.*;
import static org.junit.Assert.*;


public class DemoTest{
    Demo test1 = new Demo(2, 60);

    @Test
    public void test(){
        assertEquals(20, test1.average());
    }
}
