class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[nums2.length];
        for (int i=nums2.length-1; i>=0; i--){
            while( !st.isEmpty() && st.peek() <= nums2[i]){
                st.pop();
            }
            ans[i] = st.isEmpty() ? -1 : st.peek();

            st.push(nums2[i]);
        }

        int[] res = new int[nums1.length];
        for(int i=0; i<=nums1.length-1; i++){
            for(int j=0; j<=nums2.length-1; j++){
                if(nums1[i] == nums2[j]){
                    res[i] = ans[j];
                }
            }
        }
        return res;
    }
}