import java.util.Arrays;
public class QuickSort {
    static void partition(int start,int end,int nums[]){
        if(start>=end){
            return;
        }
        int pivotIdx=findPivot(start,end,nums);
        partition(start, pivotIdx-1, nums); // left part 
        partition(pivotIdx+1,end, nums); // right part 
    }
    static int findPivot(int start, int end,int nums[]){
        int pivot=nums[end];
        int i=start-1;
        for(int j=start;j<end;j++){
            if(nums[j]<pivot){
                i++;
                swap(i, j, nums);
            }
        }
        swap(i+1, end, nums);
        return i+1;
    }
    static void swap(int i, int j, int nums[]){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public static void main(String[] args) {
        int arr[] = { 5,6, 4, 3, 1, 2 };
        int start=0;
        int end=arr.length-1;
        partition(start,end,arr);
        System.out.println(Arrays.toString(arr));
    }
}
