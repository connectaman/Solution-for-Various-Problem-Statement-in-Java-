/*
Author:Aman Ulla
 */
package removeDuplicateFromSortedArray;
import java.util.ArrayList;
public class RemoveDuplicate {
    public static int removeDuplicates(int[] nums) {
        ArrayList<Integer> checkDuplicate = new ArrayList<>(100);
        for(int i = 0;i<nums.length;i++){
            if(!checkDuplicate.contains(nums[i])){
                checkDuplicate.add(nums[i]);
            }
        }
        for(int i=0;i<checkDuplicate.size();i++){
            nums[i] = checkDuplicate.get(i);
        }
        return checkDuplicate.size();
    }
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }
}
