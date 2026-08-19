package comp.medium;
import java.util.Scanner;
public class FactorialTrailingZero {
    public static void main(String[] args) {
        
        Scanner in=new Scanner(System.in);

        System.out.println("Enter positive number:");
        int num = in.nextInt();

        if(num<0){
            System.out.println("Number is negative Enter number again");
        }
        else{
            int count=0;
            while(num>=5){
                num/=5;
                count+=num;
            }
            System.out.println("digits of zero is: "+count);
        }
        in.close();

    }
}
