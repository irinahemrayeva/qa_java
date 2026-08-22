import com.example.Cat;
import com.example.Predator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    //Вношу изменения, а то не коммитится
    @Mock
    private Predator mockPredator;

    @Test
    public void testCatGetFood() throws Exception {
        List<String> expectedFood = List.of("Animals", "Birds", "Fishes");
        when(mockPredator.eatMeat()).thenReturn(expectedFood);

        Cat cat = new Cat(mockPredator);
        List<String> actualFood = cat.getFood();

        assertEquals(expectedFood, actualFood);
        verify(mockPredator, times(1)).eatMeat();
    }

    @Test
    public void testCatGetSound() {
        Cat cat = new Cat(mockPredator);
        assertEquals("Mau", cat.getSound());  // ← напечатай вручную!
    }
}