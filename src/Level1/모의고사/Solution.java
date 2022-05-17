package Level1.모의고사;

import java.util.*;

/*
https://programmers.co.kr/learn/courses/30/lessons/42840
 */
class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};

        int[] person1 = {1,2,3,4,5};
        int[] person2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] person3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] scores = {0, 0, 0};

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<answers.length; i++){
            if(person1[i % 5] == answers[i]){
                scores[0]++;
            }

            if(person2[i % 8] == answers[i]){
                scores[1]++;
            }

            if(person3[i % 10]  == answers[i]){
                scores[2]++;
            }
        }

        int[] tmp = scores.clone();
        Arrays.sort(tmp);
        int max = tmp[2];

        if(max == 0){
            return new int[]{};
        }

        for(int i=0; i< scores.length; i++){
            if(scores[i] == max)
                list.add(i+1);
        }

        answer = new int[list.size()];
        for(int j=0; j<list.size(); j++){
            answer[j] = list.get(j);
        }

        return answer;
    }
}