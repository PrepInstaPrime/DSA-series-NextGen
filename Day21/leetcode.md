# Question 1:
https://leetcode.com/problems/spiral-matrix/description/ ( Microsoft, Facebook, Amazon, Google, Apple, Adobe, Bloomberg, Cisco, e-bay, Goldman sachs, LinkedIn, Oracle, Paypal, SnapChat, Uber)

## Solution: 
```
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top=0;
        int left=0;
        int right=matrix[0].length-1;
        int bottom= matrix.length-1;
        ArrayList<Integer> list= new ArrayList<>();
        while(left<=right&&top<=bottom){
            for(int i=left;i<=right;i++){
                list.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                list.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                   list.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }
        return list;
    }
}
```
# Question 2: 
https://leetcode.com/problems/summary-ranges/description/ ( Amazon, Bloomberg, Facebook,Google,Indeed,Microsoft,Uber, Yandex, Qualtrics) 
 ## Solution : 
 ```
 class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> list= new ArrayList<>();
        int end=0;
        while(end<nums.length){
            int start= end;
            while(end+1<nums.length&&nums[end+1]==nums[end]+1){
                end++;
            }
            if(start!=end){
                list.add(nums[start]+"->"+nums[end]);
            }else{
                list.add(nums[start]+"");
            }
            end++;
        }
        return list;
    }
}
 ```