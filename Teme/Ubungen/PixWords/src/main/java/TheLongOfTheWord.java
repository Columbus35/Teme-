import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

public class TheLongOfTheWord extends DexTester{
    private int size = 0;
    private int rest = 0;
    protected int hasMap = 0;
    static Component frame;

    public void checkSize() {
        EntryData sizeO = new EntryData();
        int i = sizeO.checkHowLongIsTheWord();
        size = i;
    }

    protected String calculateSizeOfWord() {
        String endWord = "";
        String positionLetters = checkPositionLetters();
        String knowLetters = checkAllKnowLetters();
        String[] positionLetters1 = positionLetters.split(" ");
        rest = size - positionLetters1.length;
        String allLetters = writeNewWord();
        String[] knowLetters1 = knowLetters.split(" ");
        String[] line = allLetters.split(" ");
        for (int a = 0; a < line.length; a++) {
            String[] line1 = line[a].split(" ");
            for (int b = 0; b < line1.length; b++) {
                String[] allLetters1 = line1[b].split("");
                int[] word = new int[size];
                int j = 0;
                for (int i = 0; i < size; i++) {
                    boolean nr = false;
                    boolean nr1 = false;
                    if (j < positionLetters1.length - 1) {
                        nr = true;
                    }
                    if (i == Integer.parseInt(positionLetters1[j]) - 1) {
                        word[i] = 1;
                        nr1 = true;
                    } else {
                        word[i] = 0;
                    }
                    if (nr && nr1) {
                        j++;
                    }

                }
                int x = 0;
                int y = 0;
                for (int i = 0; i < size; i++) {
                    if (word[i] == 0) {
                        endWord += allLetters1[x];
                        x++;
                    } else if (word[i] == 1) {
                        endWord += knowLetters1[y];
                        y++;
                    }

                }
                endWord += " ";
            }
        }
        return endWord;
    }


    protected String calculateAllLetters() {
        String endWord = "";
        rest = size - rest;
        String allLetters = writeNewWord();
        String[] line = allLetters.split(" ");
        for (int i = 0; i < line.length; i++) {
            String[] allLetters1 = line[i].split(" ");
            for (int j = 0; j < allLetters1.length; j++) {
                endWord += allLetters1[j];
            }
         endWord += " ";
        }
      return endWord;
    }

    private String checkPositionLetters() {
        EntryData position = new EntryData();
        String i = position.checkInWitchPositionAreTheLetters();
        return i;
    }

    private String checkAllKnowLetters() {
        EntryData position = new EntryData();
        String i = position.enterTheKnowLetters();
        return i;
    }

    private String writeNewWord() {
        String a = "";
        switch (rest) {
            case 3:
                TreeLetters tree = new TreeLetters();
                a = tree.createdWord();
                break;
            case 4:
                ForLetters for1 = new ForLetters();
                a = for1.createWord();
                break;
            case 5:
                FiveLetters five = new FiveLetters();
                a = five.createWord();
                break;
            case 6:
                SixLetters six = new SixLetters();
                a = six.createWord();
                break;
            case 7:
                SevenLetters seven = new SevenLetters();
                a = seven.createWord();
                break;
            case 8:
                eightLetters eight = new eightLetters();
                a = eight.createWord();
                break;
            case 9:
                NineLetters nine = new NineLetters();
                a = nine.createWord();
                break;
            case 10:
                TenLetters ten = new TenLetters();
                a = ten.createWord();
                break;
            case 11:
                ElevenLetters eleven = new ElevenLetters();
                a = eleven.createWord();
                break;
            case 12:
                TwelfthLetters twelfth = new TwelfthLetters();
                a = twelfth.createWord();
                break;
        }
        return a;
    }

    public void checkKnowLetters() throws Exception {
        EntryData nowLetters = new EntryData();
        int i = nowLetters.checkTheKnowLetters();
        switch (i) {
            case 0:
                crackTheWord();
                break;
            case 1:
                hasMap = 1;
                crackTheWord();
                break;
        }
    }

    public void crackTheWord() throws Exception{
        HashMap<String, Integer> dex = hasMapCreated();
        String endWord = "";
        switch (hasMap){
            case 0 :
                endWord += calculateSizeOfWord();
                break;
            case 1 :
                endWord += calculateAllLetters();
        }
        String [] line = endWord.split(" ");
        String word = "";
        for(int i = 0; i < line.length; i++){
          boolean crack = dex.containsKey(line[i]);
          if(crack){
              word += line[i] + "\n";
          }
        }
        JOptionPane.showMessageDialog(frame,
                word);
    }

}



