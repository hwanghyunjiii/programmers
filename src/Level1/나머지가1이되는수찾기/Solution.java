package Level1.나머지가1이되는수찾기;

class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i =1; i <= n-1; i++){
            if(n % i == 1){
                return i;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Solution s = new Solution();
        s.solution(12);
    }
}