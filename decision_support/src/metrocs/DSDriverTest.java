package metrocs;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

/**
 * Tests for class DecisionSupportDriver.
 *
 * @author TODO
 * @version 1.0
 */
public class DSDriverTest {
    /*
     * Validate syntax of main method.
     */
    @Test
    public void signatureTest() {

        String[] arguments = new String[] {
            "argA", "argB" };
        metrocs.DSDriver.main(arguments);
        assertNotNull(new metrocs.DSDriver());
    }
}
