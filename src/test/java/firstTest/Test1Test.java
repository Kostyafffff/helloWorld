package firstTest;

import org.junit.Test;
import sun.applet.Main;

import static org.junit.Assert.*;


    public class Test1Test {
//    @Test
//    public void mult() {
//        assertEquals(8, 2);
//    }
//
//    @Test
//    public void mult1() {
//        assertEquals(8,2*4);
//    }

    @Test
    public void mult2() {
        assertEquals(9, new Test1().mult(3, 3));
    }
}