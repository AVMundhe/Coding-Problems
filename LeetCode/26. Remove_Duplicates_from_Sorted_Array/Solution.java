class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0;
        int c=Integer.MIN_VALUE;
        int j = 0;
        for(int i=0; i< nums.length ; i++){

            if(nums[i]!=c){
                nums[k++]=nums[i];
                c=nums[i];
            }
            else{
               
            }
        }
        return k;
    }
}
