# Question 1: 
https://leetcode.com/problems/third-maximum-number/description/
# Solution: 
```
class Solution {
    public int thirdMax(int[] nums) {
        long first= Long.MIN_VALUE;
        long second= Long.MIN_VALUE;
        long third= Long.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>first){
                third=second;
                second=first;
                first=nums[i];
            }else if(nums[i]>second&&nums[i]!=first){
                third=second;
                second=nums[i];
            }else if(nums[i]>third&&nums[i]!=second&&nums[i]!=first){
                third=nums[i];
            }
        }
        return third==Long.MIN_VALUE?(int)first:(int)third;

    }
}
```
# Question 2: 
https://leetcode.com/problems/single-number/description/
## Solution: 
```
class Solution {
    public int singleNumber(int[] nums) {
        int num=nums[0];
        for(int i=1;i<nums.length;i++){
            num=num^nums[i];
        }
        return num;
    }
}
```
# Question 3: 
https://leetcode.com/problems/find-peak-element/
## Solution: 
```
class Solution {
    public int findPeakElement(int[] nums) {
       int start=0;
       int end=nums.length-1;
       while(start<end){
           int mid= start+(end-start)/2;
           if(mid==nums.length-1){
              break;
           }
           if(nums[mid]>nums[mid+1]){
                end=mid;
           }else{
                start=mid+1;
           }
       }
       return end;
    }
}
```

# Home Work
- https://leetcode.com/problems/plus-one/description/ (Amazon, Apple, Bloomberg, ebay, Facebook, Google, spotify, uber)
- https://leetcode.com/problems/height-checker/description/ ( Adobe, Amazon, GoldMan sachs, Google)
- https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array (Amazon, Apple, Bloomberg, Facebook, Google, LinkedIn, Microsoft, Netflix, Oracle)
