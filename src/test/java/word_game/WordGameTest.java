package word_game;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class WordGameTest {

    @Test
    void test_ABC() {
        var wordGame = new WordGame();
        var input = List.of("A", "B", "C");
        var acceptedOutput = List.of("BAC", "CA", "BA");
        int maxLength = 3;

        var output = wordGame.findLongestAcceptedCombination(input, acceptedOutput, maxLength);
        Assertions.assertEquals("BAC", output);
    }

    @Test
    void test_nullInput() {
        var wordGame = new WordGame();
        List<String> input = null;
        var acceptedOutput = List.of("BAC", "CA", "BA");
        int maxLength = 3;

        var output = wordGame.findLongestAcceptedCombination(input, acceptedOutput, maxLength);
        Assertions.assertEquals("BAC", output);
    }

}