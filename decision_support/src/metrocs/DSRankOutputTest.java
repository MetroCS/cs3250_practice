package metrocs;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

/**
 * Tests for class HelloWorld.
 *
 * @author  Dr. Jody Paul
 * @version 1.1.1
 */
public class DSRankOutputTest {
    @Test
    public void sortVectorTest() {
        DSRankOutput dsRankOutput = new DSRankOutput();
        List<Integer> unsortedList = Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5);
        List<Integer> sortedList = dsRankOutput.sort(unsortedList);
        Collections.sort(unsortedList);
        assertEquals(unsortedList, sortedList);
    }

    @Test
    public void toStringTest() {
        DSRankOutput dsRankOutput = new DSRankOutput();
        String input = "Hi Mom!";
        String output = dsRankOutput.toString(input);
        assertEquals(input, output);
    }

    @Test
    public void toListTest() {
        DSRankOutput dsRankOutput = new DSRankOutput();
        List<String> inputList = Arrays.asList("apple", "banana", "cherry");
        List<String> outputList = dsRankOutput.toList(inputList);
        assertEquals(inputList, outputList);
    }
}