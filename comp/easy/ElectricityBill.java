import java.util.Scanner;
public class ElectricityBill {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Enter units:");
        float unit = in.nextFloat();

        double billAmount=0;
        if(unit<=30){
            billAmount=unit*2.7;
        }
        else if(unit>30 && unit<=100){
            billAmount=(unit-30)*4 + 30*2.7;
        }
        else if(unit>100 && unit<=200){
            billAmount=(unit-100)*5.4 + 70*4 + 30*2.7;
        }

        else{
            billAmount=(unit-200)*6.40 + 100*5.4 + 70*4 + 30*2.7;
        }

        if(billAmount<125){
            System.out.println("Your bill amount is:125");
        }
        else{
            System.out.println("Your bill amount is:"+billAmount);
        }

    }

}
