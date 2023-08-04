package LvZero;

public class LvZero023 {
    public int solution(int a, int b, int c){
        int answer = 0;

        if (a == b && b == c) {
            answer += (a + b + c) * (a * a + b * b + c * c) * (a * a * a + b * b * b + c * c * c);
        } else if (a == b || b == c || c == a) {
            answer += (a + b + c) * (a * a + b * b + c * c);
        } else {
            answer += a + b + c;
        }

        return answer;
    }

    public static void main(String[] args) {
        LvZero023 main = new LvZero023();

        int a = 5;
        int b = 3;
        int c = 3;

        System.out.println(main.solution(a, b, c));
    }
}
