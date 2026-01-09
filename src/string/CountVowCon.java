package string;
//import java.util.*;
//import java.util.stream.*;
public class CountVowCon {
    /*Count Vowels and Consonants Input: "programming" Output: Vowels: 3, Consonants: 8 */
    public static void main(String [] args){
        String str="programming";
        int vow=0;
        int con=0;
        for(char c:str.toCharArray()){
            if("aeiouAEIOU".indexOf(c)>=0)vow++;
            else  con++;
        }System.out.println("Vowel: "+vow+" Consonant: "+con);
    }
}
