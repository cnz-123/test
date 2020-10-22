package java;

public class BreakpointDemo {
    public static void main(String[] arg){
        int sum = 0;
        int k=0;
        System.out.println("Hello, Breakpoint!");
        while (sum<50000){
        k++;
        for (int i=0;i<100;i++){
             sum = sum + i;
             System.out.println("i = "+i);
             System.out.println("sum = "+sum);
          }
          System.out.println("k = "+ k);
          System.out.println("sum = "+sum);

        } 
        }
    }//ssssasdasdpkokppl;'