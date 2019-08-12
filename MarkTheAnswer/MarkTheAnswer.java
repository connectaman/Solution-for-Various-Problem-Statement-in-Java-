/*
Author:Aman Ulla
 */
package MarkTheAnswer;
import java.util.*;
public class MarkTheAnswer {
    public static void main(String args[] ) throws Exception {
        Scanner sc  = new Scanner(System.in);
        int skipped = 0;
        int attempted = 0;
        int size = sc.nextInt();
        int maxDiff = sc.nextInt();
        int[] questions = new int[size];
        for(int i=0;i<size;i++){
            questions[i] = sc.nextInt();
            if(skipped<2){
                if(questions[i]>maxDiff){
                    skipped++;
                }
                else{
                    attempted++;
                }
            }
            else{
                break;
            }
        }
        System.out.println(attempted);
    }
}
