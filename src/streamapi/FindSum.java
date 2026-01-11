package streamapi;
import java.util.function.Function;
import java.util.stream.*;
import java.util.*;
public class FindSum {
    //Find sum of numbers divisible by 3
    //Input: [3,6,9,10]
    //Output: 18
    public static void main(String[] args){
        int a[]={3,6,9,10};
        int as=Arrays.stream(a).filter(n->n%3==0).sum();
        List<Integer>list=Arrays.asList(3,6,9,10);
        int sum=list.stream().filter(n->n%3==0).collect(Collectors.summingInt(c->c));
        System.out.println(sum);
        System.out.println(as);
    }
}
