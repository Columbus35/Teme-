import javax.swing.*;
import java.awt.*;

public class PaperBook extends Book {
    static Component frame;
    public PaperBook(int isbn, String publisher, String author, String title, int year, String type) {
        super(isbn, publisher, author, title, year, type);
    }

    public void returnBookType(){
        JOptionPane.showMessageDialog(frame,
                "Do you buy an Paper Book");
    }
}
