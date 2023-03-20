
class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for (String babble : babbling) {
            if (babble.contains("aya") || babble.contains("ye") ||
               babble.contains("woo") || babble.contains("ma")) {
                babble = babble.replace("aya", " ");
                babble = babble.replace("ye", " ");
                babble = babble.replace("woo", " ");
                babble = babble.replace("ma", " ");
                babble = babble.replace(" ", "");
            }
            if (babble.length() == 0) {
                answer+=1;
            }
        }
        return answer;
    }
}