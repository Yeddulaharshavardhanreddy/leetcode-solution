class Solution {
    public double findMedianSortedArrays(int[] n1, int[] n2) {
        // Create an array 'c' to hold all elements from n1 and n2
        int[] c = new int[n1.length + n2.length];
        
        // Copy elements from n1 to the new array 'c'
        for (int i = 0; i < n1.length; i++) {
            c[i] = n1[i];
        }
        
        // Copy elements from n2 to the new array 'c' starting after the elements from n1
        for (int i = 0; i < n2.length; i++) {
            c[n1.length + i] = n2[i];
        }
        
        // Sort the combined array 'c'
        Arrays.sort(c);
        
        // Check if the combined array length is odd or even
        int div = c.length % 2;
        if (div != 0) {
            // If the length is odd, the median is the middle element
            float divi = c.length / 2;
            int ans = (int) divi;
            int l = c[ans];
            return (double) l;
        } else {
            // If the length is even, the median is the average of the two middle elements
            int divi1 = c.length / 2;
            int ans1 = divi1;
            int ans2 = divi1 - 1;
            int h = c[ans1] + c[ans2];
            double k = (double) h / 2;
            return k;
        }
    }
}
