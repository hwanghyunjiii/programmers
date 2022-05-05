package Level1.요일구하기;

import java.time.DayOfWeek;
import java.time.LocalDate;

/*
https://programmers.co.kr/learn/courses/30/lessons/12901
 */
public class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] days = {"", "MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};

        //Java 8 이후에서는 날짜를 표현하기 위해 java.time.LocalDateTime, java.time.LocalDate 클래스를 주로 사용
        //LocalDate 생성
        LocalDate date = LocalDate.of(2016, a, b);

        //DayOfWeek 객체
        DayOfWeek dayOfWeek = date.getDayOfWeek();

        //요일(월요일:1 ~ 일요일:7) 구하기
        int day = dayOfWeek.getValue();

        //요일 이름 구하기
        answer = days[day];

        return answer;
    }

    public static void main(String[] args){
        Solution s = new Solution();
        int a = 5;
        int b = 24;
        s.solution(a, b);
    }
}
