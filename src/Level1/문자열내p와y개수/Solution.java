package Level1.문자열내p와y개수;

/*
https://programmers.co.kr/learn/courses/30/lessons/12916
 */
class Solution {
    boolean solution(String s) {
        int count = 0;

        s = s.toLowerCase();

        for(int i=0; i<s.length(); i++){

            if(s.charAt(i) == 'p')
                count ++;
            else if(s.charAt(i) == 'y')
                count --;
        }

        return count == 0;
    }

    public static void main(String[] args){
        Solution s = new Solution();
        boolean result = s.solution("pPoooyY");
        System.out.println(result);
    }
}