package LvZero;

public class LvZero025 {
    public int solution(int[] num_list) {
        int answer = 0;

        String even = "";   // 짝수
        String odd = "";    // 홀수
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                even += Integer.toString(num_list[i]);
            } else {
                odd += Integer.toString(num_list[i]);
            }
        }
        answer = Integer.parseInt(even) + Integer.parseInt(odd);
        return answer;
    }

    public static void main(String[] args) {
        LvZero025 main = new LvZero025();

        int[] num_list = {3, 4, 5, 2, 1};
        System.out.print(main.solution(num_list));
    }
}
