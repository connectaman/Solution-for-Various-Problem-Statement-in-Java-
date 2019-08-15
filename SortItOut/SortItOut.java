/*
Author:Aman Ulla
 */
package SortItOut;
import java.util.*;
public class SortItOut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        ArrayList<Integer> intArray = new ArrayList<>();
        int[] array = new int[arraySize];
        int[] sortedArray = new int[arraySize];
        for(int index=0;index<arraySize;index++){
            array[index] = sc.nextInt();
            intArray.add(array[index]);
        }
        for(int lastSortedIndex = array.length-1;lastSortedIndex>0;lastSortedIndex--){
            for(int i=0;i<lastSortedIndex;i++){
                if(array[i] > array[i+1]){
                    if (i == lastSortedIndex) {
                        return;
                    }
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
        }
        for(int i=0;i<array.length;i++){
            sortedArray[i] = intArray.indexOf(array[i]);
        }
        for(int a:sortedArray){
            System.out.print(a+" ");
        }
    }
}
