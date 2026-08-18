public class NumberOfCase {
    
    public static void main(String[] args) {
        
        String str="Introduction to Python";

        int upper=0,lower=0;

        for(int i=0;i<str.length();i++){

            if(str.charAt(i)>='a'&&str.charAt(i)<='z'){
                lower++;
            }
            else if(str.charAt(i)>='A'&&str.charAt(i)<='Z'){
                upper++;
            }

            
        }
        
        System.out.println("Upper Case: " + upper);
        System.out.println("lowe case: " + lower);
    }

}
