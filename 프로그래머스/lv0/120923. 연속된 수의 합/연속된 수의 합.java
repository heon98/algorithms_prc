import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] solution(int num, int total) {
        List<Integer> answerList = new ArrayList<>();
        int start = (2*total - num * (num-1)) / (2*num);
        
        for (int i = start ; answerList.size() < num ; i++){
            answerList.add(i);
        }
        
        int[] answer = answerList.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}