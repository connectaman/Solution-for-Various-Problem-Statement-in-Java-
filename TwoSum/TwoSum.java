package TwoSum;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int i,j,sum=0;

        for(i = 0;i<nums.length;i++){
            for(j=0;j<nums.length;j++){
                if(i != j){
                    sum = nums[i] + nums[j];
                    if(sum == target){
                        return new int[] { i, j };
                    }
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    public static void main(String[] args) {
        int num[] = {3,4,2};
        int res [] = twoSum(num,6);
        System.out.println(res[0]);
        System.out.println(res[1]);
    }
}
