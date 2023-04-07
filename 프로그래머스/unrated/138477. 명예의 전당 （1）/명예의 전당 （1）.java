import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        List<Integer> minList = new ArrayList<>(); // 최소값 모음
		List<Integer> ranking = new ArrayList<>(k); // 명예의 전당
		for (int num : score) {
			if (ranking.size() < k) { // 전당이 꽉 차지 않은 경우
				ranking.add(num); // 전당에 그냥 넣음
				minList.add(Collections.min(ranking)); // 전당에 최솟값을 minList에 넣어줌
			} else if (ranking.size() >= k) { // 명예의 전당이 꽉 찬 경우
				if (num > Collections.min(ranking)) {
					ranking.remove(Collections.min(ranking));
					ranking.add(num);
					minList.add(Collections.min(ranking));
				} else {
					minList.add(Collections.min(ranking));
				}
			}
		}
		int[] answer = minList.stream().mapToInt(Integer::intValue).toArray();

		return answer;
    }
}   