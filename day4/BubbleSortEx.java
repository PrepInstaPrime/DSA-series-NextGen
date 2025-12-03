import java.util.Arrays;
public class BubbleSortEx{
    static void bubble(int nums[]){
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(nums[j+1]<nums[j]){
                    int temp= nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
}