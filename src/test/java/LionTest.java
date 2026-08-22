import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    private Feline mockFeline;

    @Test
    public void testLionGetFood() throws Exception {
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        when(mockFeline.getFood("Predator")).thenReturn(expectedFood);

        Lion lion = new Lion("Male", mockFeline);
        List<String> actualFood = lion.getFood();

        assertEquals(expectedFood, actualFood);
        verify(mockFeline).getFood("Predator");
    }

    @Test
    public void testLionGetKittens() throws Exception {
        when(mockFeline.getKittens()).thenReturn(5);

        Lion lion = new Lion("Male", mockFeline);
        assertEquals(5, lion.getKittens());
        verify(mockFeline).getKittens();
    }

    @Test(expected = Exception.class)
    public void testLionInvalidSex() throws Exception {
        new Lion("Unknown", mockFeline);
    }
}