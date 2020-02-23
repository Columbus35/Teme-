import javax.swing.*;
import java.awt.*;

public class Kindle extends Book{
    static Component frame;
    public Kindle(int isbn, String publisher, String author, String title, int year, String type) {
        super(isbn, publisher, author, title, year, type);
    }

    public void returnKindelType(){
        JOptionPane.showMessageDialog(frame,
                "Do you buy an Kindle");
    }

}
