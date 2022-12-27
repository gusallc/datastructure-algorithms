package algorithms;

public class CountLettersEquals {

    public static void main(String[] args) {
//        String letters = "abbcdcce"; // abbcccde // 4
        String letters = "abcddefghgeckieeeko"; //
        int count = 0;
        for (int i = 1; i < letters.length(); i++) {
            char previousPosition = letters.charAt(i - 1);
            char currentPosition = letters.charAt(i);
            if (currentPosition == previousPosition) {
                count = count + 2;
                i++;
            }
        }
        System.out.println("count = " + count);
    }
}
