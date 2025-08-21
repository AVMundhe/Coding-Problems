class Solution {
    public int removeElement(int[] nums, int val) {
       int n = nums.length-1;
        int i=0;
        int c = 0;
        while(i<=n){
            if(nums[i]==val){
                nums[i]=nums[n];
                nums[n]=val;
                n--;
               
            }
            else{i++; c++;}
        }
        return c;
    }
}
