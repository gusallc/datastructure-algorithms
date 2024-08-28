package algorithms;

public class SameParenthesis {

    public static void main(String[] args) {

//        "(())((()())())"  =>  true
//        "()"              =>  true
//        ")(()))"          =>  false
//        "("               =>  false
        System.out.println("Is parenthesis " + "(())((()())())" + " ? = " + isParenthesis("(())((()())())"));
        System.out.println("Is parenthesis " + "()" + " ? = " + isParenthesis("()"));
        System.out.println("Is parenthesis " + ")(()))" + " ? = " + isParenthesis(")(()))"));
        System.out.println("Is parenthesis " + "(" + " ? = " + isParenthesis("("));
    }

    static boolean isParenthesis(String value) {

        for (int index = 1; index <= value.length() - 1; index++) {
            char previous = value.charAt(index - 1);
            char current = value.charAt(index);
            String merge = "" + previous + current;
            if (merge.equals("()")) {
                String stringPrevious = "";
                String stringAfter = value.substring(index + 1);
                // ((() || (()
                if (index >= 2) {
                    stringPrevious = value.substring(0, index - 1);
                    index--;
                }
                index--;
                value = stringPrevious + stringAfter;
            }
        }
        return value.length() == 0;
    }


}
