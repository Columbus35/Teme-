public class TenLetters {

    private String addAllLetters(){
        EntryData word = new EntryData();
        String a = word.enterTheRestOfLetters();
        return a;
    }


    public String createWord() {
        String all = addAllLetters();
        String[] line = all.split(" ");
        String word = "";
        for (int a = 0; a < line.length; a++) {
            for (int b = 0; b < line.length; b++) {
                for (int c = 0; c < line.length; c++) {
                    for (int d = 0; d < line.length; d++) {
                        for (int e = 0; e < line.length; e++) {
                            for (int f = 0; f < line.length; f++) {
                                for (int g = 0; g < line.length; g++) {
                                    for (int h = 0; h < line.length; h++) {
                                        for (int i = 0; i < line.length; i++) {
                                            for (int j = 0; j < line.length; j++) {
                                                boolean a1 = false;
                                                boolean b1 = false;
                                                boolean c1 = false;
                                                boolean d1 = false;
                                                boolean e1 = false;
                                                boolean f1 = false;
                                                boolean g1 = false;
                                                boolean h1 = false;
                                                boolean i1 = false;
                                                if (a != b && a != c && a != d && a != e && a != f && a != g && a != h && a != i && a != j) {
                                                    a1 = true;
                                                }
                                                if (b != c && b != d && b != e && b != f && b != g && b != h && b != i && b != j) {
                                                    b1 = true;
                                                }
                                                if (c != d && c != e && c != f && c != g && c != h && c != i && c != j) {
                                                    c1 = true;
                                                }
                                                if (d != e && d != f && d != g && d != h && d != i && d != j) {
                                                    d1 = true;
                                                }
                                                if (e != f && e != g && e != h && e != i && e != j) {
                                                    e1 = true;
                                                }
                                                if (f != g && f != h && f != i && f != j) {
                                                    f1 = true;
                                                }
                                                if (g != h && g != i && g != j) {
                                                    g1 = true;
                                                }
                                                if (h != i && h != j) {
                                                    h1 = true;
                                                }
                                                if ( i != j) {
                                                    i1 = true;
                                                }
                                                if (a1 && b1 && c1 && d1 && e1 && f1 && g1 && h1 && i1) {
                                                    word += line[a];
                                                    word += line[b];
                                                    word += line[c];
                                                    word += line[d];
                                                    word += line[e];
                                                    word += line[f];
                                                    word += line[g];
                                                    word += line[h];
                                                    word += line[i];
                                                    word += line[j] + " ";
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return word;

    }

}
