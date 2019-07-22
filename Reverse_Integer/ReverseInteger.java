package Reverse_Integer;

public class ReverseInteger {
    public static int reverse(int x) {
        boolean negative=false;
        int temp=0,rev=0,rem=x;
        while(x != 0)
        {
            temp = x % 10;
            rev = (rev*10)+temp;
            x = x / 10;
        }
        if(rem < 0){
            rem = ~(rem - 1);
        }
        else{
            rem = rev;
        }
        return rev;
    }
    public static void main(String[] args) {
        System.out.println("input = -123, output = "+ reverse(-123));
        System.out.println("input = 123, output = "+reverse(123));
        System.out.println("input = 120, output = "+reverse(120));
    }
}
