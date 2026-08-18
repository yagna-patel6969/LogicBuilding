package comp.easy;
import java.util.Arrays;
import java.util.Scanner;
public class targetSum {
    
    public static void main(String[] args) {
        
        int arr[]={3,5,1,7};
        int target=6;

        for(int i=0 ; i<arr.toString().length();i++){

            if(arr[i]+arr[i+1]==target){

                System.out.println("index:"+i);
                System.out.println("index:"+(i+1));

            }

        }

    }

}
