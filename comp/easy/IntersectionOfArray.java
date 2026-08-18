import java.util.Arrays;

public class IntersectionOfArray {
    public static void main(String[] args) {
        
        int arr1[]={1,2,1,3,1};
        int arr2[]={3,1,3,4,1};
        int i,j;

        for( j=0;j<arr1.length-1;j++){
            for(i=0;i<arr1.length-j-1;i++){
                if(arr1[i]>arr1[i+1]){
                    int temp=arr1[i];
                    arr1[i]=arr1[i+1];
                    arr1[i+1]=temp;
                }
            }
        }

        for( j=0;j<arr2.length-1;j++){
            for(i=0;i<arr2.length-j-1;i++){
                if(arr2[i]>arr2[i+1]){
                    int temp=arr2[i];
                    arr2[i]=arr2[i+1];
                    arr2[i+1]=temp;
                }
            }
        }

        int intersection[]=new int[arr1.length];
        int k=0;

        for(i = 0; i < arr1.length; i++){

            for(j = 0; j < arr2.length; j++){

                if(arr1[i] == arr2[j]){

                    boolean duplicate = false;

                    for(int x = 0; x < k; x++){
                        if(intersection[x] == arr1[i]){
                            duplicate = true;
                            break;
                        }
                    }

                    if(!duplicate){
                        intersection[k] = arr1[i];
                        k++;
                    }

                    break;
                }
            }
        }


        for(i = 0; i < k; i++){
            System.out.print(intersection[i] + " ");
        }

    }
}
