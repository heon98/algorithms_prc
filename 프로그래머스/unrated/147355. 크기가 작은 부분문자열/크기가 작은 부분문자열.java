class Solution {
    public int solution(String t, String p) {
        int answer = 0;

		if (p.length() > 1) {
				for (int i = 0; i < t.length() - p.length()+1; i++) {
					if (Long.valueOf(t.substring(i, i + p.length())) <= Long.valueOf(p)) {
						answer += 1;
					}
				}
		} 
        else {
			for (int i = 0; i < t.length() ; i++) {
				if (Long.valueOf(t.substring(i,i+1)) <= Long.valueOf(p)) {
					answer += 1;
				}
			}
		}
		return answer;
    }
}