package LvZero;

public class LvZero020 {
    public int solution(int a, int b, boolean flag){
        int answer = 0;

        if (flag == true){
            answer = a+b;
        }else {
            answer = a-b;
        }

        return answer;
    }

    public static void main(String[] args) {
        LvZero020 main = new LvZero020();
        int a = -4;
        int b = 7;
        boolean flag = true;

        System.out.println(main.solution(a, b, flag));
    }
}
