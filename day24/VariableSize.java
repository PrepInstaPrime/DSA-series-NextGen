public class VariableSize {
    public static int maxSubarray(int nums[],int target){
        int start=0;
        int sum=0;
        int maxWin=0;
        for(int end=0;end<nums.length;end++){
            sum+=nums[end];  // expand
            while(sum>target){
                sum-=nums[start]; // shrink
                start++;
            }
            maxWin= Math.max(maxWin, end-start+1);
        }
        return maxWin;
    }
    public static void main(String[] args) {
        int nums[]={0,1,3,9,6,4,5,1,1,1,2,3};
        int target=5;
        System.out.println(maxSubarray(nums, target));
    }
}
