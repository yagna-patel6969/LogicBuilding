
public class NumberOfChar {
    
    public static void main(String[] args) {
        
        String str="geeksforgeeks";

        char ch='e';
        int count=0,vowel=0,consonants=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='e'){
                count++;
            }

            if(str.charAt(i)>='a' && str.charAt(i)<='z'){
                if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                vowel++;
                }
                
                else{
                    consonants++;
                }
            }
        }

        System.out.println(count);
        System.out.println("Vowels: " + vowel);
        System.out.println("Consonants: " + consonants);

    }

}
