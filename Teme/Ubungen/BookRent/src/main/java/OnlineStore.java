import javax.swing.*;
import java.awt.*;

public class OnlineStore {
    static Component frame;

    public static void main(String[] args) throws Exception {
        FirstPage first = new FirstPage();
        first.createFile();
        JOptionPane.showMessageDialog(frame,
                "Welcome in this online book store.");
        first.visitStore();
    }



}
