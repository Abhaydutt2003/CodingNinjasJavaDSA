package MajorTest1;

import java.util.Scanner;
public class MaximumSubarraySum {
    public static void main(String args[]){
        Scanner s  = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++){arr[i] = s.nextInt();}
        System.out.print(util1(arr));
    }
    public static int util1(int arr[]){
        int sumTillNow = 0;
        for(int i:arr){
            sumTillNow+=i;
            if(sumTillNow<=0){
                sumTillNow = 0;
            }
        }
        return sumTillNow;
    }

    
}
