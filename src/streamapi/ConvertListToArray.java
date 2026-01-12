package streamapi;
import java.util.stream.*;
import java.util.*;
public class ConvertListToArray {
    //Convert List to array
    //
    //Input: [A,B,C]
    //Output: ["A","B","C"]
    public static void main(String[] args){
        List<String>list=Arrays.asList("A","B","C");
        String [] ar=list.stream().toArray(String[]::new);
        System.out.println(Arrays.toString(ar));
        List<Integer>l=Arrays.asList(1,2,3,4,5);
        int [] s=l.stream().mapToInt(n->n).toArray();
        System.out.println(Arrays.toString(s));

    }
}
