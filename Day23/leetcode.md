# Question 1: 
https://leetcode.com/problems/missing-number/description/ (Microsoft, Amazon, adobe, Facebook, apple, audible, Google, IBM, Oracle)
## Solution 1: 
```
class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer> set= new HashSet<>();
        for(int val:nums){
            set.add(val);
        }
        for(int i=0;i<=nums.length;i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return -1;
    }
}
```
## Solution 2: 
```
class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        for(int val:nums){
            sum+=val;
        }
        int n=nums.length;
        int nSum= n*(n+1)/2;
        return nSum-sum;
    }
}
```
# Question 2:
https://leetcode.com/problems/unique-morse-code-words/description/ ( Apple, Google, Square)
## Solution: 
```
class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        for(int val:nums){
            sum+=val;
        }
        int n=nums.length;
        int nSum= n*(n+1)/2;
        return nSum-sum;
    }
}
```