import java.util.Scanner;

public class DuplicateNumber {

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

        for(int j=0;j<size-1;j++){
            for(i=0;i<size-j-1;i++){
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }


        int extra=-1,count=0;
        for(i=0;i<size-1;i++){
            if(arr[i]==arr[i+1]){
                if(extra==arr[i]){
                    continue;
                }
                else{
                    count++;
                    extra=arr[i];
                }
            }
            
        }

        System.out.println("number of duplicate is:"+count);

    }

}


