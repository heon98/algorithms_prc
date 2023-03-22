class Solution {
    public int[] solution(String[] wallpaper) {
        int xMin = wallpaper[0].length();
        int yMin = wallpaper.length;
        int xMax=0 , yMax = 0;
        
        for (int i = 0; i <wallpaper.length; i++) {
            int firstLoc = wallpaper[i].indexOf("#");
            int lastLoc = wallpaper[i].lastIndexOf("#");
            
            if (firstLoc >= 0) {
                if(firstLoc < xMin) {
                    xMin = firstLoc;
                }
                if (lastLoc > xMax) {
                    xMax = lastLoc;
                }
                if (i < yMin) {
                    yMin = i;
                }
                if (i > yMax) {
                    yMax = i;
                }
            }
        }
        
        int[] answer = {yMin, xMin, yMax+1, xMax+1};
        return answer;
    }
}