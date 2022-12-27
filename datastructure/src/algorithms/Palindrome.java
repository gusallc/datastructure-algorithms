package algorithms;

public class Palindrome {


    public static void main(String[] args) {
        //Rotator
        //Repaper
        //Racecar
        //Deified
        //Reviver
        String[] word = {"racecar", "deified","recipe"};
        System.out.println(word[0] + " is Palindrome : " + isPalindromeWithWhile(word[0]));
        System.out.println(word[1] + " is Palindrome : " + isPalindromeWithFor(word[1]));
        System.out.println(word[2] + " is Palindrome : " + isPalindromeWithFor(word[2]));
    }

    private static Boolean isPalindromeWithWhile(String word) {
        int cursorForRight = 0;
        int cursorForLeft = word.length() - 1;
        while (cursorForRight < cursorForLeft) {
            if (word.charAt(cursorForRight) != word.charAt(cursorForLeft)) {
                return false;
            }
            cursorForRight++;
            cursorForLeft--;
        }
            return true;
    }

    private static Boolean isPalindromeWithFor(String word) {
        for (int cursorForRight = 0, cursorForLeft = word.length() - 1; cursorForRight < cursorForLeft; cursorForRight++, cursorForLeft--) {
            if (word.charAt(cursorForRight) != word.charAt(cursorForLeft)) {
                return false;
            }
        }
        return true;
    }
}
