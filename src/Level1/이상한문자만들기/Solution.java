package Level1.이상한문자만들기;

/*
https://programmers.co.kr/learn/courses/30/lessons/12930
 */
public class Solution {
    public String solution(String s) {
        String answer = "";
        String[] array = s.split("");

        int index = 0;
        for(int i=0; i<array.length; i++){
            if(array[i].equals(" ")){
                index = 0;
            }else if(index % 2 == 0){
                array[i] = array[i].toUpperCase();
                index++;
            }else{
                array[i] = array[i].toLowerCase();
                index++;
            }

            answer += array[i];
        }

        return answer;
    }

    public static void main(String[] args){
        Solution s = new Solution();
        System.out.println(s.solution("try hello world"));
    }
}
