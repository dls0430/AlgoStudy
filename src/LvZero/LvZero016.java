package LvZero;

public class LvZero016 {
    public int solution(int num, int n){
        int answer = 0;

        if (num%n == 0){
            answer = 1;
        }else {
            answer = 0;
        }

        return answer;
    }

    public static void main(String[] args) {
        LvZero016 main = new LvZero016();
        int num = 98;
        int n = 2;

        System.out.println(main.solution(num, n));
    }
}
