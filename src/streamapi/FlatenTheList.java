package streamapi;
import java.util.*;
import java.util.stream.*;
public class FlatenTheList {
    //Flatten list of lists
    //
    //Input: [[1,2],[3,4]]
    //Output: [1,2,3,4]
    //
    //86. Count total elements after flattening
    //
    //Input: [[1,2],[3]]
    //Output: 3
    public static void main(String[] args) {
        List<List<Integer>>list=Arrays.asList(Arrays.asList(1,2),Arrays.asList(3,4));
        List<Integer>lr=list.stream().flatMap(n->n.stream()).collect(Collectors.toList());
        System.out.println(lr);

        // 2 problem
        List<List<Integer>>lst=Arrays.asList(Arrays.asList(1,2),
                Arrays.asList(3));
        long coyt=lst.stream().flatMap(n->n.stream()).count();
        System.out.println(coyt);
    }
}
