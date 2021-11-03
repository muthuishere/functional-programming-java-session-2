package tutorial.sentencemodifier;



import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class SentenceCapifierTest {

    @Test
    public void capifyWordsForThreeWordsShouldWorkFIne() {
        String sentence = "how are you";
        String result = SentenceCapifier.transform(sentence);
        assertEquals(result,"How Are You");
    }
    @Test
    public void capifyWordsForSingleWordsShouldWorkFIne() {
        String sentence = "tenet";
        String result = SentenceCapifier.transform(sentence);
        assertEquals(result,"Tenet");
    }

}