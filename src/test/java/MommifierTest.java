import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MommifierTest {

    @Test
    void should_return_empty_string_input_empty_string() {
        Mommifier mommifier = new Mommifier();
        String result = mommifier.convert("");
        assertEquals("", result);
    }
}
