import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class FelineTest {

    private final Feline feline = new Feline();

    @Test
    public void testGetFamily() {
        assertEquals("Felidae", feline.getFamily());
    }

    @Test
    public void testGetKittensDefault() {
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void testGetKittensWithCount() {
        assertEquals(5, feline.getKittens(5));
    }

    @Test
    public void testEatMeat() throws Exception {
        List<String> expectedFood = List.of("Animals", "Birds", "Fishes");
        assertEquals(expectedFood, feline.eatMeat());
    }
}