import java.util.ArrayList;
import java.util.Arrays;

public class 最小K个数 {
    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if (k > input.length || k == 0) {
            return list;
        }

        Arrays.sort(input);
        if (k == 1) {
            list.add(input[0]);
            return list;
        }
        int count = k;
        int min = input[0];
        list.add(min);
        for (int i = 1; i < input.length; i++) {
            if (input[i] > min) {
                list.add(input[i]);
                count--;
                min = input[i];
                if (count <= 1) {
                    break;
                }
            }
        }
        return list;
    }

}

