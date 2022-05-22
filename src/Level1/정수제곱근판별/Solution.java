package Level1.정수제곱근판별;

/*
https://programmers.co.kr/learn/courses/30/lessons/12934
 */
class Solution {
    public long solution(long n) {
        long answer = 0;
        if(n % Math.sqrt(n) == 0){
            answer = (long) ((Math.sqrt(n) + 1) * (Math.sqrt(n) + 1));
        }else{
            answer = -1;
        }
        return answer;
    }
}