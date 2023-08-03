package LvZero;

class LvZero012 {
    public String solution(String[] arr) {
        String answer = "";

        for(int i=0; i<arr.length; i++){
            answer += arr[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        LvZero012 T = new LvZero012();
        String[] strArr = {"a","b","c"};

        System.out.println(T.solution(strArr));
    }
}


