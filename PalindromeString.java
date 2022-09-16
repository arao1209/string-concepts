package stringConcept;

public class PalindromeString {

    public static void main(String[] args) {

        String word = "aba";
        PalindromeString palindromeString = new PalindromeString();
//        boolean check = palindromeString.checkPalindromeString(word);
        boolean check = palindromeString.checkPalindromeStringV2(word);
        if(check){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }

    private boolean checkPalindromeString(String word){

        boolean flag = false;
        for(int i=0, j=word.length()-1 ; i<=j; i++, j--){

            if((word.charAt(i) != word.charAt(j))){

                return false;

            }


        }
        return true;
    }

    private boolean checkPalindromeStringV2(String word){
//        StringBuilder s=new StringBuilder(word);
//        s=s.reverse();
//
//        if(s.equals(word))return true;
//        return false;
        return word.equals((new StringBuilder(word)).reverse().toString());
    }
}
