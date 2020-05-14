import java.io.File;

public class Starting {

    public static void main(String[] args) throws Exception  {
         EntryData message = new EntryData();
         message.createdFirstMessage();
         TheLongOfTheWord execute = new TheLongOfTheWord();
         execute.checkSize();
         execute.checkKnowLetters();
    }



}
