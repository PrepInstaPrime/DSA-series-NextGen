# Question 1: 
https://leetcode.com/problems/guess-number-higher-or-lower/ 
## Solution: 
```
/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
       int start=1;
       int end=n;
       while(start<=end){
          int mid=start+(end-start)/2;
          int res=guess(mid);
          if(res==-1){
            end=mid-1;
          }else if(res==1){
            start=mid+1;
          }else{
            return mid;
          }
       }
       return -1;
    }
}
```
# Question 2: 
https://leetcode.com/problems/count-primes/
## Solution: 
```
class Solution {
    public int countPrimes(int n) {
        if(n<2){
            return 0;
        }
        boolean primes[]=new boolean[n];
        Arrays.fill(primes,true);
        int count=0;
        primes[0]=primes[1]=false;
        for(int i=2;i*i<n;i++){
            if(primes[i]){
                for(int j=i*i;j<n;j+=i){
                    primes[j]=false;
                }
            }
        }
        for(int i=2;i<n;i++){
            if(primes[i]){
                count++;
            }
        }
        return count;
    }
}
```
# Question: 3: 
https://leetcode.com/problems/perfect-number/
## Solution: 
```
class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum=sum+i;
            }
        }
        if(sum==num){
            return true;
        }
        return false;
    }
}
```

# Question:4
https://leetcode.com/problems/ugly-number/description/
## Solution: 
```
class Solution {
    public boolean isUgly(int n) {
        if(n==0){
            return false;
        }
        if(n==1){
            return true;
        }
        while(n%2==0){
            n=n/2;
            if(n==1){
                return true;
            }
        }
        while(n%3==0){
            n=n/3;
            if(n==1){
                return true;
            }
        }
        while(n%5==0){
            n=n/5;
            if(n==1){
                return true;
            }
        }
        return false;
    }
}
```
# Question 5: 
https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
## Solution: 
```
class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int n:nums){
            String str=n+"";
            if(str.length()%2==0){
                count++;
            }
        }
        return count;
    }
}
```