package LvZero;

import java.util.ArrayList;
import java.util.List;

public class LvZero026 {
    public List<Integer> solution(int[] num_list) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < num_list.length; i++) {
            answer.add(num_list[i]);
        }
        if (num_list[num_list.length - 1] > num_list[num_list.length - 2]) {
            answer.add(num_list[num_list.length - 1] - num_list[num_list.length - 2]);
        } else {
            answer.add(num_list[num_list.length - 1] * 2);
        }

        return answer;
    }

    public static void main(String[] args) {
        LvZero026 main = new LvZero026();
        int[] num_list = {2, 1, 6};

        System.out.println(main.solution(num_list));
    }
}
