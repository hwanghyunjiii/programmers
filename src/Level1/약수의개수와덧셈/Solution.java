package Level1.약수의개수와덧셈;

/*
https://programmers.co.kr/learn/courses/30/lessons/77884
 */
class Solution {
    public int solution(int left, int right) {
        int answer = 0;

        for(int i=left; i<=right; i++){
            if(i % Math.sqrt(i) == 0) {
                // 약수의 개수가 홀수
                answer -= i;
            }else{
                answer += i;
            }
        }

        return answer;
    }
}