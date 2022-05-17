package Level1.자릿수더하기;

/*
https://programmers.co.kr/learn/courses/30/lessons/12931
 */
public class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = String.valueOf(n);

        for(int i = 0; i < str.length(); i ++){
            answer += Integer.parseInt(Character.toString(str.charAt(i)));
        }

        return answer;
    }

    public static void main(String[] args){
        Solution s = new Solution();
        s.solution(123);
    }
}
