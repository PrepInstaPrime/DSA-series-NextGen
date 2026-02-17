# Question 1: 
https://leetcode.com/problems/first-unique-character-in-a-string/
## Solution
```
class Solution {
    public int firstUniqChar(String s) {
        int freq[]= new int[26];
       for(int i=0;i<s.length();i++) {
            int idx=s.charAt(i)-'a';
            freq[idx]++;
       }
       for(int i=0;i<s.length();i++){
         int idx=s.charAt(i)-'a';
         if(freq[idx]==1){
            return i;
         }
       }
       return -1;
    }
}
```