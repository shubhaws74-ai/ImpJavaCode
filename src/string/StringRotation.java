package string;

import java.util.stream.IntStream;

public class StringRotation {
    /*Check String Rotation Input: s1="ABCD", s2="CDAB" Output: true */
    public static void main(String [] args){
        String s1="ABCD";
        String s2="CDAB";
        String s=s1+s1;//ABCDABCD

        // method 1
        if(s1.length()!=s2.length())System.out.println(false);
        int f=0;
        for(int i=0;i<s1.length();i++){
            if(s.substring(i,s2.length()+i).equals(s2)){
                System.out.println(true);
                f=1;
                break;
            }
        }if(f==0)System.out.println(false);

        //method 2
        System.out.println(s.contains(s2));

        //method 3
       boolean br= IntStream.range(0,s1.length()).mapToObj(i->s1.substring(i)+s1.substring(0,i)).anyMatch(c->c.equals(s2));
       System.out.println(br);

    }
}
