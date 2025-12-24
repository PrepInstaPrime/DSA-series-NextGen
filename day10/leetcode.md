# Question 1: 
https://leetcode.com/problems/maximum-subarray/
## Solution: 
```
class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum=nums[0];
        int currSum=nums[0];
        for(int i=1;i<nums.length;i++){
            currSum=Math.max(nums[i],currSum+nums[i]);
            maxSum=Math.max(currSum,maxSum);
        }
        return maxSum;
    }
}
```
# Question 2: 
https://leetcode.com/problems/merge-intervals/
## Solution: 
```
class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<int[]> list= new ArrayList<>();
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        list.add(intervals[0]);
        for(int i=1;i<intervals.length;i++){
            int prev[]=list.get(list.size()-1);
            int next[]=intervals[i];
            if(prev[1]>=next[0]){
               prev[1] =Math.max(prev[1],next[1]);
            }
            else{
                list.add(intervals[i]);
            }
        }
        return list.toArray(new int[list.size()][2]);
    }
}
```
# Home Work : 
- https://leetcode.com/problems/search-in-rotated-sorted-array/description/
- https://leetcode.com/problems/intersection-of-two-arrays-ii/description/