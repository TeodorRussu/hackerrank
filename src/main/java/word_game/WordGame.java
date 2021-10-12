package word_game;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class WordGame {


    public String findLongestAcceptedCombination(List<String> input, List<String> acceptedOutput, int maxLength) {
        Set<String> combinations = new HashSet<>();
        String currentCombination = "";
        for (int i = 0; i < input.size(); i++) {
            postCandidate(currentCombination + input.get(i), input, maxLength, acceptedOutput, combinations);
        }
        return selectLongest(combinations);
    }

    private void postCandidate(String currentCombination, List<String> input, int maxLength, List<String> acceptedOutput, Set<String> combinations) {
        if (acceptedOutput.contains(currentCombination)) {
            combinations.add(currentCombination);
        }
        if (currentCombination.length() == maxLength)
            return;

        for (int i = 0; i < input.size(); i++) {
            if (acceptedOutput.contains(currentCombination))
                combinations.add(currentCombination);
            postCandidate(currentCombination + input.get(i), input, maxLength, acceptedOutput, combinations);
        }
    }

    private String selectLongest(Set<String> combinations) {
        Iterator<String> firstCombination = combinations.iterator();
        String longest = firstCombination.next();
        int longestCombinationLength = longest.length();
        while (firstCombination.hasNext()) {
            String nextCombination = firstCombination.next();
            if (nextCombination.length() > longestCombinationLength) {
                longest = nextCombination;
                longestCombinationLength = nextCombination.length();
            }
        }
        return longest;

    }
}

