import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class WatermelonTest {
        @Test
        public void Is_it_divisible(){
            Watermelon test1 = new Watermelon();
            assertEquals("Yes",test1.Watermelonn(4));
        }
    @Test
    public void Is_it_divisible1(){
        Watermelon test1 = new Watermelon();
        assertEquals("No",test1.Watermelonn(3));
    }
    @Test
    public void Is_it_divisible2(){
        Watermelon test1 = new Watermelon();
        assertEquals("No",test1.Watermelonn(2.5));
    }
    @Test
    public void Is_it_divisible3(){
        Watermelon test1 = new Watermelon();
        assertEquals("No",test1.Watermelonn(1222222222));
    }
    @Test
    public void Is_it_divisible4(){
        Watermelon test1 = new Watermelon();
        assertEquals("Out of Range",test1.Watermelonn(101));
    }
    @Test
    public void Is_it_divisible5(){
        Watermelon test1 = new Watermelon();
        assertEquals("No",test1.Watermelonn(1));
    }
    @Test
    public void Is_it_divisible6(){
        Watermelon test1 = new Watermelon();
        assertEquals("Out of Range",test1.Watermelonn(-2));
    }
    @Test
    public void Is_it_divisible7(){
        Watermelon test1 = new Watermelon();
        assertEquals("Yes",test1.Watermelonn(100));
    }
    @Test
    public void Is_it_divisible8(){
        Watermelon test1 = new Watermelon();
        assertEquals("Out of Range",test1.Watermelonn(0));
    }
    @Test
    public void Is_it_divisible9(){
        Watermelon test1 = new Watermelon();
        assertEquals("Doesn't get divided to two even numbers",test1.Watermelonn(2));
    }

    }
