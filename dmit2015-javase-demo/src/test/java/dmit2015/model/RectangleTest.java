package dmit2015.model;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.*;

public class RectangleTest {
    @Test
    void testRectangle() {

        Rectangle rectangle = new Rectangle();
        rectangle.setLength(5);
        rectangle.setWidth(5);

        assertThat(rectangle.area()).isCloseTo(78.54, within(0.01));
        assertThat(rectangle.perimeter()).isCloseTo(78.54, within(0.01));
    }
}
