public class MergeSortedArray {

    public static void main(String[] args) {
            int[] nums1 = new int[6];
            nums1[0] = 1;
            nums1[1] = 2;
            nums1[2] = 3;
            int[] nums2 = {1,2,3};
    
            merge(nums1, 3, nums2, 3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int j = m - 1;
        int k = n - 1;
       
        
        for (int i = nums1.length - 1; i >= 0; i --) {
            if (k >= 0 && j >= 0 && nums2[k] > nums1[j] ) {
                nums1[i] = nums2[k];
                k --;
            } else if (j >= 0) {
                nums1[i] = nums1[j];
                j --;
            } else if (k >= 0) {
                nums1[i] = nums2[k];
                k --;
            }
        }
        for (int n1 : nums1) {
            System.out.println(n1);
        }

    }

}