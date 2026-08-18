import java.util.Scanner;


public class time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H,M,S;
        System.out.print("Enter Hour: ");
        H = sc.nextInt();
        System.out.print("Enter Minutes: ");
        M = sc.nextInt();
        System.out.print("Enter Seconds: ");
        S = sc.nextInt();

        System.out.println("Enter Add Seconds: ");
        int S1=sc.nextInt();
        System.out.println("Enter Seconds to be Subtract: ");
        int S2=sc.nextInt();

        S += S1;

        if(S >=60){
            M += S/60;
            S = S%60;
        }
        else if(M >=60){
            H += M/60;
            M = M%60;
        }

        System.out.println("Time is : "+H + ":" +M +":" + S);

        S -=S2; 
        System.out.println("Time is : "+H + ":" +M +":" + S);


    }
}