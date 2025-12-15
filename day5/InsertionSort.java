import java.util.Arrays;

public class InsertionSort {
    static void insertion(int nums[]){
        for(int i=1; i<nums.length;i++){
            int key=nums[i];
            int j=i-1;
            while(j>=0&&key<nums[j]){
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1]=key;
        }
    }
    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1 };
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
}
