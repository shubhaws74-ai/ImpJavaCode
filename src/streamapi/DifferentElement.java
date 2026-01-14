package streamapi;
import java.util.*;
import java.util.stream.*;
public class DifferentElement {
    //65. Find difference between lists
    //Input: [1,2,3],[2]
    //Output: [1,3]
    public static void main(String[] args){
        List<Integer>list1=Arrays.asList(1,2,3);
        List<Integer>list2=Arrays.asList(2);
        List<Integer>lr=list1.stream().filter(c->!list2.contains(c)).collect(Collectors.toList());
        System.out.println(lr);


    }
}
