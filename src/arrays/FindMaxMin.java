package arrays;
import java.util.stream.*;
import java.util.*;
public class FindMaxMin {
    // Find Minimum and Maximum in Array
    //Input: [7, 1, 9, 3, 6] Output: Min = 1, Max = 9
    //3 Check if Array Contains Element
    //Input: [10, 20, 30, 40], target = 30 Output: true
    //4 Remove Duplicates
    //Input: [1, 2, 2, 3, 4, 4, 5] Output: [1, 2, 3, 4, 5]
    public static void main(String[] args) {
        int a[]={7,1,9,3,6};
        int ar[]={1, 2, 2, 3, 4, 4, 5};
        int mx=a[0],mn=a[0];
        for(int n:a){
            if(n>mx){
                mx=n;
            }
            if(n<mn){
                mn=n;
            }
        }
        System.out.println(mx+" "+mn);
        for(int i=1;i<ar.length;i++){
            if(ar[i-1]!=ar[i]) System.out.print(ar[i-1]+" ");
        }
        System.out.print(ar[ar.length-1]);
    }
}
