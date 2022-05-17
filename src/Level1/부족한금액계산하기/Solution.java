package Level1.부족한금액계산하기;

class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        long total  = 0;

        for(int i = 1; i <= count; i++){
            total += price * i;
        }

        return money > total ? 0 : total - money;
    }
}