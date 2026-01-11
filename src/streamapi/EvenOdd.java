package streamapi;
import java.util.stream.*;
import java.util.*;
public class EvenOdd {
    //94. Group numbers by even/odd
    //
    //Input: [1,2,3,4]
    //Output: {even=[2,4],odd=[1,3]}
    public static void main(String [] args){
        List<Integer>list=Arrays.asList(1,2,3,4);
        Map<Boolean,List<Integer>>lr=list.stream().collect(Collectors.partitioningBy(n->n%2==0));
        System.out.println("even "+lr.get(true)+" odd "+lr.get(false));
    }
}
