import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public String[] solution(String my_str, int n) {
        List<String> list = new ArrayList();
        int range = my_str.length();
        int i = 0;
        
        while(true) {
            if (range % n == 0) {
            list.add(my_str.substring(i,i+n));
            }
            else {        // 16 / 6 * 6 = 12
                if (i == (range / n)*n) {
                    list.add(my_str.substring(i,i+(range%n)));
                    break;
                }
                else {
                    list.add(my_str.substring(i,i+n));
                }
            }
            i+=n;
            if (i+1 > range) {
                break;
            }
        }
        
        String[] answer = list.toArray(new String[list.size()]);
        
        return answer;
    }
}
