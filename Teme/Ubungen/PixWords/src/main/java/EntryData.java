import javax.swing.*;
import java.awt.*;


public class EntryData {

    static Component frame;
    Icon icon;

    public void createdFirstMessage() {

        JOptionPane.showMessageDialog(frame,
                "Welcome to pixWords hacker :)");
    }

    public int checkHowLongIsTheWord() {

        String s = (String) JOptionPane.showInputDialog(
                frame,
                "Please enter the number from keyboard:\n",
                "How many letters contains the word?",
                JOptionPane.PLAIN_MESSAGE,
                icon,
                null,
                "");
        int number = Integer.parseInt(s);
        return number;
    }

    public String checkInWitchPositionAreTheLetters() {
        String s = (String) JOptionPane.showInputDialog(
                frame,
                "Please enter the numbers with space between:\n",
                "PLease enter the position of the known letters",
                JOptionPane.PLAIN_MESSAGE,
                icon,
                null,
                "");
        return s;
    }

    public String enterTheKnowLetters() {
        String s = (String) JOptionPane.showInputDialog(
                frame,
                "Please enter the known letters with space between:\n",
                "PLease enter the known letters",
                JOptionPane.PLAIN_MESSAGE,
                icon,
                null,
                "");
        return s;
    }

    public String enterTheRestOfLetters() {
        String s = (String) JOptionPane.showInputDialog(
                frame,
                "Please enter the rest of letters with space between:\n",
                "PLease enter the rest of letters",
                JOptionPane.PLAIN_MESSAGE,
                icon,
                null,
                "");
        return s;

    }

    public int checkTheKnowLetters(){
        Object[] options = {"Yes",
                "No"};

        int n = JOptionPane.showOptionDialog(frame,
                "Please select yes or no",
                "Do you have letters that do you know?",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[1]);
        return n;
    }
}
