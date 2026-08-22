import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineParameterizedTest {
    //Вношу изменения, а то не коммитится
    private final String animalKind;
    private final List<String> expectedFood;

    public FelineParameterizedTest(String animalKind, List<String> expectedFood) {
        this.animalKind = animalKind;
        this.expectedFood = expectedFood;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"Predator", List.of("Animals", "Birds", "Fishes")},
                {"Herbivore", List.of("Grass", "Plants")}
        });
    }

    @Test
    public void testGetFood() throws Exception {
        Feline feline = new Feline();
        assertEquals(expectedFood, feline.getFood(animalKind));
    }
}