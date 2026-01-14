package streamapi;
import java.util.stream.*;
import java.util.*;
public class MissingNumber {
    //69. Find missing number
    //Input: [1,2,4,5]
    //Output: 3
    public static void main(String[] args){
        List<Integer>list=Arrays.asList(1,2,4,5);
        int n=list.size()+1;
        int sum =n*(n+1)/2;
        int num=sum-(list.stream().collect(Collectors.summingInt(b->b)));
        System.out.println(num);
    }
}
