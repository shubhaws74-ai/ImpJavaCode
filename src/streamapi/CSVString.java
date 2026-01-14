package streamapi;
import java.util.*;
import java.util.stream.*;
public class CSVString {
    //. Convert list to comma-separated string
    //Input: [A,B,C]
    //Output: "A,B,C"
    public static void main(String[] args){
        List<String>list=Arrays.asList("A","B","C");
        String rs=list.stream().collect(Collectors.joining(","));
        System.out.println(rs);

    }

}
