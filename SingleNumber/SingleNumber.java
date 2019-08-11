package SingleNumber;

import java.util.ArrayList;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int value=0,result=0;
        boolean res = false;
        ArrayList<Integer> arr = new ArrayList<Integer>(1000);
        for(int i=0;i<nums.length;i++){
            res = arr.contains(nums[i]);
            if(!res){
                arr.add(nums[i]);
            }
            else{
                int index = arr.indexOf(nums[i]);
                arr.remove(index);
            }
        }
        return arr.get(0);
    }
    public static void main(String[] args) {
        int nums[] = {4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }
}
