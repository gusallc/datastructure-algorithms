package algorithms;

import java.util.List;

public class ShareAChocolate {
    //expected 4

    /**
     * 20
     * 5 1 2 4 4 2 4 2 2 5 1 4 3 1 1 1 2 1 4 1
     * 18 6
     */
    //5 1 2 4 4 2 = 18
    //1 2 4 4 2 4 = 17
    //2 4 4 2 4 2 = 18
    //4 4 2 4 2 2 = 18
    //4 2 4 2 2 5 = 19
    //2 4 2 2 5 1 = 16
    //4 2 2 5 1 4 = 18
    //2 2 5 1 4 3 = 17
    //2 5 1 4 3 1 = 16
    //5 1 4 3 1 1 = 15
    //1 4 3 1 1 1 = 11
    //4 3 1 1 1 2 = 12
    //3 1 1 1 2 1 = 9
    //1 1 1 2 1 4 = 10
    //1 1 2 1 4 1 = 10
    public static void main(String[] args) {

        System.out.println("result : " + birthday(List.of(5, 1, 2, 4, 4, 2, 4, 2, 2, 5, 1, 4, 3, 1, 1, 1, 2, 1, 4, 1), 18, 6));

    }

    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        int count = 0;
        for (int index = 0; index <= s.size() - m; index++) {
            int temp = s.get(index);
            for (int squares = 1; squares < m; squares++) {
                System.out.println("temp : " + temp + "  squares: " + s.get(squares + index));
                temp = temp + s.get(squares + index);
                System.out.println("temp : " + temp);
            }
            if (temp == d) {
                count++;
                System.out.println("count :" + count);
            }
        }
        return count;
    }

}
