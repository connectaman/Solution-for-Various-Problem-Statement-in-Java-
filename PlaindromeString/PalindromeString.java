package PlaindromeString;
import java.util.Scanner;
public class PalindromeString {
    public static void main(String args[])
    {
        String str, rev = "";
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the string you want to check:");
        str = s.nextLine();
        int n = str.length();
        for(int i = n - 1; i >= 0; i--)
        {
            rev = rev + str.charAt(i);
        }
        if(str.equalsIgnoreCase(rev))
        {
            System.out.println("The string is palindrome.");
        }
        else
        {
            System.out.println("The string is not palindrome.");
        }
    }
}
