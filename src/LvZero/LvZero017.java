package LvZero;

public class LvZero017 {
    public int solution(int number, int n, int m){
        int answer = 0;

        if ((number%n==0) && (number%m==0)){
            answer = 1;
        }else {
            answer = 0;
        }

        return answer;
    }

    public static void main(String[] args) {
        LvZero017 main = new LvZero017();
        int number = 60;
        int n = 2;
        int m = 3;

        System.out.println(main.solution(number, n, m));
    }
}
