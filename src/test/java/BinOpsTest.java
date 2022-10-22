import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.agentche.BinOps;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Aleksey Anikeev aka AgentChe
 * Date of creation: 22.10.2022
 */
public class BinOpsTest {
    BinOps binOps = new BinOps();

    @Test
    @DisplayName("Тест суммы")
    void shouldSummary() {
        assertEquals("11110", binOps.sum("01111", "01111"));
    }

    @Test
    @DisplayName("Тест умножения")
    void shouldMultiply() {
        assertEquals("11001", binOps.mult("00101", "00101"));
    }
}
