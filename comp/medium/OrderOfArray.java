package comp.medium;

import java.util.Arrays;

public class OrderOfArray {
    public static void main(String[] args) {
        
        int arr[]={4,2,7,1};
        int j,i;

        for(j=0;j<4;j++){
            for(i=0;i<arr.length-j-1;i++){
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }

            }
        }

        System.out.println("ascending Array"+Arrays.toString(arr));

        
        for(j=0;j<4;j++){
            for(i=0;i<arr.length-j-1;i++){
                if(arr[i]<arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
                
            }
        }
        
        System.out.println("Descending Array:"+Arrays.toString(arr));

    }
}
