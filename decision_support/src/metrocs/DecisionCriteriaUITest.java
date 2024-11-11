package metrocs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

class DecisionCriteriaUITest {
    private DecisionCriteriaUI manager;

    @BeforeEach
    void setUp() {
        manager = new DecisionCriteriaUI();
    }

    @Test
    void testAddCriteria() {
        manager.addCriteria("Cost");
        manager.addCriteria("Quality");

        List<String> criteriaList = manager.getCriteriaList();
        assertEquals(2, criteriaList.size());
        assertEquals("Cost", criteriaList.get(0));
        assertEquals("Quality", criteriaList.get(1));
    }

    @Test
    void testEmptyCriteriaList() {
        List<String> criteriaList = manager.getCriteriaList();
        assertTrue(criteriaList.isEmpty(), "Criteria list should be empty initially.");
    }
}
