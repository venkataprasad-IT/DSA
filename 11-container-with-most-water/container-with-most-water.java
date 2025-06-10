class Solution {
    public int maxArea(int[] height) {
        int maxx=0;
        int st=0;
        int end=height.length-1;

        while(st< end){
            int temp= (end-st)* Math.min(height[end], height[st]);
            maxx= Math.max(maxx, temp);
            if(height[end]< height[st]) {
                end--;
            }else{
                st++;
            }
        }
        return maxx;
    }
}