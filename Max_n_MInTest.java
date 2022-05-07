import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Max_n_MInTest {
    Max_n_MIn val = new Max_n_MIn();

    @Test
    public void Find_max_and_min(){
        int [] test ={4, 2, 1435, 9876};
        assertEquals(9876,val.getMaxValue(test));
        assertEquals(2,val.getMinValue(test));
    }

    @Test
    public void Find_max_and_min1(){
        int [] test ={};
        assertEquals(-1,val.getMaxValue(test));
        assertEquals(-1,val.getMinValue(test));
    }
    @Test
    public void Find_max_and_min2(){
        int [] test ={12546, -73546, 4563, -1, 0, 546378};
        assertEquals(546378,val.getMaxValue(test));
        assertEquals(-73546,val.getMinValue(test));
    }
}