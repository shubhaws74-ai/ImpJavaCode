package string;
import java.util.*;
import java.util.stream.*;
public class CheckAnagrams {
    //Check Anagram Strings Input: "listen", "silent" Output: true
    public static void main(String [] args){
        String s1="listen".toLowerCase();
        String s2="silent".toLowerCase();
        //method 1
        if(s1.length()!=s2.length()){
            System.out.println(false);
        }
        char ch1[]=s1.toCharArray();
        char ch2[]=s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        System.out.println(Arrays.equals(ch1,ch2));
        //method 2 using loop
        int seen[] =new int[26];
        for(int i=0;i<s1.length();i++){
            seen[s1.charAt(i)-'a']++;
            seen[s2.charAt(i)-'a']--;
        }int f=0;
        for(int i=0;i<s1.length();i++){
            if(seen[s1.charAt(i)-'a']!=0){
                System.out.println(false);
                f=1;
                break;
            }

        }if(f==0)System.out.println(true);

        //method 3 using stream api
       boolean b= (s1.length()==s2.length())&&
               s1.chars().mapToObj(c->(char)c).sorted().collect(Collectors.toList()).equals(
                   s2.chars().mapToObj(c->(char)c).sorted().collect(Collectors.toList())
               );
       System.out.println(b);
    }
}
