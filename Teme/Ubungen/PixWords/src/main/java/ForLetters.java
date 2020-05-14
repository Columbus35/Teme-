public class ForLetters {

    private String addAllLetters(){
        EntryData word = new EntryData();
        String a = word.enterTheRestOfLetters();
        return a;
    }


    public String createWord(){
        String all = addAllLetters();
        String [] line = all.split(" ");
        String word = "";
        for(int a = 0; a < line.length; a++){
            for (int b = 0; b < line.length; b++){
                for (int c = 0; c < line.length; c++){
                    for (int d = 0; d < line.length; d++){
                        boolean a1 = false;
                        boolean b1 = false;
                        boolean c1 = false;
                        if(a != b && a != c && a != d){
                            a1= true;
                        }
                        if( b != c && b != d){
                            b1= true;
                        }
                        if( c != d){
                            c1= true;
                        }
                        if(a1 && b1 && c1){
                            word += line[a];
                            word += line[b];
                            word += line[c];
                            word += line[d] + " ";
                        }
                    }
                }
            }
        }
        return word;
    }


}
