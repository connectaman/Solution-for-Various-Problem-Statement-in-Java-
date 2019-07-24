package PalindromeNumber;

public class IntegerPalindrome {
    public static boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        int start = 0;
        int end = str.length() - 1;
        while(start < end){
            if(str.charAt(start++) != str.charAt(end--)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("palindrome of -112 is = "+isPalindrome(-112));
        System.out.println("palindrome of 121 is = "+isPalindrome(121));
    }
}
