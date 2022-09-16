package stringConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TrimSpace {

    public static void main(String[] args) {

        String word = "Tirth  ";
        TrimSpace trimSpace = new TrimSpace();
       // trimSpace.trimSpaceFromString(word);
        trimSpace.trimSpaceFromStringV2(word);


    }

    private void trimSpaceFromString(String word){

        List<Character> wordArray= new ArrayList<>();


        for(int i=0;i<word.length()-1;i++){
            wordArray.add(word.charAt(i));
        }


        for(int i=word.length()-2;i>0;i--){

           if(wordArray.get(i)==' '){
               wordArray.remove(i);
           }
           else
           {break;}
        }

        System.out.println(String.valueOf(wordArray));

       }

    private void trimSpaceFromStringV2(String word){

        StringBuilder stringBuilder = new StringBuilder();


        for(int i=0;i<word.length();i++){
            if(word.charAt(i) == ' '){

                stringBuilder.deleteCharAt(i);
            }
            else{
                stringBuilder.append(word.charAt(i));
            }

        }
        System.out.println(stringBuilder);

    }


}


