package LvZero;

public class LvZero028 {
    public String solution(int[] numLog) {
        String answer = "";

        for (int i = 1; i < numLog.length; i++) {
            if (numLog[i] - numLog[i-1] == 1){
                answer += "w";
            } else if (numLog[i] - numLog[i-1] == -1) {
                answer += "s";
            }else if (numLog[i] - numLog[i-1] == 10) {
                answer += "d";
            }else {
                answer += "a";
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        LvZero028 main = new LvZero028();

        int[] numLog = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};

        System.out.println(main.solution(numLog));
    }
}
