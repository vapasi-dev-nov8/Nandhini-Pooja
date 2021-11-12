import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AreaOfRectangleTest {

    @Test
    void shouldReturnAreaOfRectangle(){
        assertEquals(12, AreaOfRectangle.area(4, 3) );
    }
}
