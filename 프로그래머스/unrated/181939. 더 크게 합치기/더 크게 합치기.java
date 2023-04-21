class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        Integer ab = Integer.valueOf(String.valueOf(a) + String.valueOf(b));
        Integer ba = Integer.valueOf(String.valueOf(b) + String.valueOf(a));
        if (ab > ba) {
            answer = ab;
        }else { answer = ba; }
        return answer;
    }
}