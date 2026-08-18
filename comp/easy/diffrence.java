
public class diffrence {
    public static void main(String[] args) {
        
        int arr[]={5,1,9,7,1,5,3};

        int i,j;

        for(i=0;i<arr.length;i++){
            for(j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        // System.out.println(Arrays.toString(arr));
        int secondSmallest=arr[0];
        int secondLagest=arr[arr.length-1];
        int k=0;
        int l=arr.length-1;
        boolean foundLargest=false,foundSmallest=false;

        while(k < arr.length - 1){

            if(arr[k]!=arr[k+1]){
                secondSmallest=arr[k+1];
                foundSmallest=true;
                break;
            }
            
            k++;
        }

        while(l>0){
            if(arr[l]!=arr[l-1]){
                secondLagest=arr[l-1];
                foundLargest=true;
                break;
            }
            l--;
        }

        if(foundLargest && foundSmallest){
            int diff=secondLagest-secondSmallest;
            System.out.println("diffrance is: "+diff);
        }
        else{
            System.out.println("Second smallest or second largest does not exist");
        }

    }
}
