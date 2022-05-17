package Level1.신고결과받기;

import java.util.*;

/*
https://programmers.co.kr/learn/courses/30/lessons/92334
 */
public class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, HashSet<String>> reporterMap = new HashMap<>();
        Map<String, Integer> reportedMap = new HashMap<>();

        for(String rep : report){
            String reporter = rep.split(" ")[0]; // 신고한 사람
            String reported = rep.split(" ")[1]; // 신고당한 사람

            boolean isDuplicate = false;

            // 신고 내역이 있는 경우
            if(reporterMap.containsKey(reporter)) {
                // 이미 신고한 유저 신고 여부 확인
                if(reporterMap.get(reporter).contains(reported)){
                    isDuplicate = true;
                }
                else{
                    reporterMap.get(reporter).add(reported);
                }
            }
            // 신고 내역이 없는 경우
            else {
                reporterMap.put(reporter, new HashSet<>(){{
                    add(reported);
                }});
            }

            if(isDuplicate){
                // 동일한 유저에 대한 신고 횟수는 1회로 처리
                continue;
            }else{
                reportedMap.put(reported, reportedMap.getOrDefault(reported, 0) + 1);
            }
        }

        for(String reported : reportedMap.keySet()){
            // k번 이상 신고당한 경우
            if(reportedMap.get(reported) >= k){
                // 메일 발송 대상
                for(int i=0; i<id_list.length; i++){
                    if(reporterMap.get(id_list[i]) == null){
                        answer[i] = 0;
                    }
                    else if(reporterMap.get(id_list[i]).contains(reported)){
                        answer[i] ++;
                    }
                }
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Solution s = new Solution();

        /*
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report  = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;

         */
        String[] id_list  = {"con", "ryan"};
        String[] report  = {"ryan con", "ryan con", "ryan con", "ryan con"};
        int k = 3;

        int[] result = s.solution(id_list, report, k);
        for(int val : result){
            System.out.print(val + " ");
        }
    }
}
