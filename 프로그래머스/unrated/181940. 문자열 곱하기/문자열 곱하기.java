class Solution {
    public String solution(String my_string, int k) {
        String answer = "";
        int count = 0;
        while (count < k) {
            answer += my_string;
            count+=1;
        }
        return answer;
    }
}