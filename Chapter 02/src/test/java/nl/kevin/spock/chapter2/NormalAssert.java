package nl.kevin.spock.chapter2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class NormalAssert {

    @Test
    public void numbers() {
        assertEquals("Expected same result", (4 * 15) - (24 / 3), (2 * 30) - 9);
    }

    @Test
    public void strings() {
        assertEquals("Expected same result",
                "Please scan Abbut. Report to me his thoughts at present",
                "Please scan Abut. Report to me his thoughts at present");
    }

    @Test
    public void lists() {
        List<String> all = Arrays.asList("Vorlon", "Shadows", "Minbari", "Humans", "Drazi");
        List<String> fistOnes = Arrays.asList("Vorlon", "Shadows");
        assertEquals("Expected same result",
                all.subList(0, all.indexOf("Humans")), fistOnes);
    }

    @Test
    public void methods() {
        String text = "They are alone. They are a dying race.";
        WordDetector wordDetector = new WordDetector();
        assertEquals("Expected same result",
                wordDetector.feedText(text).duplicatesFound().size(), 5);
    }
}
