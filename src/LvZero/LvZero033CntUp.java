package LvZero;

import java.util.*;

public class LvZero033CntUp {
    public List<Integer> soloution(int start, int end){
        List<Integer> answer = new ArrayList<>();

        for (int i=start; i<=end; i++){
            answer.add(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        LvZero033CntUp main = new LvZero033CntUp();

        int start_num = 3;
        int end_num = 10;
        System.out.println(main.soloution(start_num,end_num));
    }
}
