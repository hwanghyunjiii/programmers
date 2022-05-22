package Level1.삼진법뒤집기;

/*
https://programmers.co.kr/learn/courses/30/lessons/68935
 */
public class Solution {
    public int solution(int n) {
        int answer = 0;
        int N = n;
        StringBuilder sb = new StringBuilder();

        // 3진법으로 변환
        while(N > 0){
            sb.append(N % 3);
            N /= 3;
        }

        // 앞뒤 반전
        sb.reverse();

        // 10진법으로 변환
        for(int i=0; i <sb.toString().length(); i++){
            answer = answer + (int)Math.pow(3, i) * (sb.toString().charAt(i) - '0');
        }

        return answer;
    }

    public static void main(String[] args){
        Solution s = new Solution();
        s.solution(45);
    }
}
