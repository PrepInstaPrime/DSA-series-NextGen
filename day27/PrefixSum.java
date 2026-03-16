class PrefixSum{
    // find the prefix sum of an subarray with range [l, r]
    public static int prefixSum(int[] prefixSum, int l, int r) {
        if (l == 0) {
            return prefixSum[r];
        }
        return prefixSum[r] - prefixSum[l - 1];
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        // Print the prefix sum array
        // for (int i = 0; i < prefixSum.length; i++) {
        //     System.out.print(prefixSum[i] + " ");
        // }
        System.out.println(prefixSum(prefixSum, 0, 2));
        System.out.println(prefixSum(prefixSum, 2, 4));
    }
}