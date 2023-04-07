class Solution {
    public int solution(String s) {
        int answer = 0;
		int index = 0;	
		int matchCount = 0;
		int dismatchCount = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(index) == s.toCharArray()[i]) {
				matchCount++;
			} else if (s.charAt(index) != s.toCharArray()[i]) {
				dismatchCount++;
			}
			if (matchCount == dismatchCount) {
				answer += 1;
				index = index + matchCount + dismatchCount;
				matchCount = 0;
				dismatchCount = 0;
			}
		}
		if (dismatchCount > 0 && matchCount > 0) {
			answer+=1;
		}
		else if ((dismatchCount == 0 && matchCount > 0)) {
			answer += 1;
		}
		return answer;
    }
}