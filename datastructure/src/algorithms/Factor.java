package algorithms;

import java.util.List;

public class Factor {

    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        int total = getTotalX(List.of(2, 4), List.of(16, 32, 96)); // expected 3
//        int total = getTotalY(List.of(1), List.of(100)); // expected 9
//        int total = getTotalX(List.of(1), List.of(72, 48)); // expected 8
        long fin = System.currentTimeMillis();
        double tiempo = (double) (fin - inicio);
        System.out.println("total = " + total);
        System.out.println(tiempo + " segundos");

    }

    static int getTotalX(List<Integer> a, List<Integer> b) {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            int first = 0;
            int second = 0;
            for (Integer num : a) {
                if (i % num == 0) {
                    first++;
                } else break;
            }

            for (Integer num : b) {
                if (num % i == 0) {
                    second++;
                } else break;
            }
            if (first == a.size() && second == b.size()) {
                count++;
            }
        }
        return count;
    }
}
