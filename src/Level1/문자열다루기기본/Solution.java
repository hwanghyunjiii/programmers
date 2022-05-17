package Level1.문자열다루기기본;

/*
https://programmers.co.kr/learn/courses/30/lessons/12918
 */
class Solution {
    public boolean solution(String s) {
        boolean answer = true;

        if( s.length() != 4 && s.length() != 6){
            answer = false;
        }else {
            answer = s.matches("[0-9]+");
        }

        return answer;
    }
}
