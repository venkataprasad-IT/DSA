class Solution {
    public boolean check(int[] nums) {
        if(nums.length <=2 ) return true; 
        int flag= 0;
        
        int x= nums.length;
        for(int i=0; i<nums.length; i++){
            if(nums[(i+1)%x]< nums[i]){
                 flag++;
                 if(flag>1) return false;
            }
        }

        return true;
    }
}