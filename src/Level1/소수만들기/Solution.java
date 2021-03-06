package Level1.소수만들기;

/*
https://programmers.co.kr/learn/courses/30/lessons/12977
 */
class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                for(int k=j+1; k<nums.length; k++){
                    int num = nums[i] + nums[j] + nums[k];
                    if(isPrime(num))
                        answer++;
                }
            }
        }

        return answer;
    }

    public boolean isPrime(int num){
        if(num < 2)
            return false;
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args){
        Solution s = new Solution();
        s.solution(new int[]{1,2,3,4});
    }
}