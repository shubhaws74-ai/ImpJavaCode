package streamapi;
import java.util.stream.*;
import java.util.*;
public class Intersection {
    //64. Find intersection of lists
    //Input: [1,2,3],[2,3,4]
    //Output: [2,3]
    public static void main(String[] args) {
        List<Integer>list1=Arrays.asList(1,2,3);
        List<Integer>list2=Arrays.asList(2,3,4);
        List<Integer>lr=list1.stream().filter(n->list2.contains(n)).collect(Collectors.toList());
        System.out.println(lr);

    }
}
