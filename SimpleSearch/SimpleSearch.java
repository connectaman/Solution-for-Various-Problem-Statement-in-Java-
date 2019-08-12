/*
Author: Aman Ulla
 */
package SimpleSearch;
import java.util.ArrayList;
import java.util.Scanner;
public class SimpleSearch {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int sizeOfArray = sc.nextInt();
        ArrayList<Integer> arraylist  = new ArrayList<Integer>(sizeOfArray);
        for(int i=0;i<sizeOfArray;i++){
            arraylist.add(sc.nextInt());
        }
        int keyValue = sc.nextInt();
        if(arraylist.contains(keyValue)){
            System.out.println(arraylist.indexOf(keyValue));
        }
        else{
            System.out.println("Element not present");
        }
    }
}
