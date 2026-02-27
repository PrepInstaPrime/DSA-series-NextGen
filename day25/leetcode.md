# Question 1
https://leetcode.com/problems/binary-subarrays-with-sum/description/ (Amazon, Meta, Uber, Google)
## Solution
```
class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return countSub(nums,goal)-countSub(nums,goal-1);
    }
    public int countSub(int nums[],int goal){
        int left=0;
        int sum=0;
        int ns=0;
        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
            while(sum>goal&&left<=right){
                sum-=nums[left];
                left++;
            }
            ns+=right-left+1;
        }
        return ns;
    }
}
```
# Question 2
https://leetcode.com/problems/count-number-of-nice-subarrays/description/ ( Amazon, Adobe, Roblox , Booking.com)
## Solution
```
class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]%2;
        }
        return countSub(nums,k)-countSub(nums,k-1);
    }
    public int countSub(int nums[],int goal){
        int left=0;
        int sum=0;
        int ns=0;
        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
            while(sum>goal&&left<=right){
                sum-=nums[left];
                left++;
            }
            ns+=right-left+1;
        }
        return ns;
    }
}
```

# Practice 
- https://leetcode.com/problems/length-of-longest-subarray-with-at-most-k-frequency/description/ ( Google, Amazon)
- https://leetcode.com/problems/longest-substring-without-repeating-characters/description/  ( Amazon, Facebook, Apple , Microsoft, google, bloomberg)
