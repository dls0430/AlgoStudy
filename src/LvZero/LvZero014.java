package LvZero;

public class LvZero014 {
    public int solution(int a, int b) {
        int answer = 0;

        String str1 = Integer.toString(a);  //문자로 변환된 숫자 a
        String str2 = Integer.toString(b);  //문자로 변환된 숫자 b
        int numA = Integer.parseInt(Integer.toString(a) + Integer.toString(b));    //991
        int numB = Integer.parseInt(Integer.toString(b) + Integer.toString(a));    //919

        if (numA > numB) {
            answer = Integer.parseInt(str1 + str2);
        }else if (a == b){
            answer = Integer.parseInt(str1 + str2);
        }else {
            answer = Integer.parseInt(str2 + str1);
        }

        return answer;
    }

    public static void main(String[] args) {
        LvZero014 main = new LvZero014();
        int a = 9;
        int b = 91;

        System.out.println(main.solution(a, b));
    }
}
