package Level1.K번째수;
import java.util.Arrays;

/*
https://programmers.co.kr/learn/courses/30/lessons/42748
 */
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        answer = new int[commands.length];

        for (int i = 0; i < commands.length; i ++) {
            // i번째부터 j번째 배열 복사
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            // 복사한 배열을 정렬
            Arrays.sort(temp);
            // k 번째 숫자
            answer[i] = temp[commands[i][2] - 1];
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        s.solution(array, commands);
    }
}