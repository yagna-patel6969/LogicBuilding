import java.util.Scanner;

public class ReverseElement {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number of Elements:");
        int size = in.nextInt();

        int i;
        int arr[]=new int[size];
        System.out.println("Enter array elements:");
        for(i=0;i<size;i++){
            System.out.println("Enter element-"+(i+1));
            arr[i]=in.nextInt();
        }

        for(i=0;i<size/2;i++){
            int temp=arr[i];
            arr[i]=arr[(size-1)-i];
            arr[(size-1)-i]=temp;
        }

        for(i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }

    }

}
