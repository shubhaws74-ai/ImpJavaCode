package string;
import java.util.stream.*;
import java.util.*;
public class StringCompression {
    //String Compression Input: "aaabbc" Output: "a3b2c1"
    public static void main(String[] args){
        String str="aaabbc";
        StringBuilder sb=new StringBuilder();
        int count=1;
        for(int i=1;i<=str.length();i++){
            if(i<str.length()&&str.charAt(i)==str.charAt(i-1))count++;
            else {
                sb.append(str.charAt(i-1)+""+count);
                count=1;
            }
        }
        System.out.println(sb.toString());
    }
}
