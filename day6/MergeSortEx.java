import java.util.Arrays;
public class MergeSortEx {
    static void divide(int start,int end,int nums[]){
        if(start==end){
            return;
        }
        int mid=(start+end)/2;
        divide(start, mid, nums); // left
        divide(mid+1, end, nums); //right
        merge(start, mid, end, nums); // merge
    }
    static void merge(int start, int mid, int end, int nums[]){
        int temp[]= new int[end-start+1];
        int k=0;
        int i=start; // start of left part
        int j=mid+1; // start of right part
        while(i<=mid&&j<=end){
            if(nums[i]<nums[j]){
                temp[k]=nums[i];
                i++;
                k++;
            }else{
                temp[k]=nums[j];
                k++;
                j++;
            }
        }
        while (i<=mid) {
            temp[k]=nums[i];
            i++;
            k++;
        }
        while (j<=end) {
            temp[k]=nums[j];
            k++;
            j++;
        }
        for(int m=0;m<temp.length;m++){
            nums[start+m]=temp[m];
        }
    }
    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1 };
        int start=0;
        int end=arr.length-1;
        divide(start,end,arr);
        System.out.println(Arrays.toString(arr));
    }
}
