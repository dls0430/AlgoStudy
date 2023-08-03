package LvZero;

public class LvZero015 {
    public int solution(int a, int b){
        int answer = 0;

        int numA = Integer.valueOf(""+a+b);
        int numB = 2 * a * b;

        answer = Math.max(numA, numB);

        return answer;
    }
    public static void main(String[] args) {
        LvZero015 main = new LvZero015();
        int a = 2;
        int b = 91;

        System.out.println(main.solution(a,b));
    }
}
