package string;
import java.awt.image.AreaAveragingScaleFilter;
import java.util.stream.*;
import java.util.*;
public class RemoveWhiteSpace {
    //Remove All Spaces Input: "java is fun" Output: "javaisfun"
    public static void main(String [] args){
        String str="java is fun";
        System.out.println(str.replace(" ",""));
        String sr=Arrays.stream(str.split("\\s+")).reduce("",(a,b)->a+b);
        System.out.println(sr);
        StringBuilder sb= new StringBuilder();
        for( int i=0;i<str.length();i++){
            if(str.charAt(i)!=' ')sb.append(str.charAt(i));
        }System.out.println(sb.toString());


    }
}
