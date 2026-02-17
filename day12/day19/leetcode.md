# Question 1: 
https://leetcode.com/problems/reverse-string-ii/description/
# Solution: 
```
class Solution {
    public String reverseStr(String s, int k) {
        char arr[]=s.toCharArray();
        for(int i=0;i<s.length();i+=2*k){
            int left=i;
            int right=Math.min(i+k,s.length())-1;
            while(left<right){
                char temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
        }
        return new String(arr);
    }
}
```

# Question 2: 
https://leetcode.com/problems/longest-common-prefix/
## Solution: 
```
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String pre=strs[0];
        for(int i=1;i<strs.length;i++){
            while(pre!=""&&!strs[i].startsWith(pre)){
                pre=pre.substring(0,pre.length()-1);
            }
        }
        return pre;
    }
}
```
# Home work 
- https://leetcode.com/problems/valid-palindrome/description/ (Facebook, Amazon, Apple, Microsoft, Adobe, Atlassian, Bloomberg, Cisco, ebay, LinkedIn, Oracle, Uber, Yahoo)
- https://leetcode.com/problems/number-of-valid-words-in-a-sentence/description/ ( Amazon)
- https://leetcode.com/problems/string-to-integer-atoi/description/ ( Facebook, Amazon, Microsoft, Google, Bloomberg, Adobe, Apple, cisco, ebay, Goldman sachs, LinkedIn, Nvidia, Oracle, Uber)
- https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/description/ ( Apple, Facebook)
- https://leetcode.com/problems/detect-capital/description/ ( Google, Amazon)
- https://leetcode.com/problems/reverse-vowels-of-a-string/description/ (Bloomberg, Google, Facebook, Apple, Amazon)
