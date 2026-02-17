# Question 1: 
https://leetcode.com/problems/two-sum/description/ ( Amazon, Adobe, Apple, Facebook, Microsoft, Uber, X, Spotify, Snapchat, Samsung, salesforce, Quora, Qualcomm, Paypal, Oracle, nvidia, LinkedIn, Jpmorgan, Indeed, Google, Goldman sachs, ebay, dropbox) 
## Solution: 
```
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int comp=target-nums[i];
            if(map.containsKey(comp)){
                return new int[]{map.get(comp),i};
            }else{
                map.put(nums[i],i);
            }
        }
        return new int[]{-1,-1};
    }
}
```
https://leetcode.com/problems/contains-duplicate-ii/description/ ( Facebook, Google, Adobe, Amazon, uber, AirBnb, Apple, Bloomberg, Microsoft)
## Solution: 
```
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])&&i-map.get(nums[i])<=k){
                return true;
            }else{
                map.put(nums[i],i);
            }
        }
        return false;
    }
}
```
https://leetcode.com/problems/count-elements-with-maximum-frequency/description/ ( Yahoo, uber, Snapchat, Oracle, LinkedIn, Indeed, Goldman sachs)
## Solution: 
```
class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int val:nums){
            map.put(val,map.getOrDefault(val,0)+1);
        }
        int max=0;
        for(int key:map.keySet()){
            int freq=map.get(key);
            max=Math.max(max,freq);
        }
        int sum=0;
        for(int value:map.values()){
            if(value==max){
                sum+=value;
            }
        }
        return sum;
    }
}
```
https://leetcode.com/problems/majority-element/description/ ( Amazon, Microsoft, Adobe, Apple, Google, Facebook, Oracle, SnapChat, X, Uber, yahoo)
## Solution: 
```
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int val:nums){
            map.put(val,map.getOrDefault(val,0)+1);
        }
        for(int key:map.keySet()){
            int freq=map.get(key);
            if(freq>nums.length/2){
                return key;
            }
        }
        return -1;
    }
}
```
# Home Work
- https://leetcode.com/problems/buddy-strings/description/ (DoorDash, FaceBook, Google)
- https://leetcode.com/problems/valid-anagram/description/ ( Facebook, Bloomberg, Amazon, Spotify, Microsoft, Apple, cisco, databricks, Facebook, Goldman sachs, Google, Microsoft, Oracle, PayPal, Snapchat, Uber, yahoo)
- https://leetcode.com/problems/isomorphic-strings/description/ (Amazon, LinkedIn, Google, Yahoo, salesforce, Oracle, Microsoft, Facebook, Bloomberg)
- https://leetcode.com/problems/jewels-and-stones/description/ (Amazon, Adobe, Google, Apple, Facebook)
- https://leetcode.com/problems/word-pattern/description/ (Amazon, Bolt, Uber, Adobe, uber, Microsoft, Google, Facebook, Dropbox) 

