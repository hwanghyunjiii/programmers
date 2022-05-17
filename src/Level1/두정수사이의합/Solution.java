package Level1.두정수사이의합;

/*
https://programmers.co.kr/learn/courses/30/lessons/12912
 */
class Solution {
    public long solution(int a, int b) {
        return getSum(Math.min(a,b), Math.max(a,b));
    }

    public long getSum(long a, long b){
        // 등차수열의 합 공식 (1항부터 n항까지)
        // 첫째항이 a, 마지막 항이 b 일때
        // n(a+b)/ 2
        return (b - a + 1) * (a + b) / 2 ;
    }

    public static void main(String[] args){
        Solution s = new Solution();
        s.solution(5, 3);
    }
}
