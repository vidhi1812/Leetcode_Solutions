class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int i=0,i1=0,i2=0;
        int l=nums1.length+nums2.length;
        int[] a =new int[(l/2)+1];
        while(i<a.length){
               if(i1<nums1.length&&i2<nums2.length){
                   a[i++] = nums1[i1]<nums2[i2] ? nums1[i1++]:nums2[i2++];
               }
               else if(i1<nums1.length){
                   a[i++]=nums1[i1++];
               }
               else{
                   a[i++]=nums2[i2++];
               }
        } 
        if(l%2==1){
            return a[a.length-1];
        }
        else{double t=(a[a.length-2]+a[a.length-1]);
        return t/2.00;
        } 
    }
}