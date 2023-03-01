package MajorTest1;

public class Pattern {
    public static void main(){
        util(5);
    }
    public static void util(int n){
        int a = n;
        int row = 0;
        while(a>=1){
            for(int i = 1;i<=a;i++){
                System.out.print(i);
            }
            for(int i = 1;i<=row*2;i++){
                System.out.print("");
            }
            for(int i = a;i>0;i--){
                System.out.print(i);
            }
            System.out.println("");
            a--;
            row++;
        }
    }
    
}
