package ArraySpecialProduct;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Integer> findSpecialProduct(List<Integer> inputArray){
        List<Integer> product = new ArrayList<>();
            for(int i=0;i<inputArray.size();i++){
                int prod = 1;
                for(int j=0;j<inputArray.size();j++){
                    if(i!=j){
                        prod = prod * inputArray.get(j);
                    }
                }
                product.add(prod);
            }
        return product;
    }

    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(3);
        input.add(4);
        input.add(5);
        System.out.println(findSpecialProduct(input));

    }
}
