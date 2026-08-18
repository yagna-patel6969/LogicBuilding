
public class rearrange {
    
    public static void main(String[] args) {
        
        int arr[]={10,20,30,40};

        int n = arr.length/2;

        int firstHalf[]=new int[n];
        int secondHalf[]=new int[n];

        int i=0;

        while(i<n){

            firstHalf[i]=arr[i];
            secondHalf[i]=arr[i+n];
            i++;
        }

        for(int j=0;j<n;j++){

            System.out.println(firstHalf[j]);
            System.out.println(secondHalf[j]);

        }

    }

}
