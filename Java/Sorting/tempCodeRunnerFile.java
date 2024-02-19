    * public static int kthSmallest(int[] arr, int low, int high, int k) {
     * // find the position
     * int partition = partition(arr, low, high);
     * 
     * // if position value is equal to the kth position,
     * // return value of k.
     * 
     * if (partition == k - 1) {
     * return arr[partition];
     * 
     * } else if (partition < k -1) {
     * return kthSmallest[arr, partition + 1 , high , k];
     * }else {
     * 
     * }
     * }
     