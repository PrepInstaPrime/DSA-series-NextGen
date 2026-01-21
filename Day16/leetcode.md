# Question 1
https://leetcode.com/problems/container-with-most-water/description/
## Solution 
```
class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int maxArea=0;
        while(left<right){
            int area= (right-left)*Math.min(height[left],height[right]);
                maxArea= Math.max(maxArea,area);
                if(height[left]<height[right]){
                    left++;
                }else{
                    right--;
                }
        }
        return maxArea;
    }
}
```

# Question 2
https://leetcode.com/problems/3sum-closest/description/
## Solution 
```
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int cs= nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length-2;i++){
            int left= i+1;
            int right=nums.length-1;
            while(left<right){
                int currsum=nums[i]+nums[left]+nums[right];
                if(Math.abs(target-currsum)<Math.abs(target-cs)){
                    cs=currsum;
                }
                if(currsum<target){
                    left++;
                }else if(currsum>target){
                    right--;
                }else{
                    return target;
                }
            }
        }
        return cs;
    }
}
```

# Question 3
https://leetcode.com/problems/squares-of-a-sorted-array/description/
## Solution 
```
class Solution {
    public int[] sortedSquares(int[] nums) {
        int n= nums.length;
        int res[]= new int[n];
        int left=0;
        int right=n-1;
        int k=n-1;
        while(left<=right){
            if(Math.abs(nums[left])<Math.abs(nums[right])){
                res[k]=nums[right]*nums[right];
                right--;
            }else{
                res[k]=nums[left]*nums[left];
                left++;
            }
            k--;
        }
        return res;
    }
}
```