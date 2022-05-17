package Level1.문자열내림차순으로배치하기;

import java.util.*;
/*
https://programmers.co.kr/learn/courses/30/lessons/12917
 */
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] array = s.split("");

        Arrays.sort(array, Collections.reverseOrder());

        for(String val: array){
            answer += val;
        }
        return answer;
    }
}