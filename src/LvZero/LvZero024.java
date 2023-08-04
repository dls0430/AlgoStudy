package LvZero;

public class LvZero024 {
    public int solution(int[] num_list){
        int answer = 0;

        int sum = 0;
        int mul = 1;
        int sumMul = 0;
        for (int i=0; i<num_list.length; i++){
            sum += num_list[i];
            sumMul = sum*sum;
            mul *= num_list[i];
            if (sumMul>mul){
                answer = 1;
            }else {
                answer = 0;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        LvZero024 main = new LvZero024();

        int[] num_list = {3,4,5,2,1};

        System.out.println(main.solution(num_list));
    }
}
