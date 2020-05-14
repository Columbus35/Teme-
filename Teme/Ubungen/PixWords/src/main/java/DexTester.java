import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Scanner;

public class DexTester{


    private String dexReader() throws Exception{
        FileInputStream fis1 = new FileInputStream("Homework/Dex.text");
        Scanner c = new Scanner(fis1);
        String a = "";
        while(c.hasNext()){
            a += c.nextLine() + "\n";
        }
        return a;
    }

    protected HashMap hasMapCreated() throws Exception {
        String a = dexReader();
        HashMap<String, Integer> dex = new HashMap<String, Integer>();
        String [] line = a.split("\n");
        for(int i = 0; i < line.length; i++){
            dex.put(line[i], i);
        }
        return dex;
    }





}
