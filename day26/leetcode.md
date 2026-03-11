# Question 1: 
https://leetcode.com/problems/length-of-longest-subarray-with-at-most-k-frequency/description/ ( Google, Amazon)
## Solution : 
```
class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer, Integer> map= new HashMap<>();
        int start=0;
        int maxSize=0;
        for(int end=0;end<nums.length;end++){
            map.put(nums[end],map.getOrDefault(nums[end],0)+1);
            while(map.get(nums[end])>k){
                map.put(nums[start],map.get(nums[start])-1);
                start++;
            }
            maxSize=Math.max(maxSize,end-start+1);
        }
        return maxSize;
    }
}
```
# Question 2: 
https://leetcode.com/problems/longest-substring-without-repeating-characters/description/  ( Amazon, Facebook, Apple , Microsoft, google, bloomberg)
## Solution : 
```
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int start=0;
        int maxSize=0;
        for(int end=0;end<s.length();end++){
            while(map.getOrDefault(s.charAt(end),0)==1){
                map.put(s.charAt(start),0);
                start++;
            }
            map.put(s.charAt(end),1);
            maxSize= Math.max(maxSize,end-start+1);
        }
        return maxSize;
    }
}
```
# Home Work
- https://leetcode.com/problems/find-all-anagrams-in-a-string/description/  ( Amazon, Microsoft, adobe, Apple, facebook)
- ​​https://leetcode.com/problems/permutation-in-string/description/ (Amazon, Microsoft, Oracle, Apple, Yandex)
- https://leetcode.com/problems/longest-substring-with-at-least-k-repeating-characters/description/ ( Amazon, Microsoft)
- https://leetcode.com/problems/longest-repeating-character-replacement/description/ ( Google, Amazon, Uber, Adobe)
- https://leetcode.com/problems/max-consecutive-ones-iii/description/  ( Facebook, Microsoft, Google, Amazon, ByteDance) 
