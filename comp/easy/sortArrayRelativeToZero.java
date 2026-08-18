import java.util.Scanner;

public class sortArrayRelativeToZero {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int size=in.nextInt();

        int arr[]=new int[size];

        System.out.println("Entre Element's of Array");
        int i;
        for(i=0;i<size;i++){

            System.out.println("Enter element-"+(i+1)+": ");
            arr[i]=in.nextInt();

        }

        int j=0;
        for(i=0;i<size;i++){

            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }

        }

        for(i=0;i<size;i++){

            System.out.println("Enter element-"+(i+1)+"is: "+arr[i]);

        }

    }

}
