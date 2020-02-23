import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class FirstPage {

    static Component frame;

    public void createFile() throws Exception {
        File folder1 = new File("Homework");
        File file1 = new File("Homework/Book.text");
        File file2 = new File("Homework/Book1.text");
        File file3 = new File("Homework/Book2.text");
        if (folder1.exists()) {
            System.out.println("");
        } else folder1.mkdir();
        if (file1.exists()) {
        } else file1.createNewFile();
        if (file2.exists()) {
        } else file2.createNewFile();
        if (file3.exists()) {
        } else file3.createNewFile();
    }

    public void visitStore() throws Exception{
        BuyBook test = new BuyBook();
        Object[] options = {"Buy a book",
                "Check the book list"};

        int n = JOptionPane.showOptionDialog(frame,
                "What is your next step?",
                "Online book store",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[1]);
        switch (n){
            case 0:
                test.buyBook();
                visitStore();
                break;
            case 1:
                checkAllList();
                break;
        }
    }

    private void checkAllList() throws Exception {
        FileInputStream fis1 = new FileInputStream("Homework/Book.text");
        Scanner c = new Scanner(fis1);
        ArrayList book = new ArrayList();
        while (c.hasNext()){
            book.add(c.nextLine() + "\n");
        }
        Object[] options = {"Rent a book",
                "Return a book"};
        RentBook rent = new RentBook();
        ReturnBook ret = new ReturnBook();
        int n = JOptionPane.showOptionDialog(frame,
                book,
                "Online book store",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[1]);
        switch (n){
            case 0:
                rent.searchIdNumber();
                break;
            case 1:
                ret.searchIdNumber();
                break;
        }
    }








}
