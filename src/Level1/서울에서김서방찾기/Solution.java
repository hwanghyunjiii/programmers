package Level1.서울에서김서방찾기;

class Solution {
    public String solution(String[] seoul) {
        String answer = "김서방은 i에 있다";

        int i;
        for(i=0; i<seoul.length; i++){
            if(seoul[i].equals("Kim")){
                break;
            }
        }

        System.out.println(i);
        answer = answer.replace("i", String.valueOf(i));
        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args){
        Solution s = new Solution();
        s.solution(new String[]{"Jane", "Kim"});
    }
}