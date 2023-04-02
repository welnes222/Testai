import org.junit.Test;

import static org.junit.Assert.*;

public class HumanTest {

    @org.junit.Test
    public void getNameTest() {
        Human h = new Human("vardas", "pavarde", 22);
        String expected = ("vardas");
        assertEquals(expected, h.getName());
    }

    @Test
    public void setNameTest() {
        Human h = new Human("vardas", "pavarde", 22);
        h.setName("Antanas");
        String expected = ("Antanas");
        assertEquals(expected, h.getName());
    }

    @Test
    public void setFirstLetterUpTest() {
        ;
        Human h = new Human("vardas", "pavarde", 77);
        h.setName("povilas");
        String expected = ("Povilas");
        assertEquals(expected, h.getName());
    }
    @Test
    public void setBothNames(){
        Human h = new Human("vardas", "Pavarde",11);
        h.setName("povilas antanavicius");
        String expected = ("povilas antanavicius");
        assertEquals(expected, h.getName());
    }
    @Test
    public void setBothNamesFirsLetterUp(){
        Human h = new Human("vardas", "pavarde", 64);
        h.setName("povilas antanavicius");
        String expected = ("Povilas Antanavicius");
        assertEquals(expected, h.getName());
    }
}