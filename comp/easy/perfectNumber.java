
import java.util.Scanner;

public class perfectNumber {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter number:");
        int num = in.nextInt();
        
        int sum=0;
        int org=num;
        int i=1;

        while(i!=num){

            if(num%i==0){
                sum+=i;
            }
            i++;

        }

        if(org==sum){

            System.out.println("perfect number");

        }
        else{
            System.out.println("not perfect");
        }
        
    }
    
}


