package LvZero;

public class LvZero013 {
    public String solution(String my_string, int k) {
        String answer = "";

        for (int i = 0; i<k; i++){
            answer += my_string;
        }

        return answer;
    }
    public static void main(String[] args) {
        LvZero013 sol = new LvZero013();
        String my_string = "string";
        int k = 3;

        System.out.println(sol.solution(my_string, k));
    }
}
