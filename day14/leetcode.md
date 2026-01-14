# Question 1:
https://leetcode.com/problems/move-zeroes/
## Solution: 
```
class Solution {
    public void moveZeroes(int[] nums) {
        int start=0;
        for(int end=0;end<nums.length;end++){
            if(nums[end]!=0){
                int temp=nums[start];
                nums[start]=nums[end];
                nums[end]=temp;
                start++;
            }
        }
    }
}
```
# Question 2: 
https://leetcode.com/problems/sort-colors/description/
## Solution: 
```
class Solution {
    public void swap(int nums[],int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void sortColors(int[] nums) {
        int start=0;
        int end=nums.length-1;
        int one=0;
        while(one<=end){
            if(nums[one]==2){
                swap(nums,one,end);
                end--;
            }else if(nums[one]==1){
                one++;
            }else if(nums[one]==0){
                swap(nums,one,start);
                one++;
                start++;
            }
        }
    }
}
```

# Question 3: 
https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
## Solution: 
```
class Solution {
    public int removeDuplicates(int[] nums) {
        int start=0;
        for(int end=1;end<nums.length;end++){
            if(nums[start]!=nums[end]){
                start++;
                nums[start]=nums[end];
            }
        }
        return start+1;
    }
}
```

# Home work: 
- https://leetcode.com/problems/reverse-string/description/ ( Uber, Oracle, Microsoft, Google, Facebook, ebay, bloomberg, Apple, Amazon, adobe)
- https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/ ( Amazon, Apple, bloomberg, Facebook, goldman sachs, google, Microsoft, Paypal) 
