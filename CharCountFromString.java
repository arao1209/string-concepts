package stringConcept;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CharCountFromString {

    public static void main(String[] args) {

        String word = "AneriAndTirth";

        CharCountFromString charCountFromString = new CharCountFromString();
        charCountFromString.getRepetativeCharAndCount(word);

    }

    private void getRepetativeCharAndCount(String word){

        Map<Character, Integer> charCount = new HashMap<>();

        for(int i=0;i<word.length();i++){
            char ch = word.toLowerCase().charAt(i);
            if(charCount.containsKey(ch)){
                charCount.put(ch, charCount.get(ch)+1);
            }
            else{
                charCount.put(ch, 1);
            }
        }

        charCount.forEach((i,j) -> {
            System.out.println("Char is: "+i + " Value is: "+j);
        });

    }

}

