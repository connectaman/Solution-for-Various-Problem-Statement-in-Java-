package CompareTheTriples;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class ComapreSpecialProduct {
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> result = new ArrayList<>();
        int alice =0,bob = 0;
        if(a.size() == b.size()){
            for(int i=0;i<a.size();i++){
                if(a.get(i)>b.get(i)){
                    alice++;
                }
                else if(a.get(i)<b.get(i)){
                    bob++;
                }
                else{
                    continue;
                }
            }
        }
        result.add(alice);
        result.add(bob);
        return result;
    }
    public static void main(String[] args) throws IOException {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        a.add(17);
        a.add(28);
        a.add(30);
        b.add(99);
        b.add(16);
        b.add(8);
        System.out.println(compareTriplets(a,b));

    }
}
