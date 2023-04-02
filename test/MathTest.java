import org.junit.Test;
import static org.junit.Assert.*;
public class MathTest {

    @Test
    public void roundTest(){
        assertEquals(5, Math.round(4.687));
    }
    @Test
    public void countPlus(){
        assertNotEquals(5, 3+3);
    }
    @Test
    public void maxTest(){
        assertEquals( 25, Math.max(1,25));
}
    @Test
    public void cosTest(){
        assertNotEquals(79, Math.cos(199));
    }
    @Test
    public void  sqrTest(){
        double sq = 9;
        assertEquals(3.0, Math.sqrt(sq));
    }
    @Test
    public void tangetTest(){
        assertNotEquals(6, Math.tan(39));
    }
//    @Test
//    public void randomTest(){
//    double random = Math.random();
//        assertTrue(random >= 0 && < 1);
//    }
//    @Test
//    public void atanTest(){
//        double atan = Math.atan(1);
//        assertEquals(45.0, atan);
//    }

@Test
    public void floorTest(){
    int[] fl ={11, 55, 66};
        assertNotEquals(11 , Math.floor(fl[0]));
}


}
