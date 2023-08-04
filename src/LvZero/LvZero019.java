package LvZero;

public class LvZero019 {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;

        if (ineq.equals(">")){
            if (eq.equals("=")){
                answer = n >= m ? 1 : 0;
            }else if (eq.equals("!")){
                answer = n > m ? 1 : 0;
            }
        }else if (ineq.equals("<")){
            if (eq.equals("=")){
                answer = n <= m ? 1 : 0;
            }else if (eq.equals("!")){
                answer = n < m ? 1 : 0;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        LvZero019 main = new LvZero019();
        String ineq = "";
        String eq = "";
        int n = 20;
        int m = 50;

        System.out.println(main.solution(ineq, eq, n, m));
    }
}
