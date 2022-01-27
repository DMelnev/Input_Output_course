class Solution2 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0, j = 0, k = 0;
        int n1 = nums1.length, n2 = nums2.length;
        int size = n1 + n2;
        int arr3[] = new int[size];
        int a = (int) (size / 2);

        if (n1 == 0 || n2 == 0) {
            if (n2 == 1)
                return (double) nums2[0];
            if (n1 == 1)
                return (double) nums1[0];
            if (n1 == 0 && n2 == 0)
                return 0.0;
        }

        if (n1 == 1 && n2 == 1) return (double) (nums1[0] + nums2[0]) / 2;

        if (size == 2 && (n1 == 0 || n2 == 0)) {
            if (n1 == 0)
                return (double) (nums2[0] + nums2[1]) / 2;
            else
                return (double) (nums1[0] + nums1[1]) / 2;
        } else if (size >= 3) {

            while (i < n1 && j < n2) {
                arr3[k++] = (nums1[i] < nums2[j]) ? nums1[i++] : nums2[j++];
            }
            while (i < n1)
                arr3[k++] = nums1[i++];
            while (j < n2)
                arr3[k++] = nums2[j++];

            if (size % 2 == 0) {
                return (double) (arr3[a - 1] + arr3[a]) / 2;
            } else {
                return (double) arr3[a];
            }
        }
        return 0;
    }
}