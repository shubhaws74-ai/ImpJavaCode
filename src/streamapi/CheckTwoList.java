package streamapi;
import java.util.stream.*;
import java.util.*;
public class CheckTwoList {
    //Check if two lists are equal
    //
    //Input: [1,2],[2,1]
    //Output: false
    public static void main(String[] args){
        List<Integer>list1=Arrays.asList(1,2);
        List<Integer>list2=Arrays.asList(2,1);
        System.out.println(list1.equals(list2));
        List<List<Integer>>list=Arrays.asList(Arrays.asList(1,2),Arrays.asList(2,1));
//        List<List<Integer>>list=new ArrayList<>();
//        list.add(Arrays.asList(1,2));
//        list.add(Arrays.asList(2,1));


    }

}
