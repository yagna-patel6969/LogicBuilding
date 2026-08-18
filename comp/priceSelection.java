package comp;
import java.lang.String;

public class priceSelection {
    
    public static void main(String[] args) {

        int k=2,n=4;
        
        String input[] = {"500:Electronics","400:Electronics", "300:Electronics","200:Sports", "150:Beauty", "100:Beauty"};

        for(int i=0 ; i<6;i++){
            System.out.println(input[i]);
        }
        
        int price[] = new int[100];
        String category[] = new String[100];
        // String parts[]=new String[100];

        for(int i=0 ; i<6 ; i++){

            String parts[]=input[i].split(":");
            price[i]=Integer.parseInt(parts[0]);
            category[i]=parts[1];
        }

        for(int i=0;i<6;i++){
            System.out.println(price[i]);
            System.out.println(category[i]);
        }

        long maxPrice=0;
        int i=0;
        

            while(n>0){

                if(category[i].equals(category[i+1])){
                    if(price[i]>price[i+1]){
                        maxPrice+=price[i];
                    }
                    else{
                        maxPrice+=price[i+1];
                    }
                }

                else{

                    maxPrice+=price[i+1];

                }

                n--;
                i++;
            }

            
        
        
        System.out.println(maxPrice);
    }

}
