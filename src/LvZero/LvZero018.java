package LvZero;

public class LvZero018 {
    public int solution(int n){
        int answer = 0;

        if (n%2==1){    // n이 홀수일때, 이하의 홀수인 모든 양의 정수의 합을 return
            for (int i=n; i>0; i--){
                if (i%2==1){
                    answer += i;
                }
            }
        }else {         // n이 짝수일때, 이하의 짝수인 모든 양의 정수의 제곱의 합을 return
            for (int i=n; i>0; i--){
                if (i%2==0){
                    answer += i*i;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        LvZero018 main = new LvZero018();
        int n = 10;

        System.out.println(main.solution(n));
    }
}
