package LvZero;

import java.util.Arrays;

public class LvZero029 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};

        for (int i=0; i< queries.length; i++){
            int tmp;
            tmp = arr[queries[i][0]];
            arr[queries[i][0]] = arr[queries[i][1]];
            arr[queries[i][1]] = tmp;
        }
        return arr;
    }

    public static void main(String[] args) {
        LvZero029 main = new LvZero029();

        int[] arr = {0, 1, 2, 3, 4};
        int[][] queries = {{0,3},{1,2},{1,4}};
        System.out.println(main.solution(arr, queries));
    }
}
