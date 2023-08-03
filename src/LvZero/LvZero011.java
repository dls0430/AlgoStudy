package LvZero;

public class LvZero011 {
    public String solution(String str1, String str2) {
        String answer = "";

        for (int i=0; i<str1.length(); i++){
            answer += str1.substring(i,i+1);
            answer += str2.substring(i,i+1);
        }

        return answer;
    }

    public static void main(String[] args) {
        LvZero011 sol = new LvZero011();
        String str1 = "aaaaa";
        String str2 = "bbbbb";

        System.out.println(sol.solution(str1, str2));
    }
}
