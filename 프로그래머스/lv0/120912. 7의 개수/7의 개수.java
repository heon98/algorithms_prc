import java.util.*;
import java.util.stream.IntStream;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for (int i : array){
            String temp = String.valueOf(i);
            char[] numarray = temp.toCharArray();
            for (char s : numarray) {
                if (s == '7') {
                    answer+=1;
                }
            }
        }
        return answer;
    }
}