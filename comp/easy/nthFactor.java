package comp.easy;
import java.util.Scanner;

public class nthFactor {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number:");
        int num=in.nextInt();

        System.out.println("Enter nth:");
        int n = in.nextInt();

        int count=1;

        for(int i=1;i<num;i++){

            if(num%i==0){
                if(count==n){
                    System.out.println(i);
                }
                count++;
            }

        }
        

    }

}
