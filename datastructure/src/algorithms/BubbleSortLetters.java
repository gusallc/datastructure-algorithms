package algorithms;

public class BubbleSortLetters {


    public static void main(String[] args) {
        String letters = "daczbe";
        System.out.println("Array Before Bubble Sort : " + "\n" + letters);
        System.out.println();
        String result = bubbleSort(letters);
        System.out.println("Array After Bubble Sort");
        System.out.println(result);
    }

    private static String bubbleSort(String letters) {
        char[] listCharacter = letters.toCharArray();

        int lengthTotal = listCharacter.length;
        for (int legthIteration = 0; legthIteration < lengthTotal; legthIteration++) {
            for (int j = 1; j < (lengthTotal - legthIteration); j++) {
                char previousPosition = listCharacter[j - 1];
                char currentPosition = listCharacter[j];
                if (previousPosition > currentPosition) {
                    listCharacter[j - 1] = currentPosition;
                    listCharacter[j] = previousPosition;
                }
            }
        }
        return String.valueOf(listCharacter);
    }
}
