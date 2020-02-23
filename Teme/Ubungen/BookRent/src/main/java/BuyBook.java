import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BuyBook {
    static Component frame;
    private static Icon icon;

    private int checkIdNumber() {
        Random rnd = new Random();
        int x = 100000000 + rnd.nextInt(1000000000 - 100000000);
        return x;
    }

    private int checkIdNumber1() throws Exception {
        int z = 0;
        boolean number = false;
        do {
            int x = checkIdNumber();
            FileInputStream fis = new FileInputStream("Homework/Book.text");
            Scanner s = new Scanner(fis);
            boolean check = true;
            while (s.hasNext()) {
                String a = s.nextLine() + "\n";
                String[] line = a.split(" ");
                int y = Integer.parseInt(line[2]);
                if (x == y) {
                    number = true;
                    check = false;
                }
            }
            if (check) {
                z += x;
            }
        } while (number);
        return z;
    }

    private String enterPublisherBook() throws Exception{
        String s = (String) JOptionPane.showInputDialog(
                frame,
                "Pleas enter the publisher of the Book:\n",
                "Buy a new book",
                JOptionPane.PLAIN_MESSAGE,
                icon,
                null,
                "");
        if(s.length() > 15){
            throw new Exception("This publisher not exist");

        }
        return s;
    }

    private String enterAuthorBook() {
        String s = (String) JOptionPane.showInputDialog(
                frame,
                "Pleas enter the author of the Book:\n",
                "Buy a new book",
                JOptionPane.PLAIN_MESSAGE,
                icon,
                null,
                "");
        return s;
    }

    private String enterTitleBook() {
        String s = (String) JOptionPane.showInputDialog(
                frame,
                "Pleas enter the title of the Book:\n",
                "Buy a new book",
                JOptionPane.PLAIN_MESSAGE,
                icon,
                null,
                "");
        return s;
    }

    private int enterYearBook() throws Exception{
        String s = (String) JOptionPane.showInputDialog(
                frame,
                "Pleas enter the year of the Book:\n",
                "Buy a new book",
                JOptionPane.PLAIN_MESSAGE,
                icon,
                null,
                "");
        LocalDate date = LocalDate.now();
        String y = date.toString();
        String line[] = y.split("-");
        int z = Integer.parseInt(line[0]);
        int x = Integer.parseInt(s);
        if(x < 1860 || x > z){
            throw new Exception("The book can't be written in this year");
        }
        return x;
    }

    private int setTypeBook() {
        Object[] options = {"Kindel",
                "Audio book",
                "Hard cover",
                "Paper book"};

        int n = JOptionPane.showOptionDialog(frame,
                "What a type of book do you want buy",
                "Online book store",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[3]);
        return n;
    }

    private String settTypeBook1() {
        Object[] possibilities = {"paper book", "hard cover", "audio book", "kindel"};
        String s = (String) JOptionPane.showInputDialog(
                frame,
                "Pleas enter the fuel type of the car",
                "Buy a new book",
                JOptionPane.INFORMATION_MESSAGE,
                icon,
                possibilities,
                "paper book");
        return s;
    }

    public void buyBook() throws Exception {
        int x = setTypeBook();
        String book = "";
        switch (x) {
            case 0:
                book += (buyKindle());
                break;
            case 1:
                book += (buyAudio());
                break;
            case 2:
                book += (buyHardCover());
                break;
            case 3:
                book += (buyPaperBook());
                break;
        }
        File file1 = new File("Homework/Book.text");
        File file2 = new File("Homework/Book1.text");
        FileWriter fw = new FileWriter(file1, true);
        FileWriter fw2 = new FileWriter(file2, true);
        fw.write(book + "\n");
        fw.close();
        fw2.write(book + "\n");
        fw2.close();
    }

    private String buyKindle() throws Exception {
        ArrayList<Kindle> library = new ArrayList<Kindle>();
        Kindle book = new Kindle(checkIdNumber1(), enterPublisherBook(), enterAuthorBook(), enterTitleBook(), enterYearBook(), settTypeBook1());
        library.add(book);
        String x = "";
        book.returnKindelType();
        for (int i = 0; i < library.size(); i++) {
            x += library.get(i);
        }
        return x;
    }

    private String buyHardCover() throws Exception {
        ArrayList<HardCover> library = new ArrayList<HardCover>();
        HardCover book = new HardCover(checkIdNumber1(), enterPublisherBook(), enterAuthorBook(), enterTitleBook(), enterYearBook(), settTypeBook1());
        library.add(book);
        String x = "";
        book.returnHardCoverType();
        for (int i = 0; i < library.size(); i++) {
            x += library.get(i);
        }
        return x;
    }

    private String buyAudio() throws Exception {
        ArrayList<Audiobook> library = new ArrayList<Audiobook>();
        Audiobook book = new Audiobook(checkIdNumber1(), enterPublisherBook(), enterAuthorBook(), enterTitleBook(), enterYearBook(), settTypeBook1());
        library.add(book);
        String x = "";
        book.returnAudioType();
        for (int i = 0; i < library.size(); i++) {
            x += library.get(i);
        }
        return x;
    }

    private String buyPaperBook() throws Exception {
        ArrayList<PaperBook> library = new ArrayList<PaperBook>();
        PaperBook book = new PaperBook(checkIdNumber1(), enterPublisherBook(), enterAuthorBook(), enterTitleBook(), enterYearBook(), settTypeBook1());
        library.add(book);
        String x = "";
        book.returnBookType();
        for (int i = 0; i < library.size(); i++) {
            x += library.get(i);
        }
        return x;
    }
}
