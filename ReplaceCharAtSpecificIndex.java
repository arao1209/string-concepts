package stringConcept;

public class ReplaceCharAtSpecificIndex {

    public static void main(String[] args) {

        String word = "Tirth";

        ReplaceCharAtSpecificIndex replaceCharAtSpecificIndex = new ReplaceCharAtSpecificIndex();
        replaceCharAtSpecificIndex.replaceChar(word);
    }

    private void replaceChar(String word){

        int index = 3;
        char ch = 'a';

        System.out.println("Original Word: "+word);

//        word = word.substring(0,3)+ch+word.substring(4);
//
//        System.out.println("New Word": +word);

        StringBuffer stringBuffer = new StringBuffer(word);
        stringBuffer.setCharAt(0, 'A');
        System.out.println("New Word: " +stringBuffer);


    }

}
