package Level1.두개뽑아서더하기;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
https://programmers.co.kr/learn/courses/30/lessons/68644
 */
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        Set<Integer> hashSet = new HashSet<Integer>();

        for(int i = 0; i < numbers.length; i++){
            for(int j=i+1; j< numbers.length; j++){
                hashSet.add(numbers[i] + numbers[j]);
            }
        }

        answer = setToArray(hashSet);
        Arrays.sort(answer);
        return answer;
    }

    public int[] setToArray(Set<Integer> set){
        int[] result = new int[set.size()];

        int i = 0;
        for(Integer val: set){
            result[i++] = val;
        }

        return result;
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        int[] numbers = {2,1,3,4,1};

        s.solution(numbers);
    }
}