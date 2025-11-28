# Question 1:
https://leetcode.com/problems/add-digits/
## Solution 1:
```
class Solution {
    static int digitSum(int num){
        int sum=0;
        while(num>0){
            int ld=num%10;
            sum= sum+ld;
            num=num/10;
        }
        return sum;
    }
    public int addDigits(int num) {
        while(num>9){
            num=digitSum(num);
        }
        return num;
    }
}
```
## Solution 2: 
```
class Solution {
    public int addDigits(int num) {
        if(num==0){
            return 0;
        }
        if(num%9==0){
            return 9;
        }
        return num%9;
    }
}
```
# Home work
1. https://leetcode.com/problems/reverse-integer/description/  (Apple, Google(I), Amazon(I), facebook, bloomberg) 
2. https://leetcode.com/problems/factorial-trailing-zeroes/description/ ( Amazon, Facebook, bloomberg, Microsoft)
3. https://leetcode.com/problems/powx-n/description/ ( google, Amazon,Microsoft,bloomberg, facebook)
4. https://leetcode.com/problems/power-of-three/  (Google, Apple)
