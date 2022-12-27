package algorithms;

import java.util.List;

public class Score {

    public static void main(String[] args) {
        breakingRecords(List.of(10, 5, 20, 20, 4, 5, 2, 25, 1)).forEach(System.out::println);
        // HIGH 2 - LOW 4 SCORE
    }

    static List<Integer> breakingRecords(List<Integer> scores) {

        int lowestScore = scores.get(0);
        int highestScore = scores.get(0);
        int countLowest = 0;
        int countHighest = 0;

        for (int index = 1; index < scores.size(); index++) {
            int currentScore = scores.get(index);
            if (currentScore < lowestScore) {
                lowestScore = currentScore;
                countLowest++;
            }
            if (currentScore > highestScore) {
                highestScore = currentScore;
                countHighest++;
            }
        }
        return List.of(countHighest, countLowest);
    }
}
