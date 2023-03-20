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
//      answerList.stream().mapToInt(i -> i)는 List<Integer> 타입의 answerList를 int 타입의 스트림으로 변환하고, mapToInt(i -> i)를 통해 int 타입으로 변환한 뒤, 이를 다시 int[] 타입으로 변환하여 int[] answer에 대입하는 코드
        return answer;
    }
}
