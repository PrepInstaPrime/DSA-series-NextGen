import java.util.Arrays;

public class ArrayEx {
    static int findSmall(int arr[]){
        int smallest=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int arr1[]= {1,-2,3,-4};
        int arr2[]= new int[5];
        arr2[1]=5;
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(findSmall(arr1));
    }
}
