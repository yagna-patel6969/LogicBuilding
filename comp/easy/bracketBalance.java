
public class bracketBalance{

    public static void main(String[] args) {
        
        String str = "{[()]}";

        int lenght = str.length();

        boolean balanced = true;
        int j=lenght-1;
        int i=0;
        

            while(j>i){

                if(str.charAt(i)!=str.charAt(j)){

                    balanced=false;
                    break;


                }
                i++;
                j--;
            }

        if(balanced){
            System.out.println("Balanced");
        }
        else{
            System.out.println("not Balanced");
        }

    }

}