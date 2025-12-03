import java.util.Arrays;
public class SelectionSortEx {
    static void selection(int nums[]) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int smallest = nums[i];
            int sIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (smallest > nums[j]) {
                    smallest = nums[j];
                    sIdx = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[sIdx];
            nums[sIdx] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1 };
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
}
