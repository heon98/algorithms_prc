class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        Integer ab = Integer.valueOf(String.valueOf(a) + String.valueOf(b));
        int a2b = 2 * a * b;
        if (ab > a2b) {
            answer = ab;
        } else { answer = a2b; }
        return answer;
    }
}