package streamapi;
import java.util.*;
import java.util.stream.*;
public class Genpractice {
    //Find Length of Each Word
    //Input: ["apple","banana","kiwi"]
    //Output: [5,6,4]
    public static void main(String[] args) {
        List<String>lst=Arrays.asList("apple","banana","kiwi");
               List<Integer>lr= lst.stream().map(String::length).collect(Collectors.toUnmodifiableList());
        System.out.println(lr);
        //Count Strings with Length > 3
        //Input: ["hi","cat","book","java","go"]
        //Output: 2
        long r=List.of("hi","cat","book","java","go").stream().filter(s->s.length()>3).count();
        System.out.println(r);

        //Square Each Number and Collect to List
        //Input: [1,2,3,4,5]
        //Output: [1,4,9,16,25]
        //Q17. Sum of Squares
        //Input: [1,2,3,4,5]
        //Output: 55
        List<Integer>lk=List.of(1,2,3,4,5).stream().map(i->i*i).toList();
        System.out.println(lk);
        int sk=List.of(1,2,3,4,5).stream().map(i->i*i).reduce(0,(a,b)->a+b);
        System.out.println(sk);

        // Flatten List of Lists
        //Input: [[1,2],[3,4],[5,6]]
        //Output: [1,2,3,4,5,6]
        List<List<Integer>>lrs=Arrays.asList(Arrays.asList(1,2),Arrays.asList(3,4),Arrays.asList(5,6));
        List<Integer>mm=lrs.stream().flatMap(s->s.stream()).toList();
        System.out.println(mm);
    }
}
