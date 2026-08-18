import java.util.Scanner;

public class Training {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of student:");
        int size=in.nextInt();

        int arr[]=new int[size];

        System.out.println("Entre Student training hour");
        int i;
        for(i=0;i<size;i++){

            System.out.println("Enter student-"+(i+1)+"hour:");
            arr[i]=in.nextInt();

        }

        for(int j=0;j<size;j++){

            for(i=0;i<size-j-1;i++){

                if(arr[i]>arr[i+1]){

                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;  

                }

            }

        }

        // int diff[]=new int[size-1];
        int minDiffrence=arr[1]-arr[0];

        for(i=0;i<size-1;i++){

            if(arr[i]==arr[i+1]){
                minDiffrence=0;
                break;
            }
            
            int diffrance=arr[i+1]-arr[i];

            if(diffrance<minDiffrence){
                minDiffrence=diffrance;

            }

        }

        System.out.println("minimum hour:"+minDiffrence);

    }

}
