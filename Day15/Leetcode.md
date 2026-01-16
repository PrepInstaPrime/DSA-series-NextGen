# Question 1: 
https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/ 
## Solution: 
```
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start=0;
        int end= numbers.length-1;
        while(start<end){
            int sum= numbers[start]+numbers[end];
            if(sum>target){
                end--;
            }else if(sum<target){
                start++;
            }else if(target==sum){
                return new int[]{start+1,end+1};
            }
        }
        return new int[]{-1,-1};
    }
}
```

# Question 2: 
https://leetcode.com/problems/palindrome-number/
## Solution : 
```
class Solution {
    public boolean isPalindrome(int x) {
        String str=x+"";
        int start=0;
        int end= str.length()-1;
        while(start<end){
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
```
# Question 3: 
https://leetcode.com/problems/remove-element/description/
## Solution: 
```
class Solution {
    public int removeElement(int[] nums, int val) {
      int i=0;
      for(int j=0;j<nums.length;j++){
        if(nums[j]!=val){
          nums[i]=nums[j];
          i++;  
        }
      }  
      return i;
    }
}
```

# Home work
- https://leetcode.com/problems/container-with-most-water/ ( Google, Facebook, Amazon, Adobe)
- https://leetcode.com/problems/3sum-closest/description/ ( Adobe, Amazon, Apple, bloomberg, Facebook, Goldman sachs, google, Microsoft, uber)
