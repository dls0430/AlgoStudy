package LvZero;

public class LvZero021 {
    public String solution(String code){
        String answer = "";
        int mode = 0;

        for (int i=0; i<code.length(); i++){
            String a = code.substring(i, i+1);

            if (mode == 0){
                if (!a.equals("1")) {
                    if (i % 2 == 0) {
                        answer += a;
                    }
                } else {
                    mode = 1;
                }
            } else if (mode == 1) {
                if (!a.equals("1")) {
                    if (i % 2 == 1) {
                        answer += a;
                    }
                } else {
                    mode = 0;
                }
            }
        }

        if (answer.equals("")){
            answer = "EMPTY";
        }

        return answer;
    }

    public static void main(String[] args) {
        LvZero021 main = new LvZero021();
        String code = "abc1abc1abc";

        System.out.println(main.solution(code));
    }
}
