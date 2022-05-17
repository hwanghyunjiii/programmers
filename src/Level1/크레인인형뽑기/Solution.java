package Level1.크레인인형뽑기;

import java.util.Stack;

public class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(int position : moves){
            for(int i = 0; i <  board.length; i ++){
                if(board[i][position-1] != 0){ // 인형이 있는 경우
                    int temp = board[i][position-1];
                    board[i][position-1] = 0;

                    if( !stack.isEmpty() && stack.peek() == temp){
                        answer += 2;
                        stack.pop();
                    }else{
                        stack.push(temp);
                    }
                    break; // 계속 인형을 찾지 않음
                }
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Solution s = new Solution();

        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};

        int result = s.solution(board, moves);
        System.out.println(result);
    }
}
