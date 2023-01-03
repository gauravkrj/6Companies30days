class Solution {
    public int maxRotateFunction(int[] nums) {
       int n = nums.length;
       int f = 0;
       int sum = 0;
       for(int i = 0; i<n; i++){
           sum=sum+nums[i];
           f=f+i*nums[i];
       } 

       int g = f;
       for(int i=n-1; i>0; i-- ){
          f=f+sum-n*nums[i];
          g=Math.max(g,f); 
       }

       return g;
    }
}
