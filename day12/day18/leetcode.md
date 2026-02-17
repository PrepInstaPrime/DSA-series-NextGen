# Question 1: 
https://leetcode.com/problems/length-of-last-word/
## Solution 1: 
```
class Solution {
    public int lengthOfLastWord(String s) {
        s= s.trim();
        String arr[]=s.split(" ");
        return arr[arr.length-1].length();
    }
}
```
## Solutoin 2: 
```
class Solution {
    public int lengthOfLastWord(String s) {
        s= s.trim();
        int count=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                count++;
            }else{
                break;
            }
        }
        return count;
    }
}
```

# Question 2: 
https://leetcode.com/problems/check-if-one-string-swap-can-make-strings-equal/
## Solution: 
```
class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int mismatch[] =new int [2];
        int count=0;
        // find mismatches
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                count++;
                if(count>2){
                    return false;
                }
                mismatch[count-1]=i;
            }
        }
        // check cross 
        return s1.charAt(mismatch[0])==s2.charAt(mismatch[1])&&s1.charAt(mismatch[1])==s2.charAt(mismatch[0]);

    }
}
```

# Question 3: 
https://leetcode.com/problems/roman-to-integer/
## Solution: 
```
class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map= new HashMap<>();
        int res=0;
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        for(int i=0;i<s.length();i++){
            if(i<s.length()-1&&map.get(s.charAt(i))<map.get(s.charAt(i+1))){
                res=res-map.get(s.charAt(i));
            }else{
                res=res+map.get(s.charAt(i));
            }
        }
        return res;

    }
}
```

# Home Work
- https://leetcode.com/problems/reverse-string-ii/ (Amazon, Adobe, Google, Microsoft)
- https://leetcode.com/problems/longest-common-prefix/description/ (Facebook, Apple, Google, Adobe, Amazon, Bloomberg, cisco, ebay, IBM, Microsoft, Oracle, Pinterest, snapchat)
