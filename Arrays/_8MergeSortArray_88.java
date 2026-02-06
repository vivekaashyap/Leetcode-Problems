
public class _8MergeSortArray_88 {

    public static void main(String[] args) {
        int nums1[] = {1, 2, 3, 0, 0, 0};
        int len1 = nums1.length; //6
        int nums2[] = {2, 5, 6};
        int len2 = nums2.length; //3
        int k = 0;//6-3 = 3
        for (int i = len2; i < len1; i++) {
            nums1[i] = nums2[k++];
        }
        for (int i : nums1) {
            System.out.print(i + " ");
        }
    }
}
