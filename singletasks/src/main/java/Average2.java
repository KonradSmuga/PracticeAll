import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Average2 {

    public static void main(String[] args) {
        List<Integer> it = new ArrayList<>();
        int maxScore = Integer.MIN_VALUE;
        int minScore = Integer.MAX_VALUE;

        it.add(4);
        it.add(2);
        it.add(3);
        it.add(1);
        it.add(5);
        it.add(2);
        it.add(3);
        it.add(1);
        it.add(5);
        int sum = 0;

        for (int i = 0; i < it.size(); i++) {

            int score = it.get(i);
            sum += score;
            if (minScore > score) {
                minScore = score;
            }
            if (maxScore < score) {
                maxScore = score;
            }
        }


        int avg = sum - maxScore - minScore / it.size() - 2;
        System.out.println(avg);
    }


}



