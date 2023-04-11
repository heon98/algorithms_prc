import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
		int sum = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		// HashMap<크기, 개수>
		for (int i : tangerine) {
			map.put(i, map.getOrDefault(i, 0) + 1);
		} // hashMap에 크기와 개수를 저장
		List<Integer> li1 = new ArrayList<>();
		for (int i : map.keySet()) {
			li1.add(map.get(i));
		} // list에 크기에 따른 개수(hashMap의 value)를 저장
		li1.sort(Collections.reverseOrder()); // list에서 개수가 많은 순으로 나열

		// 종류가 적으려면 k에서 크기의 개수가 많은 순으로 더하다가 k보다 크면 끝.
        for (Integer x : li1) {
            answer++;
            sum += x;
            if (sum >= k) {
                break;
            }
        }
		
		
		return answer;
    }
}