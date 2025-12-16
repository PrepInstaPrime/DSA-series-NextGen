# Maths 
# Question 1: 
https://leetcode.com/problems/reverse-integer/
## Sulution: 
```
class Solution {
    public int reverse(int x) {
        boolean neg=false;
        long num=x;
        if(x<0){
            neg=true;
            num=Math.abs(num);
        }
        long rev=0;
        while(num>0){
            long lastDigit=num%10;
            rev=rev*10+lastDigit;
            if(rev>Integer.MAX_VALUE){
                return 0;
            }
            num=num/10;
        }
        return neg?(int)rev*-1:(int)rev;
    }
}
```

# Question 2: 
https://leetcode.com/problems/factorial-trailing-zeroes/
## Solution 1: 
```
class Solution {
    public int trailingZeroes(int n) {
        int count=0;
       for(int i=1;i<=n;i++){
          int num=i;
          while(num%5==0){
            count++;
            num=num/5;
         }
       }
       return count;
    }
}
```