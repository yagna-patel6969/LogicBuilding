import java.util.Scanner;

public class sumOfPdSpd {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int i,j;

        int arr[][] = new int[4][4];
        for( i = 0; i < 4; i++){
            for( j = 0; j < 4; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int spdSum=0;
        i=0;
        j=3;
        while(j>=0&&i<=4){
            spdSum += arr[i][j];
            i++;
            j--;
        }
        System.out.println("sum of secondary principal diadonal: "+spdSum);

        int pdSum=0;
        i=0;
        j=0;
        while(j<4&&i<4){
            pdSum += arr[i][j];
            i++;
            j++;
        }
        System.out.println("sum of  principal diadonal: "+pdSum);
    }
}
