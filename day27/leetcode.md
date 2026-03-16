# Question 1:
https://leetcode.com/problems/subarray-sum-equals-k/description/ ( Facebook, Amazon, Google, Microsoft, Yahoo, uber, Snapchat, Oracle, LinkedIn, Indeed, Goldman sachs, ebay, Bloomberg, Apple)
## Solution: 
```
class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int count=0;
        int sum=0;
        map.put(0,1);
        for(int val:nums){
            sum+=val;
            count+=map.getOrDefault(sum-k,0);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
```
# Question 2: 
https://leetcode.com/problems/continuous-subarray-sum/description/ (Amazon, Meta, Google, LinkedIn, Microsoft, Apple, Paytm)
## Solution: 
```
class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum=0;
        map.put(0,-1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int rem=sum%k; 
            if(map.containsKey(rem)){
                if(i-map.getOrDefault(rem,0)>1){
                    return true;
                }
            }else{
                map.put(rem,i);
            }
        }
        return false;
    }
}
```
## Home Work
- https://leetcode.com/problems/contiguous-array/description/ (Amazon, Meta, Google, Microsoft, Apple, Uber)
- https://leetcode.com/problems/product-of-array-except-self/description/ (Amazon, Meta, Google, Microsoft, Apple, Bloomberg)
- https://leetcode.com/problems/find-pivot-index/description/ (Amazon, Adobe, Coupang, Radius)​
