package LvZero;

public class LvZero027 {
    public int solution(int n, String control) {
        int answer = n;

        for (int i = 0; i < control.length(); i++) {
            char c = control.charAt(i);
            if (c=='w'){
                answer += 1;
            }else if (c=='s'){
                answer += -1;
            }else if (c=='d'){
                answer += 10;
            }else {
                answer += -10;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        LvZero027 main = new LvZero027();

        int n = 0;
        String control = "wsdawsdassw";

        System.out.println(main.solution(n, control));
    }
}
