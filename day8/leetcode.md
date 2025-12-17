# Question 1: 
https://leetcode.com/problems/reverse-integer/description/
## Solution: 
```
class Solution {
    public int reverse(int x) {
       long num=x;
       boolean neg=false;
       long rev=0;
       if(x<0){
        neg=true;
        num=Math.abs(num);
       } 
       while(num>0){
         long ld= num%10;
         rev=rev*10+ld;
         if(rev>Integer.MAX_VALUE){
            return 0;
         }
         num=num/10;
       }
       return neg? (int)rev*-1:(int)rev;
    }
}
```

# Question 2: 
https://leetcode.com/problems/factorial-trailing-zeroes/
## Solution 1
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
## Solution 2
```
class Solution {
    public int trailingZeroes(int n) {
        int count=0;
        while(n>0){
            count=count+n/5;
            n=n/5;
        }
        return count;
    }
}
```
# Question 3: 
https://leetcode.com/problems/powx-n/description/
## Solution: 
```
class Solution {
    public double myPow(double x, int n) {
        double res=1;
        long p=n;
        if(n<0){
            x=1/x;
            p=Math.abs(p);
        }
        while(p>0){
            if(p%2==0){
                x=x*x;
                p=p/2;
            }else{
              res*=x;
              p--;
            }
            
        }
        return res;
    }
}
```
# Question 4: 
https://leetcode.com/problems/power-of-three/
## Solution: 
```
class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0){
            return false;
        }
        if(n==1){
            return true;
        }
        while(n%3==0){
            n=n/3;
            if(n==1){
                return true;
            }
        }
        return false;
    }
}
```