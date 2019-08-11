/*
Author : Aman Ulla
 */

package Reverse_Integer;
public class ReverseInteger {
    public static int reverse(int x) {
        boolean isNegative = false;
        if(x < 0){
            isNegative = true;
            x = x * -1;
        }
        int reverse = 0;
        int lastDigit = 0;

        while (x >= 1) {
            lastDigit = x % 10;
            reverse = reverse * 10 + lastDigit;
            x = x / 10;
        }
        if(isNegative){
            return (reverse*-1);
        }
        else{
            return reverse;
        }
    }
    public static void main(String[] args) {
        System.out.println("input = -123, output = "+ reverse(-123));
        System.out.println("input = 123, output = "+reverse(123));
        System.out.println("input = 120, output = "+reverse(120));
    }
}
