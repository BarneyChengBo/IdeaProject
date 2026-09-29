package myprogramupdate;

public class CharRowWordChecker {
    // Den första metoden är att räkna hur många element
    // som finns i listan och de är inte tomma.
    // Det innebärar hur många rad har vi skrivit.

    public int getRow(String[] theInput) {
        int rowValue = 0;
        for (int i = 0; i < theInput.length; i++){
            if (theInput[i] != null) {
                rowValue ++;
            }
        }
        return rowValue;
    }

    //Den andra metoden är att räkna hur många tecken man har skrivet.
    //Det räkna hur många tecken som finns i varje element.
    //Seden lägger den ihop antalet av alla tecken.


    public int getChar(String[] theInput){
        int charValue = 0;

        for (int i = 0; i < theInput.length; i++){
            if (theInput[i] != null) {
                charValue += theInput[i].length();
            }
        }
        return charValue;
    }


    public int getWord(String[] theInput){
        int wordValue = 0;

        for (int i = 0; i < theInput.length; i++){
            if (theInput[i] != null) {
                String[] wordArray = theInput[i].split(" ");
                wordValue += wordArray.length;
            }
        }

        return wordValue;
    }

    public String getLongestWord(String[] theInput){
        String longestWord = "";
        int wordValue = 0;

        for (int i = 0; i < theInput.length; i++){
            if (theInput[i] != null) {
                String[] wordArray = theInput[i].split(" ");
                    for (int j = 0; j < wordArray.length; j++ ){
                        if (wordArray[j].length() > longestWord.length()){
                            longestWord = wordArray[j];
                        }
                    }
                wordValue += wordArray.length;
            }
        }
        return longestWord;
    }

    public boolean detectStop(String[] theInput) {
        boolean wordStop = true;
        for (int i = 0; i < theInput.length; i++){
            if (theInput[i] != null && theInput[i].equals("stop") ) {
                wordStop = false;

            }
        }
        return wordStop;

    }







}
