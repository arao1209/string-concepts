package stringConcept;

//Java Program to Get a Character From the Given String


public class CharFromString {

    private boolean getCharFromString(char ch, String name){

        for(int i=0;i<name.length();i++){

            if(name.charAt(i) == ch){
                System.out.println(name.charAt(i));
                return true;
            }
        }
        return false;
    }

    private void getCharFromStringV2(char ch, String name){
        boolean flag = false;
        for(int i=0;i<name.length();i++){
            if(name.charAt(i) == ch){
                    System.out.println(name.charAt(i));
                    flag = true;
                    break;
                }
            }
        if(flag){
            System.out.println("Char found");
        }
        else{
            System.out.println("Not found "+ch);
        }
    }

    public static void main(String[] args) {

        String name = "Tirth";
        char ch = 'h';
        char ch1 = 'k';

        CharFromString charFromString = new CharFromString();
        if(charFromString.getCharFromString(ch1, name)){
            System.out.println("Char found");
        }
        else{
            System.out.println("Not found");
        }
        charFromString.getCharFromStringV2(ch, name);

    }

}
