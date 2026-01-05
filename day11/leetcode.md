# Question 1: 
https://leetcode.com/problems/search-in-rotated-sorted-array/
## Solution: 
```
class Solution {
    public int search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid= start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[start]<=nums[mid]){
                if(nums[start]<=target&&target<=nums[mid]){
                    end=mid-1; 
                }else{
                    start=mid+1;
                }
            }else{
                if(nums[mid]<=target&&target<=nums[end]){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}
```
# Question 2: 
https://leetcode.com/problems/intersection-of-two-arrays-ii/
## Solution: 
```
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int temp[]= new int [1001];
        for(int val:nums1){
            temp[val]++;
        }
        ArrayList<Integer> list= new ArrayList<>();
        for(int val:nums2){
            if(temp[val]>0){
                list.add(val);
                temp[val]--;
            }
        }
        int res[]= new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i]=list.get(i);
        }
        return res;
    }
}
```
## Home work
- https://leetcode.com/problems/third-maximum-number/description/  ( Amazon, Bloomberg, FaceBook, Google, Microsoft) 
- https://leetcode.com/problems/single-number/description/ ( Adobe, Amazon, Apple, Atlassian, Bloomberg, FaceBook, Google, Microsoft)  
- https://leetcode.com/problems/find-peak-element/description/ ( Amazon, Apple, BloomBerg, FaceBook, Microsoft, Google)
