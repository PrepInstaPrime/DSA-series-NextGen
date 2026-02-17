# Question 1: 
https://leetcode.com/problems/relative-sort-array/
## Solution: 
```
class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int freq[]= new int[1001];
        // step 1 count frequencies of all elements from arr1
        for(int val:arr1){
            freq[val]++;
        }
        // step 2 put all values in arr1 from arr2 
        int k=0;
        for(int val : arr2){
            while(freq[val]!=0){
                arr1[k]=val;
                freq[val]--;
                k++;
            }
        }
        // step 3 putting the values in ascending order from freq array
        for(int i=0;i<freq.length;i++){
            while(freq[i]!=0){
                arr1[k]=i;
                freq[i]--;
                k++;
            }
        }
        return arr1;
    }
}
```

# Question 2: 
https://leetcode.com/problems/find-all-duplicates-in-an-array/
## Solution : 
```
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n=nums.length;
        int freq[]= new int[n+1];
        ArrayList<Integer> res= new ArrayList<>();
        for(int val:nums){
            freq[val]++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]==2){
                res.add(i);
            }
        }
        return res;
    }
}
```
# Question 3: 
https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
## Solution : 
```
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        int freq[]= new int[n+1];
        ArrayList<Integer> res= new ArrayList<>();
        for(int val:nums){
            freq[val]++;
        }
        for(int i=1;i<freq.length;i++){
            if(freq[i]==0){
                res.add(i);
            }
        }
        return res;
    }
}
```
# Question 4: 
https://leetcode.com/problems/find-missing-and-repeated-values/
## Solution: 
```
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n= grid.length;
        int freq[]= new int [n*n+1];
        int res[]= new int[2];
        for(int []arr:grid){
            for(int val:arr){
                freq[val]++;
            }
        }
        for(int i =1;i<freq.length;i++){
            if(freq[i]==2){
                res[0]=i;
            }
            if(freq[i]==0){
                res[1]=i;
            }
        }
        return res;
    }
}
```
# Question 5: 
https://leetcode.com/problems/set-mismatch/description/
## solution: 
```
class Solution {
    public int[] findErrorNums(int[] nums) {
        int n= nums.length;
        int freq[]= new int [n+1];
        int res[]= new int[2];
        for(int val:nums){
          freq[val]++;
        }
        for(int i =1;i<freq.length;i++){
            if(freq[i]==2){
                res[0]=i;
            }
            if(freq[i]==0){
                res[1]=i;
            }
        }
        return res;  
    }
}
```