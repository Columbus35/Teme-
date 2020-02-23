import javax.swing.*;
import java.awt.*;

public class HardCover extends Book {
    static Component frame;
    public HardCover(int isbn, String publisher, String author, String title, int year, String type) {
        super(isbn, publisher, author, title, year, type);
    }

    public void returnHardCoverType(){
        JOptionPane.showMessageDialog(frame,
                "Do you buy an Hard Cover");
    }

}
