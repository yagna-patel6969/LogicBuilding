package comp.medium; 

public class SepeByPluse {
    public static void main(String[] args) {
        
        String str="1+1+3+1+3";

        String parts[]=str.split("\\+");
        int i,j;

        int arr[]=new int[parts.length];

        for(i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(parts[i]);
        }

        for( j = 0; j < arr.length - 1; j++) {
            for( i = 0; i < arr.length - j - 1; i++) {

                if(arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        
        String finalString="";
        
        for(i=0;i<arr.length;i++){
            finalString+=arr[i];
            if(i<arr.length-1){
                finalString+=" + ";
            }
        }

        System.out.println(finalString);

    }
}
