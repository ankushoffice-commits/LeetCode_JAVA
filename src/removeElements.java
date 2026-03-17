class removeElements {
    public static int removeElement(int[] nums, int val) {
        int k = 0; // pointer for next position of non-val element
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        
        return k;
    }
    
    public static void main(String[] args){
        int[] nums = {1,2,4,5,3,3,5,8};
        System.out.println(removeElement(nums, 5));
    }
}
