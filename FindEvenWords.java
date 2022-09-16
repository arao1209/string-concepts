package stringConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindEvenWords {

    public static void main(String[] args) {

        String senetence = "Tirthu donot like icecreams";
        FindEvenWords findEvenWords = new FindEvenWords();
        findEvenWords.findEvenWords(senetence);

    }

    private void findEvenWords(String sentence){


        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));

        for(int i=0;i<words.length;i++){

            if(words[i].length() % 2 == 0){

                System.out.println("Even Word: "+words[i]);

            }
            else{
                System.out.println("Odd Word: "+words[i]);
            }

        }

    }

}
