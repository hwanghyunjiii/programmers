package Level1.가운데글자가져오기;

public class Solution {
    public String solution(String s) {
        // 단어의 길이가 짝수인 경우
        if(s.length() % 2 == 0){
            return s.substring(s.length()/2-1, s.length()/2+1);
        }
        else{
            return Character.toString(s.charAt(s.length()/2));
        }
    }

    public static void main(String[] args){
        Solution s = new Solution();
        s.solution("abcde");

    }
}