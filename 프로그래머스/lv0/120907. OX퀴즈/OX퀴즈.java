import java.util.*; 
class Solution {
    public String[] solution(String[] quiz) {
        List<String> answerList = new ArrayList();
        
        for (String q : quiz ) {
            String[] qSplit = q.split(" ");
            if (qSplit[1].equals("-")) {
                if (Integer.valueOf(qSplit[4]) == (Integer.valueOf(qSplit[0]) - Integer.valueOf(qSplit[2]))) {
                 answerList.add("O");   
                } else answerList.add("X");
            }
            if (qSplit[1].equals("+")){
                if (Integer.valueOf(qSplit[4]) == (Integer.valueOf(qSplit[0]) + Integer.valueOf(qSplit[2]))) {
                 answerList.add("O");   
                } else answerList.add("X");
            }
        }
        String[] answer = answerList.toArray(new String[answerList.size()]);
        return answer;
    }
}