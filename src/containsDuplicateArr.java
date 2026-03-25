import java.util.*;

class containsDuplicateArr {
    public static boolean containsDuplicate(int[] nums) {
        boolean flag = false;
        Set<Integer> hs = new HashSet<>();
        
        for(int i=0 ; i<nums.length ; i++){
            if(!hs.add(nums[i])){
                flag = true;
            }
        }
        return flag;
    }
    
    public static void main(String[] args){
        int[] nums = {2,5,6,2,3,4,6};
        System.out.println(containsDuplicate(nums));
    }
}
