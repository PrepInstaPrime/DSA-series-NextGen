public class LinearSearchEx {
    static int search(int []nums, int value){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==value){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
      int arr[]= {4,2,3,5,6,1};
      int value=4;
      System.out.println(search(arr, value));
    }
}
