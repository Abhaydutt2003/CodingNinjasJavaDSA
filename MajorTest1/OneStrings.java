package MajorTest1;

//import java.util.Scanner;
public class OneStrings {
    public static void main(String args[]){
        // Scanner s  = new Scanner(System.in);
        // int n = s.nextInt();
        // int arr[] = new int[n];
        // for(int i =0;i<n;i++){arr[i] = s.nextInt();}
        // System.out.print(util1(arr));
        String s = "111111";
        System.out.println(numSub(s));
    }
    public static int util1(int arr[]){
        int sumTillNow = 0;
        int totalSub=0;
        int totalOnes = 0;
        for(int i:arr){
            if(i == 1){
                totalOnes++;
                sumTillNow+=1;
            }else{
                sumTillNow = 0;
            }
            if(sumTillNow>1){
                totalSub++;
            }
        }
        return totalSub+totalOnes;
    }
    public static int numSub(String s){
        long currentLength=0,ans=0;
        for(int i = 0;i<s.length();i++){
            currentLength+=(s.charAt(i) == '1')?1:-currentLength;
            ans+=currentLength;
        }
        double mod = Math.pow(10,9)+7;
        return (int)(ans%mod);
    }
}
