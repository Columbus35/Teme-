import javax.swing.*;
import java.awt.*;

public class Audiobook extends Book {
    static Component frame;
    public Audiobook(int isbn, String publisher, String author, String title, int year, String type) {
        super(isbn, publisher, author, title, year, type);
    }

    public void returnAudioType(){
        JOptionPane.showMessageDialog(frame,
                "Do you buy an Audio Book");
    }


}
