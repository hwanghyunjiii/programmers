package Level1.같은숫자는싫어;

import java.util.*;

/*
https://programmers.co.kr/learn/courses/30/lessons/12906
 */
public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        Stack<Integer> stack = new Stack<>();

        for(int i : arr){
            if(!stack.isEmpty() && stack.peek() == i){
                continue;
            }else{
                stack.push(i);
            }
        }

        answer = new int[stack.size()];
        for(int j=0; j<stack.size(); j++){
            answer[j] = stack.get(j);
        }

        return answer;
    }
}