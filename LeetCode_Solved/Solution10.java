class Solution10 {
    // leetcode Problem link:-->https://leetcode.com/problems/remove-duplicates-from-sorted-array/?envType=problem-list-v2&envId=array  
    public int removeDuplicates(int[] nums) {
       int count = 0;

       for(int i =0; i<nums.length;i++){
          if(i<nums.length-1 && nums[i]==nums[i+1]){
               continue;
            }else{
             nums[count]=nums[i];
             count++;
            }
        }
       return count; 
    }
}
