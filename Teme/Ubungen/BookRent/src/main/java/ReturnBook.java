import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ReturnBook {
        static Component frame;
        private static Icon icon;

        private int listWhitFreeBooks() throws Exception {
            Object[] options = {"ID number",
                    "Publisher",
                    "Author",
                    "Title"};

            int n = JOptionPane.showOptionDialog(frame,
                    "Please select the search method",
                    "Online book store",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    options,
                    options[3]);
            return n;
        }

        private int enterId() throws Exception {
            int y = listWhitFreeBooks();
            ArrayList list = new ArrayList();
            switch (y){
                case 0:
                    list.add(checkIdList());
                    break;
                case 1:
                    list.add(checkPublisherList());
                    break;
                case 2:
                    list.add(checkAuthorList());
                    break;
                case 3:
                    list.add(checkTitleList());
                    break;
            }
            String s = (String) JOptionPane.showInputDialog(
                    frame,
                    list + "\n" +
                            "Please enter the ID number from the book",
                    "Return a book",
                    JOptionPane.PLAIN_MESSAGE,
                    icon,
                    null,
                    "");
            int x = Integer.parseInt(s);
            return x;
        }

        public void searchIdNumber() throws Exception {
            FileInputStream fis = new FileInputStream("Homework/Book2.text");
            Scanner c = new Scanner(fis);
            ArrayList rentBook = new ArrayList();
            String rented = "";
            int x = enterId();
            while (c.hasNext()) {
                String a = c.nextLine() + "\n";
                String line[] = a.split(" ");
                int y = Integer.parseInt(line[2]);
                if (x == y) {
                    rented += a;
                } else {
                    rentBook.add(a);
                }

            }
            File file1 = new File("Homework/Book2.text");
            FileWriter fw1 = new FileWriter(file1);
            File file2 = new File("Homework/Book1.text");
            FileWriter fw2 = new FileWriter(file2, true);
            String rented1 = "";
            for(int i = 0; i < rentBook.size(); i++){
                rented1 += rentBook.get(i);
            }
            fw1.write(rented1);
            fw1.close();
            fw2.write(rented);
            fw2.close();
            JOptionPane.showMessageDialog(frame,
                    "You return this book :" + "\n" + rented);
            back();

        }

        private ArrayList checkIdList() throws Exception{
            FileInputStream file = new FileInputStream("Homework/Book2.text");
            ArrayList list = new ArrayList();
            Scanner c = new Scanner(file);
            while(c.hasNext()){
                list.add(c.nextLine() + "\n");
            }
            return list;
        }

        private ArrayList checkPublisherList() throws Exception{
            FileInputStream file = new FileInputStream("Homework/Book2.text");
            ArrayList list = new ArrayList();
            Scanner c = new Scanner(file);
            String s = (String) JOptionPane.showInputDialog(
                    frame,
                    "Pleas enter the publisher of the Book:\n",
                    "Rent a book",
                    JOptionPane.PLAIN_MESSAGE,
                    icon,
                    null,
                    "");
            char line[] = s.toCharArray();
            while (c.hasNext()){
                String x = c.nextLine() + "\n";
                String book[] = x.split(" ");
                char line1[] = book[4].toCharArray();
                boolean letter = false;
                boolean letter1 = true;
                for(int i = 0; i < line.length; i++){
                    if(line[i] == line1[i]){
                        letter = true;
                    } else{ letter1 = false;}
                }
                if(letter && letter1){
                    list.add(x);
                }
            }
            return list;
        }

        private ArrayList checkAuthorList() throws Exception{
            FileInputStream file = new FileInputStream("Homework/Book2.text");
            ArrayList list = new ArrayList();
            Scanner c = new Scanner(file);
            String s = (String) JOptionPane.showInputDialog(
                    frame,
                    "Pleas enter the publisher of the Book:\n",
                    "Rent a book",
                    JOptionPane.PLAIN_MESSAGE,
                    icon,
                    null,
                    "");
            String b = " " + s;
            char line[] = b.toCharArray();
            while (c.hasNext()){
                String x = c.nextLine() + "\n";
                String book[] = x.split("=");
                char line1[] = book[3].toCharArray();
                boolean letter = false;
                boolean letter1 = true;
                for(int i = 0; i < line.length; i++){
                    if(line[i] == line1[i]){
                        letter = true;
                    } else{ letter1 = false;}
                }
                if(letter && letter1){
                    list.add(x);
                }
            }
            return list;
        }

        private ArrayList checkTitleList() throws Exception{
            FileInputStream file = new FileInputStream("Homework/Book2.text");
            ArrayList list = new ArrayList();
            Scanner c = new Scanner(file);
            String s = (String) JOptionPane.showInputDialog(
                    frame,
                    "Pleas enter the publisher of the Book:\n",
                    "Return a book",
                    JOptionPane.PLAIN_MESSAGE,
                    icon,
                    null,
                    "");
            char line[] = s.toCharArray();
            while (c.hasNext()){
                String x = c.nextLine() + "\n";
                String book[] = x.split(" ");
                char line1[] = book[9].toCharArray();
                boolean letter = false;
                boolean letter1 = true;
                for(int i = 0; i < line.length; i++){
                    if(line[i] == line1[i]){
                        letter = true;
                    } else{ letter1 = false;}
                }
                if(letter && letter1){
                    list.add(x);
                }
            }
            return list;
        }

        private void back() throws Exception{
            FirstPage site = new FirstPage();
            Object[] options = {"Back to the first page",
                    "Leave the site"};

            int n = JOptionPane.showOptionDialog(frame,
                    "Please select the next steep",
                    "Online book store",
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    options,
                    options[1]);
            switch (n){
                case 0:
                    site.visitStore();
                    break;
            }
        }
    }


